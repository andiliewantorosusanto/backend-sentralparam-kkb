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

import com.beCMS.BackendCentralParam.model.modelRateCP;
import com.beCMS.BackendCentralParam.repository.RateCPRepository;
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
@RequestMapping("/api/ratecp")
@CrossOrigin(origins = "*")
public class RateCPRestController {

    Logger logger = LoggerFactory.getLogger(RateCPRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RateCPRepository rateCPRepository;

    // NOTE Untuk liat list history penggunaan oleh Showroom REJECTED
    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataRateCP(Principal principal, Pageable pageable,
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
                logger.info("Berhasil GET ALL DATA RATE CP");
                crunchifyMap.put("dataRatecp", rateCPRepository.getListDataRateCP());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka RATE CP!");
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
    public HashMap<String, String> viewRateCP(HttpServletResponse response) {
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("message", "Testing");
        return crunchifyMap;
    }

    // NOTE Untuk liat list history penggunaan oleh Showroom REJECTED
    @PostMapping("/getalldataapproval")
    public Map<String, Object> getAllDataApprovalRatecp(Principal principal, Pageable pageable,
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
                crunchifyMap.put("dataRatecp", rateCPRepository.getListBucketApprovalRateCP());
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
    public HashMap<String, String> editRatecp(@RequestBody Map<String, Object> data, Principal principal,
            HttpServletResponse response) {
        HashMap<String, String> crunchifyMap = new HashMap<>();
        return crunchifyMap;
    }


    // NOTE Input Program
    @PostMapping(path = "/input", consumes = "application/json")
    public HashMap<String, String> insertRateBunga(@RequestBody Map<String, Object> data, Principal principal,
            HttpServletResponse response) throws JarException, JSONException, ParseException {
        Gson gson = new Gson();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        modelRateCP tmp = new modelRateCP();
        tmp.setNamaSkema((String) data.get("nama_skema"));
        tmp.setTipeKonsumen((Integer) data.get("tipe_konsumen"));

        Date start_berlaku = dateFormat.parse(String.valueOf(data.get("start_berlaku")));
        tmp.setStartBerlaku(start_berlaku);
        
        Date end_berlaku = dateFormat.parse(String.valueOf(data.get("end_berlaku")));
        tmp.setEndBerlaku(end_berlaku);


        Date createdAtDated = dateFormat.parse(String.valueOf(data.get("created_at")));
        tmp.setCreatedAt(createdAtDated);

        
        Float floatTenor1 = Float.parseFloat(String.valueOf(data.get("tenor1")));
        tmp.setTenor1(floatTenor1);
        Float floatTenor2 = Float.parseFloat(String.valueOf(data.get("tenor2")));
        tmp.setTenor2(floatTenor2);
        Float floatTenor3 = Float.parseFloat(String.valueOf(data.get("tenor3")));
        tmp.setTenor3(floatTenor3);
        Float floatTenor4 = Float.parseFloat(String.valueOf(data.get("tenor4")));
        tmp.setTenor4(floatTenor4);
        Float floatTenor5 = Float.parseFloat(String.valueOf(data.get("tenor5")));
        tmp.setTenor5(floatTenor5);
        Float floatTenor6 = Float.parseFloat(String.valueOf(data.get("tenor6")));
        tmp.setTenor6(floatTenor6);
        Float floatTenor7 = Float.parseFloat(String.valueOf(data.get("tenor7")));
        tmp.setTenor7(floatTenor7);
        Float floatTenor8 = Float.parseFloat(String.valueOf(data.get("tenor8")));
        tmp.setTenor8(floatTenor8);
        Float floatTenor9 = Float.parseFloat(String.valueOf(data.get("tenor9")));
        tmp.setTenor9(floatTenor9);
        Float floatTenor10 = Float.parseFloat(String.valueOf(data.get("tenor10")));
        tmp.setTenor10(floatTenor10);

        rateCPRepository.save(tmp);
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Rate CP Berhasil !");
        return crunchifyMap;
    }

}