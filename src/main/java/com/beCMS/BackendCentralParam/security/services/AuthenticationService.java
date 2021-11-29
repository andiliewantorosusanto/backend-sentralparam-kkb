package com.beCMS.BackendCentralParam.security.services;


import static java.util.Collections.emptyList;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


public class AuthenticationService {
    //static final long EXPIRATIONTIME = 3154_000_00; // 1 day in milliseconds
    static final long EXPIRATIONTIME = 900000;
    static final String SIGNINGKEY = "SecretKey";
    static final String PREFIX = "Bearer";

    // Add token to Authorization header
    static public void addToken(HttpServletResponse res, String username) {
        String JwtToken = Jwts.builder().setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
                .signWith(SignatureAlgorithm.HS512, SIGNINGKEY).compact();
                
        res.addHeader("Authorization", PREFIX + " " + JwtToken);
        res.addHeader("Access-Control-Expose-Headers", "Authorization");

    }
    // add this method for jwt only
    static public String addToken(String username) {
        String JwtToken = Jwts.builder().setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
                .signWith(SignatureAlgorithm.HS512, SIGNINGKEY).compact();

        return JwtToken;

    }
    // Get token from Authorization header
    static public Authentication getAuthentication(HttpServletRequest request, HttpServletResponse httpServletResponse) {
        String token = request.getHeader("Authorization");
        try{
        if (token != null) {
            String user = Jwts.parser().setSigningKey(SIGNINGKEY).parseClaimsJws(token.replace(PREFIX, "")).getBody()
                    .getSubject();
            if (user != null)
                return new UsernamePasswordAuthenticationToken(user, null, emptyList());
        }
        else {
            httpServletResponse.sendError(500,"Error ! ");
          }

        
    } catch (Exception e) {
        //TODO: handle exception
    }
    return null;
}
}