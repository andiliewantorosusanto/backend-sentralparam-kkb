package com.beCMS.BackendCentralParam.api;

import java.math.BigDecimal;
import java.security.Principal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarException;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.modelKomponenPH;
import com.beCMS.BackendCentralParam.repository.KomponenPHRepository;
import com.beCMS.BackendCentralParam.repository.UserRepository;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ratekomponenph")
@CrossOrigin(origins = "*")
public class RateKomponenPHRestController {

    Logger logger = LoggerFactory.getLogger(RateKomponenPHRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private KomponenPHRepository KomponenPHRepository;

    // NOTE Untuk liat list history penggunaan oleh Showroom REJECTED
    @PostMapping("/getalldata")
    public Map<String, Object> getAllDatarateKomponenPH(Principal principal, Pageable pageable,
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
                logger.info("Berhasil GET ALL DATA RATE BUNGA");
                crunchifyMap.put("datarateKomponenPH", KomponenPHRepository.getListDataKomponenPH());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka history penggunaan!");
            }
            return crunchifyMap;
        } else {
            logger.warn("TIDAK MEMILIKI HAK AKSES");
            response.setStatus(400);
            crunchifyMap.put("code", "00");
            crunchifyMap.put("message", "OOPS. SOMETHING WENT WRONG !");
            return crunchifyMap;
        }
    }

    @PostMapping(path = "/viewdata")
    public HashMap<String, String> viewrateKomponenPH(HttpServletResponse response) {
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("message", "Testing");
        return crunchifyMap;
    }

    // NOTE Untuk liat list history penggunaan oleh Showroom REJECTED
    @PostMapping("/getalldataapproval")
    public Map<String, Object> getAllDataApprovalrateKomponenPH(Principal principal, Pageable pageable,
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
                logger.info("Berhasil GET ALL DATA RATE BUNGA");
                crunchifyMap.put("datarateKomponenPH", KomponenPHRepository.getListBucketApprovalKomponenPH());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka history penggunaan!");
            }
            return crunchifyMap;
        } else {
            logger.warn("TIDAK MEMILIKI HAK AKSES");
            response.setStatus(400);
            crunchifyMap.put("code", "00");
            crunchifyMap.put("message", "OOPS. SOMETHING WENT WRONG !");
            return crunchifyMap;
        }
    }

    // NOTE Input Rate Bunga
    @PostMapping(path = "/edit", consumes = "application/json")
    public HashMap<String, String> editrateKomponenPH(@RequestBody Map<String, Object> data, Principal principal,
            HttpServletResponse response) {
        HashMap<String, String> crunchifyMap = new HashMap<>();
        return crunchifyMap;
    }

}