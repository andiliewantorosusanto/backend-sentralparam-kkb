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

import com.beCMS.BackendCentralParam.model.modelProgram;
import com.beCMS.BackendCentralParam.repository.BiayaAdminRepository;
import com.beCMS.BackendCentralParam.repository.BiayaFidusiaRepository;
import com.beCMS.BackendCentralParam.repository.BiayaProvisiRepository;
import com.beCMS.BackendCentralParam.repository.KomponenPHRepository;
import com.beCMS.BackendCentralParam.repository.ProgramRepository;
import com.beCMS.BackendCentralParam.repository.RateAsuransiRepository;
import com.beCMS.BackendCentralParam.repository.RateBungaRepository;
import com.beCMS.BackendCentralParam.repository.RateCPRepository;
import com.beCMS.BackendCentralParam.repository.RateMinimalDPRepository;
import com.beCMS.BackendCentralParam.repository.RatePerluasanAsuransiRepository;
import com.beCMS.BackendCentralParam.repository.UserRepository;
import com.beCMS.BackendCentralParam.repository.UsiaKendaraanLunasRepository;
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
@RequestMapping("/api/program")
@CrossOrigin(origins = "*")
public class ProgramRestController {

    Logger logger = LoggerFactory.getLogger(ProgramRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProgramRepository ProgramRepository;

    @Autowired
    private RateBungaRepository rateBungaRepository;

    @Autowired
    private BiayaAdminRepository biayaadminRepository;

    @Autowired
    private RateCPRepository rateCPRepository;

    @Autowired
    private RateMinimalDPRepository rateMinimalDPRepository;

    @Autowired
    private KomponenPHRepository komponenPHRepository;

    @Autowired
    private RatePerluasanAsuransiRepository ratePerluasanAsuransiRepository;

    @Autowired
    private BiayaProvisiRepository biayaProvisiRepository;

    @Autowired
    private BiayaFidusiaRepository biayaFidusiaRepository;

    @Autowired
    private RateAsuransiRepository rateAsuransiRepository;

    @Autowired
    private UsiaKendaraanLunasRepository usiaKendaraanLunasRepository;

    // NOTE Untuk liat list history penggunaan oleh Showroom REJECTED
    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataProgram(Principal principal, Pageable pageable, HttpServletResponse response) {
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
                logger.info("Berhasil GET ALL DATA PROGRAM");
                crunchifyMap.put("dataProgram", ProgramRepository.getListDataProgram());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka history PROGRAM!");
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
                 crunchifyMap.put("datarateKomponenPH", ProgramRepository.getListBucketApprovalDataProgram());
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

    @PostMapping("/getskema")
    public Map<String, Object> getAllDataSkema(Principal principal, Pageable pageable, HttpServletResponse response) {
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
                logger.info("Berhasil GET ALL DATA SKEMA");
                crunchifyMap.put("dataSkemaRateBunga", rateBungaRepository.getAllDataSkemaRateBunga());
                crunchifyMap.put("dataSkemaRateAsuransi", rateAsuransiRepository.getAllDataSkemaRateAsuransi());
                crunchifyMap.put("dataSkemaRateCP", rateCPRepository.getAllDataSkemaRateCP());
                crunchifyMap.put("dataSkemaBiayaAdmin", biayaadminRepository.getAllDataSkemaBiayaAdmin());
                crunchifyMap.put("dataSkemaMinimalDP", rateMinimalDPRepository.getAllDatavwSkemaMinimalDP());
                crunchifyMap.put("dataSkemaKomponenPH", komponenPHRepository.getAllDatavwSkemaKomponenPH());
                crunchifyMap.put("dataSkemaRatePerluasan",ratePerluasanAsuransiRepository.getAllDatavwSkemaPerluasanAsuransi());
                crunchifyMap.put("dataSkemaBiayaProvisi", biayaProvisiRepository.getAllDatavwSkemaBiayaProvisi());
                crunchifyMap.put("dataSkemaBiayaFidusia", biayaFidusiaRepository.getAllDatavwSkemaBiayaFidusia());
                crunchifyMap.put("dataSkemaUsiaKendaraanLunas", usiaKendaraanLunasRepository.getAllDatavwSkemaUsiaKendaranLunas());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka history SKEMA!");
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


    // NOTE Input Program
    @PostMapping(path = "/input", consumes = "application/json")
    public HashMap<String, String> insertRateBunga(@RequestBody Map<String, Object> map, Principal principal,
            HttpServletResponse response) throws JarException, JSONException, ParseException {
        Gson gson = new Gson();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ArrayList<modelProgram> listProgram = new ArrayList<>();
        JSONArray jsonArray = new JSONArray(gson.toJson(map.get("settingProgram")));
        for (int i = 0; i < jsonArray.length(); i++) {
            try {
            
                JSONObject object = jsonArray.getJSONObject(i);
                modelProgram programTMP = new modelProgram();
                programTMP.setProgram(object.optString("program"));
                programTMP.setProduk(object.optInt("produk"));
                programTMP.setDeskripsi(object.optString("deskripsi"));

                String start_date = object.getString("start_date");
                Date start_berlakuDate = dateFormat.parse(start_date);
                programTMP.setStart_date(start_berlakuDate);

                String end_date = object.getString("end_date");
                Date end_berlakuDate = dateFormat.parse(end_date);
                programTMP.setEnd_date(end_berlakuDate);

                programTMP.setBranchId(object.optString("branchid"));
                programTMP.setId_biayaadmin(object.optInt("id_biayaadmin"));
                programTMP.setId_rateasuransi(object.optInt("id_rateasuransi"));
                programTMP.setId_ratebunga(object.optInt("id_ratebunga"));
                programTMP.setId_ratecp(object.optInt("id_ratecp"));
                programTMP.setId_minimaldp(object.optInt("id_minimaldp"));
                programTMP.setId_komponenph(object.optInt("id_komponenph"));
                programTMP.setId_rateperluasan(object.optInt("id_rateperluasan"));
                programTMP.setId_biayaprovisi(object.optInt("id_biayaprovisi"));
                programTMP.setId_biayafidusia(object.optInt("id_biayafidusia"));
                programTMP.setId_usiakendaraanlunas(object.optInt("id_usiakendaraanlunas"));
                
                listProgram.add(programTMP);
            } catch (JSONException e) {
                ProgramRepository.saveAll(listProgram);
        HashMap<String, String> crunchifyMap = new HashMap<>();
        response.setStatus(400);
        crunchifyMap.put("code", "0");
        crunchifyMap.put("message", "Param Tidak Sesuai !");
        return crunchifyMap;
            }
        }
        ProgramRepository.saveAll(listProgram);
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Program Berhasil !");
        return crunchifyMap;
    }
}