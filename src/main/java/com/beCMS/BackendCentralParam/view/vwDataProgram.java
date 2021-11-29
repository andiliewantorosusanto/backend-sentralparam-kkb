package com.beCMS.BackendCentralParam.view;

import java.util.Date;

public class vwDataProgram {

    private Integer id;

    private String program;

    private Integer produk;

    private String nama_produk;

    private String deskripsi;

    private Date start_date;

    private Date end_date;

    private Integer is_approved;

    private Integer is_rejected;

    private String remarks;

    private Integer createdby;

    private Date createddate;

    private Integer updatedby;

    private Date updateddate;
    
    private String BranchId;
    
    private Integer id_biayaadmin;
    private String nama_skema_biayaadmin;

    private Integer id_rateasuransi;
    private String nama_skema_rateasuransi;

    private Integer id_ratebunga;
    private String nama_skema_ratebunga;

    private Integer id_ratecp;
    private String nama_skema_ratecp;

    private Integer id_minimaldp;
    private String nama_skema_minimaldp;

    private Integer id_komponenph;
    private String nama_skema_komponenph;
    
    private Integer id_rateperluasan;
    private String nama_skema_rateperluasan;

    private Integer id_biayaprovisi;
    private String nama_skema_biayaprovisi;

    private Integer id_biayafidusia;
    private String nama_skema_biayafidusia;
    
    private Integer id_usiakendaraanlunas;
    private String nama_skema_usiakendaraanlunas;


    public vwDataProgram() {
    }

