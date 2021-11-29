package com.beCMS.BackendCentralParam.api;

import java.util.Arrays;
import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.LDAP.Credentials;
import com.beCMS.BackendCentralParam.model.LDAP.CredentialsLogin;
import com.beCMS.BackendCentralParam.model.LDAP.vwCredentials;
import com.beCMS.BackendCentralParam.model.LDAP.vwJWTLDAP;
import com.beCMS.BackendCentralParam.model.LDAP.vwLoginLDAP;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "*")
public class LoginLDAPRestController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private Environment env;


    // NOTE sample LDAP
    @RequestMapping(value = "/LDAP/", method = RequestMethod.POST, produces = "application/json")
    public HashMap<String, Object> loginLDAP(@RequestBody vwCredentials product, HttpServletResponse responses)
            throws JsonProcessingException {
        System.out.println("API LDAP HIT");
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Basic YmNhZmFwcHM6QWRtaW4xMjM=");
        HttpEntity<vwCredentials> entity = new HttpEntity<vwCredentials>(product, headers);
        ResponseEntity<vwJWTLDAP> respon = restTemplate.exchange(
                "http://192.168.29.71:12103/EnterpriseAuthentication/AuthenticateUserV2/", HttpMethod.POST, entity,
                vwJWTLDAP.class);
        System.out.println("hasil respon : " + respon.getBody().getResponseHeader());
        String credent = respon.getBody().getResponseHeader().getErrorDescription();
        System.out.println("repson : " + credent);
        // return respon.getBody();

        if (credent.equals("Success")) {
            // NOTE LOGIN
            System.out.println("ok");
            String username = product.getCredentials().getUserId();        
            String password = env.getProperty("strongPassword");
            CredentialsLogin creden = new CredentialsLogin(username, password);

            HttpHeaders headers1 = new HttpHeaders();

            // wrap
            ObjectMapper objectMapper = new ObjectMapper();
            String userString = objectMapper.writeValueAsString(creden);
            System.out.println(userString);
            // String url = "http://10.0.56.151:8291/api/login";

            String url = "http://localhost:9098/api/login";
            headers1.set("Content-Type", "application/json");
            // headers1.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers1.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> entity1 = new HttpEntity(userString, headers1);
            ResponseEntity<vwLoginLDAP> respon1 = restTemplate.postForEntity(url, entity1, vwLoginLDAP.class);

            System.out.println("hasil respon LOGIN : " + respon1.getBody());
            // return respon1.getBody();
            HashMap<String, Object> crunchifyMap = new HashMap<String, Object>();
            crunchifyMap.put("Login", respon1.getBody());
            return crunchifyMap;

        } else {
            responses.setStatus(400);
            HashMap<String, Object> crunchifyMap = new HashMap<String, Object>();
            crunchifyMap.put("message", "OOPS. SOMETHING WENT WRONG !");
            return crunchifyMap;
        }

    }

}