package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/helper")
@CrossOrigin(origins = "*")
public class HelperRestController {
    Logger logger = LoggerFactory.getLogger(RateBungaRestController.class);

    @Autowired
    private UserRepository userRepository;

     // NOTE Untuk liat list history penggunaan oleh Showroom REJECTED
     @PostMapping("/cekToken")
     public Map<String, Object> cekTokenExp(Principal principal,
             HttpServletResponse response) {
         Map crunchifyMap = new HashMap<String, Object>();
 
         // NOTE ambil dari token siapa yang sedang akses
         System.out.println(principal.getName());
         String id = principal.getName();
 
         // NOTE cek diquery rolenya dia sebagai apa
         String role = userRepository.cekRoles(id);
         logger.info("NIP : " + id);
         logger.info("ROLE : " + role);
         // NOTE kondisi dimana dia memiliki akses maka akan dilanjut
         if (role.contains("USER")) {
             try {
                 crunchifyMap.put("code", "1");
             } catch (Exception e) {
                 logger.error("ERROR");
                 response.setStatus(400);
                 crunchifyMap.put("code", "0");
             }
             return crunchifyMap;
         } else {
             logger.warn("TIDAK MEMILIKI HAK AKSES");
             response.setStatus(400);
             crunchifyMap.put("code", "0");
             return crunchifyMap;
         }
     }

}