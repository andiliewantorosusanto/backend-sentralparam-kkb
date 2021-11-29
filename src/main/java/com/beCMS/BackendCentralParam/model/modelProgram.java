package com.beCMS.BackendCentralParam.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sp_program")
public class modelProgram implements Serializable {
  
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "program")
    private String program;

    @Column(name = "produk")
    private Integer produk;

    @Column(name = "deskripsi")
    private String deskripsi;

    @Column(name = "start_date")
    private Date start_date;

    @Column(name = "end_date")
    private Date end_date;

    @Column(name = "is_approved")
    private Integer is_approved;

    @Column(name = "is_rejected")
    private Integer is_rejected;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "createdby")
    private Integer createdby;

    @Column(name = "createddate")
    private Date createddate;

    @Column(name = "updatedby")
    private Integer updatedby;

    @Column(name = "updateddate")
    private Date updateddate;
    
    @Column(name = "branchid")
    private String BranchId;

    @Column(name = "id_biayaadmin")
    private Integer id_biayaadmin;

    @Column(name = "id_rateasuransi")
    private Integer id_rateasuransi;

    @Column(name = "id_ratebunga")
    private Integer id_ratebunga;

    @Column(name = "id_ratecp")
    private Integer id_ratecp;

    @Column(name = "id_minimaldp")
    private Integer id_minimaldp;

    @Column(name = "id_komponenph")
    private Integer id_komponenph;

    @Column(name = "id_rateperluasan")
    private Integer id_rateperluasan;

    @Column(name = "id_biayaprovisi")
    private Integer id_biayaprovisi;

    @Column(name = "id_biayafidusia")
    private Integer id_biayafidusia;

    @Column(name = "id_usiakendaraanlunas")
    private Integer id_usiakendaraanlunas;


    public modelProgram() {
    }

    public modelProgram(Integer id, String program, Integer produk, String deskripsi, Date start_date, Date end_date, Integer is_approved, Integer is_rejected, String remarks, Integer createdby, Date createddate, Integer updatedby, Date updateddate, String BranchId, Integer id_biayaadmin, Integer id_rateasuransi, Integer id_ratebunga, Integer id_ratecp, Integer id_minimaldp, Integer id_komponenph, Integer id_rateperluasan, Integer id_biayaprovisi, Integer id_biayafidusia, Integer id_usiakendaraanlunas) {
        this.id = id;
        this.program = program;
        this.produk = produk;
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
        this.id_rateasuransi = id_rateasuransi;
        this.id_ratebunga = id_ratebunga;
        this.id_ratecp = id_ratecp;
        this.id_minimaldp = id_minimaldp;
        this.id_komponenph = id_komponenph;
        this.id_rateperluasan = id_rateperluasan;
        this.id_biayaprovisi = id_biayaprovisi;
        this.id_biayafidusia = id_biayafidusia;
        this.id_usiakendaraanlunas = id_usiakendaraanlunas;
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

    public Integer getId_rateasuransi() {
        return this.id_rateasuransi;
    }

    public void setId_rateasuransi(Integer id_rateasuransi) {
        this.id_rateasuransi = id_rateasuransi;
    }

    public Integer getId_ratebunga() {
        return this.id_ratebunga;
    }

    public void setId_ratebunga(Integer id_ratebunga) {
        this.id_ratebunga = id_ratebunga;
    }

    public Integer getId_ratecp() {
        return this.id_ratecp;
    }

    public void setId_ratecp(Integer id_ratecp) {
        this.id_ratecp = id_ratecp;
    }

    public Integer getId_minimaldp() {
        return this.id_minimaldp;
    }

    public void setId_minimaldp(Integer id_minimaldp) {
        this.id_minimaldp = id_minimaldp;
    }

    public Integer getId_komponenph() {
        return this.id_komponenph;
    }

    public void setId_komponenph(Integer id_komponenph) {
        this.id_komponenph = id_komponenph;
    }

    public Integer getId_rateperluasan() {
        return this.id_rateperluasan;
    }

    public void setId_rateperluasan(Integer id_rateperluasan) {
        this.id_rateperluasan = id_rateperluasan;
    }

    public Integer getId_biayaprovisi() {
        return this.id_biayaprovisi;
    }

    public void setId_biayaprovisi(Integer id_biayaprovisi) {
        this.id_biayaprovisi = id_biayaprovisi;
    }

    public Integer getId_biayafidusia() {
        return this.id_biayafidusia;
    }

    public void setId_biayafidusia(Integer id_biayafidusia) {
        this.id_biayafidusia = id_biayafidusia;
    }

    public Integer getId_usiakendaraanlunas() {
        return this.id_usiakendaraanlunas;
    }

    public void setId_usiakendaraanlunas(Integer id_usiakendaraanlunas) {
        this.id_usiakendaraanlunas = id_usiakendaraanlunas;
    }


}
