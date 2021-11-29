package com.beCMS.BackendCentralParam.view;

import java.util.Date;

public class vwDataRateAsuransi {

//NOTE Data Rate Asuransi

private String namaSkema;

private Integer wilayah;
private String namaWilayah;

private Integer startOTR;

private Integer endOTR;

private Integer startyear;

private Integer endyear;

private Integer tipeAsuransi;
private String namaAsuransi;

private Date startBerlaku;

private Date endBerlaku;

private Integer loan_type;

private Integer produk;

private Integer jenis_kendaraan;
private String jenis_kendaraan_id;

private Integer jenis_pembiayaan;
private String jenis_pembiayaan_id;

private String statusApproved;

private String remarks;

private Integer program;

    public vwDataRateAsuransi() {
    }

    public vwDataRateAsuransi(String namaSkema, Integer wilayah, String namaWilayah, Integer startOTR, Integer endOTR, Integer startyear, Integer endyear, Integer tipeAsuransi, String namaAsuransi, Date startBerlaku, Date endBerlaku, Integer loan_type, Integer produk, Integer jenis_kendaraan, String jenis_kendaraan_id, Integer jenis_pembiayaan, String jenis_pembiayaan_id, String statusApproved, String remarks, Integer program) {
        this.namaSkema = namaSkema;
        this.wilayah = wilayah;
        this.namaWilayah = namaWilayah;
        this.startOTR = startOTR;
        this.endOTR = endOTR;
        this.startyear = startyear;
        this.endyear = endyear;
        this.tipeAsuransi = tipeAsuransi;
        this.namaAsuransi = namaAsuransi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.loan_type = loan_type;
        this.produk = produk;
        this.jenis_kendaraan = jenis_kendaraan;
        this.jenis_kendaraan_id = jenis_kendaraan_id;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.jenis_pembiayaan_id = jenis_pembiayaan_id;
        this.statusApproved = statusApproved;
        this.remarks = remarks;
        this.program = program;
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

    public String getNamaWilayah() {
        return this.namaWilayah;
    }

    public void setNamaWilayah(String namaWilayah) {
        this.namaWilayah = namaWilayah;
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

    public Integer getTipeAsuransi() {
        return this.tipeAsuransi;
    }

    public void setTipeAsuransi(Integer tipeAsuransi) {
        this.tipeAsuransi = tipeAsuransi;
    }

    public String getNamaAsuransi() {
        return this.namaAsuransi;
    }

    public void setNamaAsuransi(String namaAsuransi) {
        this.namaAsuransi = namaAsuransi;
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

    public String getJenis_kendaraan_id() {
        return this.jenis_kendaraan_id;
    }

    public void setJenis_kendaraan_id(String jenis_kendaraan_id) {
        this.jenis_kendaraan_id = jenis_kendaraan_id;
    }

    public Integer getJenis_pembiayaan() {
        return this.jenis_pembiayaan;
    }

    public void setJenis_pembiayaan(Integer jenis_pembiayaan) {
        this.jenis_pembiayaan = jenis_pembiayaan;
    }

    public String getJenis_pembiayaan_id() {
        return this.jenis_pembiayaan_id;
    }

    public void setJenis_pembiayaan_id(String jenis_pembiayaan_id) {
        this.jenis_pembiayaan_id = jenis_pembiayaan_id;
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

    public Integer getProgram() {
        return this.program;
    }

    public void setProgram(Integer program) {
        this.program = program;
    }


}