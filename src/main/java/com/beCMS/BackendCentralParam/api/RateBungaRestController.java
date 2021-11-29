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

import com.beCMS.BackendCentralParam.model.modelRateBunga;
import com.beCMS.BackendCentralParam.repository.RateBungaRepository;
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
@RequestMapping("/api/ratebunga")
@CrossOrigin(origins = "*")
public class RateBungaRestController {

    Logger logger = LoggerFactory.getLogger(RateBungaRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RateBungaRepository rateBungaRepository;

    // NOTE Untuk liat list history penggunaan oleh Showroom REJECTED
    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataRateBunga(Principal principal, Pageable pageable,
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
                crunchifyMap.put("dataRateBunga", rateBungaRepository.getListDataRateBunga());
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
    public HashMap<String, String> viewRateBunga(HttpServletResponse response) {
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("message", "Testing");
        return crunchifyMap;
    }

    // NOTE Input Rate Bunga
    @PostMapping(path = "/input", consumes = "application/json")
    public HashMap<String, String> insertRateBunga(@RequestBody Map<String, Object> map, Principal principal,
            HttpServletResponse response) throws JarException, JSONException, ParseException {
        Gson gson = new Gson();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ArrayList<modelRateBunga> listRateBunga = new ArrayList<>();
        JSONArray jsonArray = new JSONArray(gson.toJson(map.get("settingParamRateBunga")));
        for (int i = 0; i < jsonArray.length(); i++) {
            try {
            
                JSONObject object = jsonArray.getJSONObject(i);
                modelRateBunga rateBungaTMP = new modelRateBunga();
                rateBungaTMP.setLoan_type(object.optInt("loan_type"));
                rateBungaTMP.setProduk(object.optInt("produk"));
                rateBungaTMP.setJenis_kendaraan(object.getInt("jenis_kendaraan"));
                rateBungaTMP.setKondisi_kendaraan(object.getInt("kondisi_kendaraan"));
                rateBungaTMP.setStart_tahun_kendaraan(object.getInt("start_tahun_kendaraan"));
                rateBungaTMP.setEnd_tahun(object.getInt("end_tahun"));

                String start_berlaku = object.getString("start_berlaku");
                Date start_berlakuDate = dateFormat.parse(start_berlaku);
                rateBungaTMP.setStart_berlaku(start_berlakuDate);
                
                String end_berlaku = object.getString("end_berlaku");
                Date end_berlakuDate = dateFormat.parse(end_berlaku);
                rateBungaTMP.setEnd_berlaku(end_berlakuDate);

                float Tenor1 = BigDecimal.valueOf(object.getDouble("tenor1")).floatValue();
                rateBungaTMP.setTenor1(Tenor1);

                float Tenor2 = BigDecimal.valueOf(object.getDouble("tenor2")).floatValue();
                rateBungaTMP.setTenor2(Tenor2);

                float Tenor3 = BigDecimal.valueOf(object.getDouble("tenor3")).floatValue();
                rateBungaTMP.setTenor3(Tenor3);

                float Tenor4 = BigDecimal.valueOf(object.getDouble("tenor4")).floatValue();
                rateBungaTMP.setTenor4(Tenor4);


                rateBungaTMP.setTenor5periode1(object.getInt("tenor5periode1"));
                rateBungaTMP.setTenor5periode2(object.getInt("tenor5periode2"));

                float Tenor5rate1 = BigDecimal.valueOf(object.getDouble("tenor5rate1")).floatValue();
                rateBungaTMP.setTenor5rate1(Tenor5rate1);

                float Tenor5rate2 = BigDecimal.valueOf(object.getDouble("tenor5rate2")).floatValue();
                rateBungaTMP.setTenor5rate2(Tenor5rate2);


                rateBungaTMP.setTenor6periode1(object.getInt("tenor6periode1"));
                rateBungaTMP.setTenor6periode2(object.getInt("tenor6periode2"));

                float Tenor6rate1 = BigDecimal.valueOf(object.getDouble("tenor6rate1")).floatValue();
                rateBungaTMP.setTenor6rate1(Tenor6rate1);

                float Tenor6rate2 = BigDecimal.valueOf(object.getDouble("tenor6rate2")).floatValue();
                rateBungaTMP.setTenor6rate2(Tenor6rate2);


                rateBungaTMP.setTenor7periode1(object.getInt("tenor7periode1"));
                rateBungaTMP.setTenor7periode2(object.getInt("tenor7periode2"));

                float Tenor7rate1 = BigDecimal.valueOf(object.getDouble("tenor7rate1")).floatValue();
                rateBungaTMP.setTenor7rate1(Tenor7rate1);

                float Tenor7rate2 = BigDecimal.valueOf(object.getDouble("tenor7rate2")).floatValue();
                rateBungaTMP.setTenor7rate2(Tenor7rate2);

                rateBungaTMP.setTenor8periode1(object.getInt("tenor8periode1"));
                rateBungaTMP.setTenor8periode2(object.getInt("tenor8periode2"));

                float Tenor8rate1 = BigDecimal.valueOf(object.getDouble("tenor8rate1")).floatValue();
                rateBungaTMP.setTenor8rate1(Tenor8rate1);

                float Tenor8rate2 = BigDecimal.valueOf(object.getDouble("tenor8rate2")).floatValue();
                rateBungaTMP.setTenor8rate2(Tenor8rate2);


                rateBungaTMP.setTenor9periode1(object.getInt("tenor9periode1"));
                rateBungaTMP.setTenor9periode2(object.getInt("tenor9periode2"));
                
                float Tenor9rate1 = BigDecimal.valueOf(object.getDouble("tenor9rate1")).floatValue();
                rateBungaTMP.setTenor9rate1(Tenor9rate1);

                float Tenor9rate2 = BigDecimal.valueOf(object.getDouble("tenor9rate2")).floatValue();
                rateBungaTMP.setTenor9rate2(Tenor9rate2);


                rateBungaTMP.setTenor10periode1(object.getInt("tenor10periode1"));
                rateBungaTMP.setTenor10periode2(object.getInt("tenor10periode2"));

                float Tenor10rate1 = BigDecimal.valueOf(object.getDouble("tenor10rate1")).floatValue();
                rateBungaTMP.setTenor10rate1(Tenor10rate1);

                float Tenor10rate2 = BigDecimal.valueOf(object.getDouble("tenor10rate2")).floatValue();
                rateBungaTMP.setTenor10rate2(Tenor10rate2);

                rateBungaTMP.setOperatorAwal(object.optString("operatorawal"));
                rateBungaTMP.setOperatorAkhir(object.optString("operatorakhir"));
                rateBungaTMP.setStatusApproved(object.optString("statusapproved"));
                rateBungaTMP.setRemarks(object.optString("Remarks"));
                rateBungaTMP.setIs_rejected(object.optString("is_rejected"));
                rateBungaTMP.setJenis_pembiayaan(object.optInt("jenis_pembiayaan"));
                rateBungaTMP.setTujuan_penggunaan(object.optInt("tujuan_penggunaan"));
                rateBungaTMP.setCluster(object.optInt("cluster"));
                rateBungaTMP.setProgram(object.optInt("program"));

                String createddate = object.getString("createddate");
                Date createddateDate = dateFormat.parse(createddate);
                rateBungaTMP.setCreateddate(createddateDate);

                String updateddate = object.getString("updateddate");
                Date updateddateDate = dateFormat.parse(updateddate);
                rateBungaTMP.setUpdateddate(updateddateDate);


                rateBungaTMP.setUpdatedby(object.optInt("updatedby"));
                rateBungaTMP.setCreatedby(object.optInt("createdby"));
                rateBungaTMP.setTipe_konsumen(object.optInt("tipe_konsumen"));
                rateBungaTMP.setIs_login(object.optInt("is_login"));

                listRateBunga.add(rateBungaTMP);
            } catch (JSONException e) {
                rateBungaRepository.saveAll(listRateBunga);
        HashMap<String, String> crunchifyMap = new HashMap<>();
        response.setStatus(400);
        crunchifyMap.put("code", "0");
        crunchifyMap.put("message", "Param Tidak Sesuai !");
        return crunchifyMap;
            }
        }
        rateBungaRepository.saveAll(listRateBunga);
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Parameter Rate Bunga Berhasil !");
        return crunchifyMap;
    }

    // NOTE Input Rate Bunga
    @PostMapping(path = "/inputRateBunga", consumes = "application/json")
    public Map insertRateBungaSimple(@RequestBody modelRateBunga modelRateBunga, Principal principal,
            HttpServletResponse response) {
        Map crunchifyMap = new HashMap<String, String>();
        rateBungaRepository.save(modelRateBunga);
        System.out.println("Berhasil Melakukan Registrasi Tahap 1!");
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Parameter Rate Bunga Berhasil !");
        crunchifyMap.put("id", modelRateBunga.getId());
        return crunchifyMap;
    }

    // NOTE Untuk liat list history penggunaan oleh Showroom REJECTED
    @PostMapping("/getalldataapproval")
    public Map<String, Object> getAllDataApprovalRateBunga(Principal principal, Pageable pageable,
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
                crunchifyMap.put("dataRateBunga", rateBungaRepository.getListBucketApprovalRateBunga());
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
    public HashMap<String, String> editRateBunga(@RequestBody Map<String, Object> data, Principal principal,
            HttpServletResponse response) {
        HashMap<String, String> crunchifyMap = new HashMap<>();
        return crunchifyMap;
    }

}