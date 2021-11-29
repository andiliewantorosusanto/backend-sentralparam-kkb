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

import com.beCMS.BackendCentralParam.model.modelBiayaProvisi;
import com.beCMS.BackendCentralParam.repository.BiayaProvisiRepository;
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
@RequestMapping("/api/biayaprovisi")
@CrossOrigin(origins = "*")
public class BiayaProvisiRestController {

    Logger logger = LoggerFactory.getLogger(BiayaProvisiRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BiayaProvisiRepository biayaProvisiRepository;

    // NOTE Untuk liat list history penggunaan oleh Showroom REJECTED
    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataBiayaProvisi(Principal principal, Pageable pageable,
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
                logger.info("Berhasil GET ALL DATA RATE PROVISI");
                crunchifyMap.put("dataBiayaProvisi", biayaProvisiRepository.getListDataBiayaProvisi());
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

    // NOTE Input Biaya Provisi
    @PostMapping(path = "/input", consumes = "application/json")
    public HashMap<String, String> insertBiayaProvisi(@RequestBody Map<String, Object> data, Principal principal,
            HttpServletResponse response) throws JarException, JSONException, ParseException {
        System.out.println("Masuk Input Biaya Provisi");
        modelBiayaProvisi tmp = new modelBiayaProvisi();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        tmp.setNamaSkema((String) data.get("nama_skema"));
        tmp.setJeniskendaraanid((Integer) data.get("jenis_kendaraan"));
        tmp.setJenis_pembiayaan((Integer) data.get("jenis_pembiayaan"));
        tmp.setLoanType((Integer) data.get("loan_type"));

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

        Float floatTenor1persen = Float.parseFloat(String.valueOf(data.get("tenor1persen")));
        tmp.setTenor1_persen(floatTenor1persen);
        Float floatTenor2persen = Float.parseFloat(String.valueOf(data.get("tenor2persen")));
        tmp.setTenor2_persen(floatTenor2persen);
        Float floatTenor3persen = Float.parseFloat(String.valueOf(data.get("tenor3persen")));
        tmp.setTenor3_persen(floatTenor3persen);
        Float floatTenor4persen = Float.parseFloat(String.valueOf(data.get("tenor4persen")));
        tmp.setTenor4_persen(floatTenor4persen);
        Float floatTenor5persen = Float.parseFloat(String.valueOf(data.get("tenor5persen")));
        tmp.setTenor5_persen(floatTenor5persen);
        Float floatTenor6persen = Float.parseFloat(String.valueOf(data.get("tenor6persen")));
        tmp.setTenor6_persen(floatTenor6persen);
        Float floatTenor7persen = Float.parseFloat(String.valueOf(data.get("tenor7persen")));
        tmp.setTenor7_persen(floatTenor7persen);
        Float floatTenor8persen = Float.parseFloat(String.valueOf(data.get("tenor8persen")));
        tmp.setTenor8_persen(floatTenor8persen);
        Float floatTenor9persen = Float.parseFloat(String.valueOf(data.get("tenor9persen")));
        tmp.setTenor9_persen(floatTenor9persen);
        Float floatTenor10persen = Float.parseFloat(String.valueOf(data.get("tenor10persen")));
        tmp.setTenor10_persen(floatTenor10persen);

        Date startBerlakuDated = dateFormat.parse(String.valueOf(data.get("start_berlaku")));
        tmp.setStartBerlaku(startBerlakuDated);

        Date endBerlakuDated = dateFormat.parse(String.valueOf(data.get("end_berlaku")));
        tmp.setEndBerlaku(endBerlakuDated);

        biayaProvisiRepository.save(tmp);
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Biaya Provisi Berhasil !");
        return crunchifyMap;
    }

    // NOTE Untuk liat list history penggunaan oleh Showroom REJECTED
    @PostMapping("/getalldataapproval")
    public Map<String, Object> getAllDataApprovalrateBiayaProvisi(Principal principal, Pageable pageable,
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
                logger.info("Berhasil GET ALL DATA RATE PROVISI");
                crunchifyMap.put("datarateBiayaProvisi",
                        biayaProvisiRepository.getListDataBucketApprovalBiayaProvisi());
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

}