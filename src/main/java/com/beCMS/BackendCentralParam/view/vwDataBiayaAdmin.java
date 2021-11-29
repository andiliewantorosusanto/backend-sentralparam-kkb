package com.beCMS.BackendCentralParam.view;

import java.util.Date;

public class vwDataBiayaAdmin {
    
    //private Integer skema;
    private String namaSkema;
    private Integer tipe_konsumen;
    private String Nama;

    private Integer jeniskendaraanid;
    private String jenis_kendaraan_id;

    private Integer jenis_pembiayaan;
    private String jenis_pembiayaan_id;

    private Integer cluster;
    private String cluster_id;

    private Integer diskon_npwp;
    private Date startBerlaku;
    private Date endBerlaku;
    private String statusApproval;
    private String remarks;



    public vwDataBiayaAdmin() {
    }

    public vwDataBiayaAdmin(String namaSkema, Integer tipe_konsumen, String Nama, Integer jeniskendaraanid, String jenis_kendaraan_id, Integer jenis_pembiayaan, String jenis_pembiayaan_id, Integer cluster, String cluster_id, Integer diskon_npwp, Date startBerlaku, Date endBerlaku, String statusApproval, String remarks) {
        this.namaSkema = namaSkema;
        this.tipe_konsumen = tipe_konsumen;
        this.Nama = Nama;
        this.jeniskendaraanid = jeniskendaraanid;
        this.jenis_kendaraan_id = jenis_kendaraan_id;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.jenis_pembiayaan_id = jenis_pembiayaan_id;
        this.cluster = cluster;
        this.cluster_id = cluster_id;
        this.diskon_npwp = diskon_npwp;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.statusApproval = statusApproval;
        this.remarks = remarks;
    }

    public String getNamaSkema() {
        return this.namaSkema;
    }

    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    public Integer getTipe_konsumen() {
        return this.tipe_konsumen;
    }

    public void setTipe_konsumen(Integer tipe_konsumen) {
        this.tipe_konsumen = tipe_konsumen;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public Integer getJeniskendaraanid() {
        return this.jeniskendaraanid;
    }

    public void setJeniskendaraanid(Integer jeniskendaraanid) {
        this.jeniskendaraanid = jeniskendaraanid;
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

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public String getCluster_id() {
        return this.cluster_id;
    }

    public void setCluster_id(String cluster_id) {
        this.cluster_id = cluster_id;
    }

    public Integer getDiskon_npwp() {
        return this.diskon_npwp;
    }

    public void setDiskon_npwp(Integer diskon_npwp) {
        this.diskon_npwp = diskon_npwp;
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

    public String getStatusApproval() {
        return this.statusApproval;
    }

    public void setStatusApproval(String statusApproval) {
        this.statusApproval = statusApproval;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }



}