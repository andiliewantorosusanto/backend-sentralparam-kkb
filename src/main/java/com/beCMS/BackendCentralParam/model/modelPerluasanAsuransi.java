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
@Table(name="sp_rateperluasan")
public class modelPerluasanAsuransi implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    
    @Column(name = "nama_skema")
    private String namaSkema;

    @Column(name = "wilayah")
    private Integer wilayah;
    
    @Column(name = "startOTR")
    private Integer startOTR;

    @Column(name = "endOTR")
    private Integer endOTR;

    @Column(name = "startyear")
    private Integer startyear;

    @Column(name = "endyear")
    private Integer endyear;

    @Column(name = "tenor1")
    private Float tenor1;

    @Column(name = "tipe_asuransi")
    private Integer tipeAsuransi;

    @Column(name = "startberlaku")
    private Date startBerlaku;

    @Column(name = "endberlaku")
    private Date endBerlaku;

    @Column(name = "createdby")
    private Integer createdby;

    @Column(name = "createddate")
    private Date createddate;

    @Column(name = "loan_type")
    private Integer loan_type;

    @Column(name = "produk")
    private Integer produk;

    @Column(name = "jenis_kendaraan")
    private Integer jenis_kendaraan;

    @Column(name = "tenor2")
    private Float tenor2;

    @Column(name = "tenor3")
    private Float tenor3;

    @Column(name = "tenor4")
    private Float tenor4;

    @Column(name = "tenor5")
    private Float tenor5;

    @Column(name = "tenor6")
    private Float tenor6;

    @Column(name = "tenor7")
    private Float tenor7;

    @Column(name = "tenor8")
    private Float tenor8;

    @Column(name = "tenor9")
    private Float tenor9;

    @Column(name = "tenor10")
    private Float tenor10;

    @Column(name = "statusapproved")
    private String statusApproved;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "is_rejected")
    private String is_rejected;

    @Column(name = "jenis_pembiayaan")
    private Integer jenis_pembiayaan;

    @Column(name = "tujuan_penggunaan")
    private Integer tujuan_penggunaan;

    @Column(name = "program")
    private Integer program;

    @Column(name = "is_login")
    private Integer is_login;

    @Column(name = "jenis_perluasan")
    private Integer jenis_perluasan;


    public modelPerluasanAsuransi() {
    }


    public modelPerluasanAsuransi(Integer id, String namaSkema, Integer wilayah, Integer startOTR, Integer endOTR, Integer startyear, Integer endyear, Float tenor1, Integer tipeAsuransi, Date startBerlaku, Date endBerlaku, Integer createdby, Date createddate, Integer loan_type, Integer produk, Integer jenis_kendaraan, Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10, String statusApproved, String remarks, String is_rejected, Integer jenis_pembiayaan, Integer tujuan_penggunaan, Integer program, Integer is_login, Integer jenis_perluasan) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.wilayah = wilayah;
        this.startOTR = startOTR;
        this.endOTR = endOTR;
        this.startyear = startyear;
        this.endyear = endyear;
        this.tenor1 = tenor1;
        this.tipeAsuransi = tipeAsuransi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.createdby = createdby;
        this.createddate = createddate;
        this.loan_type = loan_type;
        this.produk = produk;
        this.jenis_kendaraan = jenis_kendaraan;
        this.tenor2 = tenor2;
        this.tenor3 = tenor3;
        this.tenor4 = tenor4;
        this.tenor5 = tenor5;
        this.tenor6 = tenor6;
        this.tenor7 = tenor7;
        this.tenor8 = tenor8;
        this.tenor9 = tenor9;
        this.tenor10 = tenor10;
        this.statusApproved = statusApproved;
        this.remarks = remarks;
        this.is_rejected = is_rejected;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.tujuan_penggunaan = tujuan_penggunaan;
        this.program = program;
        this.is_login = is_login;
        this.jenis_perluasan = jenis_perluasan;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaSkema() {
        return this.namaSkema;
    }

    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    public Integer getWilayah() {
        return this.wilayah;
    }

    public void setWilayah(Integer wilayah) {
        this.wilayah = wilayah;
    }

    public Integer getStartOTR() {
        return this.startOTR;
    }

    public void setStartOTR(Integer startOTR) {
        this.startOTR = startOTR;
    }

    public Integer getEndOTR() {
        return this.endOTR;
    }

    public void setEndOTR(Integer endOTR) {
        this.endOTR = endOTR;
    }

    public Integer getStartyear() {
        return this.startyear;
    }

    public void setStartyear(Integer startyear) {
        this.startyear = startyear;
    }

    public Integer getEndyear() {
        return this.endyear;
    }

    public void setEndyear(Integer endyear) {
        this.endyear = endyear;
    }

    public Float getTenor1() {
        return this.tenor1;
    }

    public void setTenor1(Float tenor1) {
        this.tenor1 = tenor1;
    }

    public Integer getTipeAsuransi() {
        return this.tipeAsuransi;
    }

    public void setTipeAsuransi(Integer tipeAsuransi) {
        this.tipeAsuransi = tipeAsuransi;
    }

    public Date getStartBerlaku() {
        return this.startBerlaku;
    }

    public void setStartBerlaku(Date startBerlaku) {
        this.startBerlaku = startBerlaku;
    }

    public Date getEndBerlaku() {
        return this.endBerlaku;
    }

    public void setEndBerlaku(Date endBerlaku) {
        this.endBerlaku = endBerlaku;
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

    public Integer getLoan_type() {
        return this.loan_type;
    }

    public void setLoan_type(Integer loan_type) {
        this.loan_type = loan_type;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public Integer getJenis_kendaraan() {
        return this.jenis_kendaraan;
    }

    public void setJenis_kendaraan(Integer jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public Float getTenor2() {
        return this.tenor2;
    }

    public void setTenor2(Float tenor2) {
        this.tenor2 = tenor2;
    }

    public Float getTenor3() {
        return this.tenor3;
    }

    public void setTenor3(Float tenor3) {
        this.tenor3 = tenor3;
    }

    public Float getTenor4() {
        return this.tenor4;
    }

    public void setTenor4(Float tenor4) {
        this.tenor4 = tenor4;
    }

    public Float getTenor5() {
        return this.tenor5;
    }

    public void setTenor5(Float tenor5) {
        this.tenor5 = tenor5;
    }

    public Float getTenor6() {
        return this.tenor6;
    }

    public void setTenor6(Float tenor6) {
        this.tenor6 = tenor6;
    }

    public Float getTenor7() {
        return this.tenor7;
    }

    public void setTenor7(Float tenor7) {
        this.tenor7 = tenor7;
    }

    public Float getTenor8() {
        return this.tenor8;
    }

    public void setTenor8(Float tenor8) {
        this.tenor8 = tenor8;
    }

    public Float getTenor9() {
        return this.tenor9;
    }

    public void setTenor9(Float tenor9) {
        this.tenor9 = tenor9;
    }

    public Float getTenor10() {
        return this.tenor10;
    }

    public void setTenor10(Float tenor10) {
        this.tenor10 = tenor10;
    }

    public String getStatusApproved() {
        return this.statusApproved;
    }

    public void setStatusApproved(String statusApproved) {
        this.statusApproved = statusApproved;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getIs_rejected() {
        return this.is_rejected;
    }

    public void setIs_rejected(String is_rejected) {
        this.is_rejected = is_rejected;
    }

    public Integer getJenis_pembiayaan() {
        return this.jenis_pembiayaan;
    }

    public void setJenis_pembiayaan(Integer jenis_pembiayaan) {
        this.jenis_pembiayaan = jenis_pembiayaan;
    }

    public Integer getTujuan_penggunaan() {
        return this.tujuan_penggunaan;
    }

    public void setTujuan_penggunaan(Integer tujuan_penggunaan) {
        this.tujuan_penggunaan = tujuan_penggunaan;
    }

    public Integer getProgram() {
        return this.program;
    }

    public void setProgram(Integer program) {
        this.program = program;
    }

    public Integer getIs_login() {
        return this.is_login;
    }

    public void setIs_login(Integer is_login) {
        this.is_login = is_login;
    }

    public Integer getJenis_perluasan() {
        return this.jenis_perluasan;
    }

    public void setJenis_perluasan(Integer jenis_perluasan) {
        this.jenis_perluasan = jenis_perluasan;
    }


}