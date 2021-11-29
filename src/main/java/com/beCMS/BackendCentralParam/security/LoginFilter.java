package com.beCMS.BackendCentralParam.security;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.UserRepository;
import com.beCMS.BackendCentralParam.security.model.AccountCredentials;
import com.beCMS.BackendCentralParam.security.services.AuthenticationService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

public class LoginFilter extends AbstractAuthenticationProcessingFilter {
    private UserRepository repository;


    public LoginFilter(final String url, final AuthenticationManager authManager,
            org.springframework.context.ApplicationContext context) {

        super(new AntPathRequestMatcher(url));
        setAuthenticationManager(authManager);
        logger.info("onLoginFilter");
        this.repository = context.getBean(UserRepository.class);
    }

    @Override
    public Authentication attemptAuthentication(final HttpServletRequest req, final HttpServletResponse res)
            throws IOException, ServletException {
        final AccountCredentials creds = new ObjectMapper().readValue(req.getInputStream(), AccountCredentials.class);
        logger.info("attemptAuthentication");

        Authentication authentication = null;

        // if counter > 3 akun anda terblokir, mohon hubungi PIC SHF
        // int a = repository; 
        // String str1 = Integer.toString(a); 
       
        System.out.println("Jumlah Count" + repository.countCounter(creds.getUsername()));
        System.out.println("Jumlah Login" + repository.cekLogin(creds.getUsername()));
        String cok = repository.cekLoginExpired(creds.getUsername());
        Date date = new Date() ;
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm") ;
        dateFormat.format(date);
        System.out.println("JAM : "+dateFormat.format(date));
        
       
        
        if (repository.cekUser(creds.getUsername()) == null) {
            repository.simpanCounter(creds.getUsername());
            Map map = new HashMap();
            map.put("succeed", "Fail !");
            map.put("message", "Username / Password Salah");

            String authString = new Gson().toJson(map);

            PrintWriter out = res.getWriter();
            res.setStatus(400);
            res.setContentType("application/json");
            res.setCharacterEncoding("UTF-8");
            out.print(authString);
            out.flush();

            return authentication;
        } 
        else {
           
            if (repository.countCounter(creds.getUsername()) >= 3) {
                logger.info("USER TERBLOKIR ! ");
                // if user not found then send message succeed :false

                Map map = new HashMap();
                // gagal login counter
                repository.simpanCounter(creds.getUsername());
                map.put("succeed", "Fail ! ");
                map.put("message", "Gagal Login, User Login Terblokir ! ");

                String authString = new Gson().toJson(map);

                PrintWriter out = res.getWriter();
                res.setStatus(400);
                res.setContentType("application/json");
                res.setCharacterEncoding("UTF-8");
                out.print(authString);
                out.flush();

                return authentication;
            } else {
               
                try {
                 
                    authentication = getAuthenticationManager().authenticate(new UsernamePasswordAuthenticationToken(
                            creds.getUsername(), creds.getPassword(), Collections.emptyList()));
                    
                } catch (final AuthenticationException e) {
                    logger.info("User not found");
                    // if user not found then send message succeed :false
                    Map map = new HashMap();
                    // gagal login counter
                    repository.simpanCounter(creds.getUsername());
                    map.put("succeed", "Username / Password Salah !");
                    String authString = new Gson().toJson(map);
                    PrintWriter out = res.getWriter();
                    res.setStatus(400);
                    res.setContentType("application/json");
                    res.setCharacterEncoding("UTF-8");
                    out.print(authString);
                    out.flush();
                }
                return authentication;
            }
        }
    }



    @Override
    protected void successfulAuthentication(final HttpServletRequest req, final HttpServletResponse res,
            final FilterChain chain, final Authentication auth) throws IOException, ServletException {
        logger.info("successfulAuthentication");
        logger.info(auth);
        Set<String> roles = AuthorityUtils.authorityListToSet(auth.getAuthorities());
        String hasil = roles.toString().replace("[", "").replace("]", "");
        // AuthenticationService.addToken(res, auth.getName());
        // add these information below, when user found
        Map map = new HashMap();
        // map.put("profile", auth);

        String nip = auth.getName();
        User user = repository.findBynip(nip);
        long l=user.getId();
        int i=(int)l;  
        // String users = repository.cekNIK(nip);

        // NOTE SIMPEN KAPAN WAKTU LOGIN & + 15 MENIT
        //String myTime = "14:10";
        Format f = new SimpleDateFormat("hh:mm");
        String myTime = f.format(new Date());
        //System.out.println("Time = "+strResult);
        SimpleDateFormat df = new SimpleDateFormat("hh:mm");
        Date d;
        try {
            d = df.parse(myTime);
            Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.MINUTE, 15);
        String newTime = df.format(cal.getTime());
        System.out.print("JAM :"+newTime);
        repository.simpanExpired(myTime,newTime,auth.getName());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

        repository.simpanCounterLogin(auth.getName());
        repository.simpanLogLogin(auth.getName());
        String cekRole = hasil;
        map.put("id", user.getId());
        if(hasil == cekRole){
            map.put("NIK", "users");
        }
        else{
            map.put("NIK", "null");
        }

        map.put("firstName", user.getFirstName());
        map.put("lastName", user.getLastName());
        map.put("username", auth.getName());
        map.put("role", hasil);

        // map.put("fcmToken", user.getFcmToken());
        // map.put("lastUpdateToken", user.getLastUpdateFcm());
        map.put("token", AuthenticationService.addToken(auth.getName()));
        map.put("succeed", "Berhasil Login");
        
        String authString = new Gson().toJson(map);
  
        
        PrintWriter out = res.getWriter();
        
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        out.print(authString);
        
        out.flush(); 

    }
}