    public vwDataProgram(Integer id, String program, Integer produk, String nama_produk, String deskripsi, Date start_date, Date end_date, Integer is_approved, Integer is_rejected, String remarks, Integer createdby, Date createddate, Integer updatedby, Date updateddate, String BranchId, Integer id_biayaadmin, String nama_skema_biayaadmin, Integer id_rateasuransi, String nama_skema_rateasuransi, Integer id_ratebunga, String nama_skema_ratebunga, Integer id_ratecp, String nama_skema_ratecp, Integer id_minimaldp, String nama_skema_minimaldp, Integer id_komponenph, String nama_skema_komponenph, Integer id_rateperluasan, String nama_skema_rateperluasan, Integer id_biayaprovisi, String nama_skema_biayaprovisi, Integer id_biayafidusia, String nama_skema_biayafidusia, Integer id_usiakendaraanlunas, String nama_skema_usiakendaraanlunas) {
        this.id = id;
        this.program = program;
        this.produk = produk;
        this.nama_produk = nama_produk;
        this.deskripsi = deskripsi;
        this.start_date = start_date;
        this.end_date = end_date;
        this.is_approved = is_approved;
        this.is_rejected = is_rejected;
        this.remarks = remarks;
        this.createdby = createdby;
        this.createddate = createddate;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
        this.BranchId = BranchId;
        this.id_biayaadmin = id_biayaadmin;
        this.nama_skema_biayaadmin = nama_skema_biayaadmin;
        this.id_rateasuransi = id_rateasuransi;
        this.nama_skema_rateasuransi = nama_skema_rateasuransi;
        this.id_ratebunga = id_ratebunga;
        this.nama_skema_ratebunga = nama_skema_ratebunga;
        this.id_ratecp = id_ratecp;
        this.nama_skema_ratecp = nama_skema_ratecp;
        this.id_minimaldp = id_minimaldp;
        this.nama_skema_minimaldp = nama_skema_minimaldp;
        this.id_komponenph = id_komponenph;
        this.nama_skema_komponenph = nama_skema_komponenph;
        this.id_rateperluasan = id_rateperluasan;
        this.nama_skema_rateperluasan = nama_skema_rateperluasan;
        this.id_biayaprovisi = id_biayaprovisi;
        this.nama_skema_biayaprovisi = nama_skema_biayaprovisi;
        this.id_biayafidusia = id_biayafidusia;
        this.nama_skema_biayafidusia = nama_skema_biayafidusia;
        this.id_usiakendaraanlunas = id_usiakendaraanlunas;
        this.nama_skema_usiakendaraanlunas = nama_skema_usiakendaraanlunas;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public String getNama_produk() {
        return this.nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Date getStart_date() {
        return this.start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return this.end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Integer getIs_approved() {
        return this.is_approved;
    }

    public void setIs_approved(Integer is_approved) {
        this.is_approved = is_approved;
    }

    public Integer getIs_rejected() {
        return this.is_rejected;
    }

    public void setIs_rejected(Integer is_rejected) {
        this.is_rejected = is_rejected;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getCreatedby() {
        return this.createdby;
    }

    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    public Date getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Integer getUpdatedby() {
        return this.updatedby;
    }

    public void setUpdatedby(Integer updatedby) {
        this.updatedby = updatedby;
    }

    public Date getUpdateddate() {
        return this.updateddate;
    }

    public void setUpdateddate(Date updateddate) {
        this.updateddate = updateddate;
    }

    public String getBranchId() {
        return this.BranchId;
    }

    public void setBranchId(String BranchId) {
        this.BranchId = BranchId;
    }

    public Integer getId_biayaadmin() {
        return this.id_biayaadmin;
    }

    public void setId_biayaadmin(Integer id_biayaadmin) {
        this.id_biayaadmin = id_biayaadmin;
    }

    public String getNama_skema_biayaadmin() {
        return this.nama_skema_biayaadmin;
    }

    public void setNama_skema_biayaadmin(String nama_skema_biayaadmin) {
        this.nama_skema_biayaadmin = nama_skema_biayaadmin;
    }

    public Integer getId_rateasuransi() {
        return this.id_rateasuransi;
    }

    public void setId_rateasuransi(Integer id_rateasuransi) {
        this.id_rateasuransi = id_rateasuransi;
    }

    public String getNama_skema_rateasuransi() {
        return this.nama_skema_rateasuransi;
    }

    public void setNama_skema_rateasuransi(String nama_skema_rateasuransi) {
        this.nama_skema_rateasuransi = nama_skema_rateasuransi;
    }

    public Integer getId_ratebunga() {
        return this.id_ratebunga;
    }

    public void setId_ratebunga(Integer id_ratebunga) {
        this.id_ratebunga = id_ratebunga;
    }

    public String getNama_skema_ratebunga() {
        return this.nama_skema_ratebunga;
    }

    public void setNama_skema_ratebunga(String nama_skema_ratebunga) {
        this.nama_skema_ratebunga = nama_skema_ratebunga;
    }

    public Integer getId_ratecp() {
        return this.id_ratecp;
    }

    public void setId_ratecp(Integer id_ratecp) {
        this.id_ratecp = id_ratecp;
    }

    public String getNama_skema_ratecp() {
        return this.nama_skema_ratecp;
    }

    public void setNama_skema_ratecp(String nama_skema_ratecp) {
        this.nama_skema_ratecp = nama_skema_ratecp;
    }

    public Integer getId_minimaldp() {
        return this.id_minimaldp;
    }

    public void setId_minimaldp(Integer id_minimaldp) {
        this.id_minimaldp = id_minimaldp;
    }

    public String getNama_skema_minimaldp() {
        return this.nama_skema_minimaldp;
    }

    public void setNama_skema_minimaldp(String nama_skema_minimaldp) {
        this.nama_skema_minimaldp = nama_skema_minimaldp;
    }

    public Integer getId_komponenph() {
        return this.id_komponenph;
    }

    public void setId_komponenph(Integer id_komponenph) {
        this.id_komponenph = id_komponenph;
    }

    public String getNama_skema_komponenph() {
        return this.nama_skema_komponenph;
    }

    public void setNama_skema_komponenph(String nama_skema_komponenph) {
        this.nama_skema_komponenph = nama_skema_komponenph;
    }

    public Integer getId_rateperluasan() {
        return this.id_rateperluasan;
    }

    public void setId_rateperluasan(Integer id_rateperluasan) {
        this.id_rateperluasan = id_rateperluasan;
    }

    public String getNama_skema_rateperluasan() {
        return this.nama_skema_rateperluasan;
    }

    public void setNama_skema_rateperluasan(String nama_skema_rateperluasan) {
        this.nama_skema_rateperluasan = nama_skema_rateperluasan;
    }

    public Integer getId_biayaprovisi() {
        return this.id_biayaprovisi;
    }

    public void setId_biayaprovisi(Integer id_biayaprovisi) {
        this.id_biayaprovisi = id_biayaprovisi;
    }

    public String getNama_skema_biayaprovisi() {
        return this.nama_skema_biayaprovisi;
    }

    public void setNama_skema_biayaprovisi(String nama_skema_biayaprovisi) {
        this.nama_skema_biayaprovisi = nama_skema_biayaprovisi;
    }

    public Integer getId_biayafidusia() {
        return this.id_biayafidusia;
    }

    public void setId_biayafidusia(Integer id_biayafidusia) {
        this.id_biayafidusia = id_biayafidusia;
    }

    public String getNama_skema_biayafidusia() {
        return this.nama_skema_biayafidusia;
    }

    public void setNama_skema_biayafidusia(String nama_skema_biayafidusia) {
        this.nama_skema_biayafidusia = nama_skema_biayafidusia;
    }

    public Integer getId_usiakendaraanlunas() {
        return this.id_usiakendaraanlunas;
    }

    public void setId_usiakendaraanlunas(Integer id_usiakendaraanlunas) {
        this.id_usiakendaraanlunas = id_usiakendaraanlunas;
    }

    public String getNama_skema_usiakendaraanlunas() {
        return this.nama_skema_usiakendaraanlunas;
    }

    public void setNama_skema_usiakendaraanlunas(String nama_skema_usiakendaraanlunas) {
        this.nama_skema_usiakendaraanlunas = nama_skema_usiakendaraanlunas;
    }



}