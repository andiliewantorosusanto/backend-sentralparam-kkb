
    package com.beCMS.BackendCentralParam.view;

    import java.util.Date;
    
    public class vwDataMinimalDP {

    private Integer id;

    private String namaSkema;

    private Integer loanType;
    private String deskripsi;

    private Integer tujuan_penggunaan;
    private String Nama;

    private Integer tipe_konsumen;
    private String Nama_konsumen;

    private Integer jeniskendaraanid;
    private String jenis_kendaraan_id;

    private Integer jenis_pembiayaan;
    private String jenis_pembiayaan_id;

    private Integer cluster;
    private String cluster_id;

    private Float minimalDP;

    private String status;
    
    private String remarks;


    public vwDataMinimalDP() {
    }

    public vwDataMinimalDP(Integer id, String namaSkema, Integer loanType, String deskripsi, Integer tujuan_penggunaan, String Nama, Integer tipe_konsumen, String Nama_konsumen, Integer jeniskendaraanid, String jenis_kendaraan_id, Integer jenis_pembiayaan, String jenis_pembiayaan_id, Integer cluster, String cluster_id, Float minimalDP, String status, String remarks) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.loanType = loanType;
        this.deskripsi = deskripsi;
        this.tujuan_penggunaan = tujuan_penggunaan;
        this.Nama = Nama;
        this.tipe_konsumen = tipe_konsumen;
        this.Nama_konsumen = Nama_konsumen;
        this.jeniskendaraanid = jeniskendaraanid;
        this.jenis_kendaraan_id = jenis_kendaraan_id;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.jenis_pembiayaan_id = jenis_pembiayaan_id;
        this.cluster = cluster;
        this.cluster_id = cluster_id;
        this.minimalDP = minimalDP;
        this.status = status;
        this.remarks = remarks;
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

    public Integer getLoanType() {
        return this.loanType;
    }

    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Integer getTujuan_penggunaan() {
        return this.tujuan_penggunaan;
    }

    public void setTujuan_penggunaan(Integer tujuan_penggunaan) {
        this.tujuan_penggunaan = tujuan_penggunaan;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public Integer getTipe_konsumen() {
        return this.tipe_konsumen;
    }

    public void setTipe_konsumen(Integer tipe_konsumen) {
        this.tipe_konsumen = tipe_konsumen;
    }

    public String getNama_konsumen() {
        return this.Nama_konsumen;
    }

    public void setNama_konsumen(String Nama_konsumen) {
        this.Nama_konsumen = Nama_konsumen;
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

    public Float getMinimalDP() {
        return this.minimalDP;
    }

    public void setMinimalDP(Float minimalDP) {
        this.minimalDP = minimalDP;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    }