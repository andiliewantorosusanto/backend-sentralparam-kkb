

package com.beCMS.BackendCentralParam.view;

import java.util.Date;

public class vwDataBiayaFidusia {

    private Integer id;

    private String namaSkema;

    private Integer startPH;

    private Integer endPH;

    private Integer biaya;

    private Date startBerlaku;

    private Date endBerlaku;

    private Date created_at;

    private String operatorAwal;

    private String operatorAkhir;

    private String is_rejected;

    private String remarks;

    private String statusApproved;

    private Integer program;

    private Integer produk;

    private Date createddate;

    private Integer createdby;

    private Date updateddate;

    private Integer updatedby;

    private Integer is_login;



    public vwDataBiayaFidusia() {
    }

    public vwDataBiayaFidusia(Integer id, String namaSkema, Integer startPH, Integer endPH, Integer biaya, Date startBerlaku, Date endBerlaku, Date created_at, String operatorAwal, String operatorAkhir, String is_rejected, String remarks, String statusApproved, Integer program, Integer produk, Date createddate, Integer createdby, Date updateddate, Integer updatedby, Integer is_login) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.startPH = startPH;
        this.endPH = endPH;
        this.biaya = biaya;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.created_at = created_at;
        this.operatorAwal = operatorAwal;
        this.operatorAkhir = operatorAkhir;
        this.is_rejected = is_rejected;
        this.remarks = remarks;
        this.statusApproved = statusApproved;
        this.program = program;
        this.produk = produk;
        this.createddate = createddate;
        this.createdby = createdby;
        this.updateddate = updateddate;
        this.updatedby = updatedby;
        this.is_login = is_login;
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

    public Integer getStartPH() {
        return this.startPH;
    }

    public void setStartPH(Integer startPH) {
        this.startPH = startPH;
    }

    public Integer getEndPH() {
        return this.endPH;
    }

    public void setEndPH(Integer endPH) {
        this.endPH = endPH;
    }

    public Integer getBiaya() {
        return this.biaya;
    }

    public void setBiaya(Integer biaya) {
        this.biaya = biaya;
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

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getOperatorAwal() {
        return this.operatorAwal;
    }

    public void setOperatorAwal(String operatorAwal) {
        this.operatorAwal = operatorAwal;
    }

    public String getOperatorAkhir() {
        return this.operatorAkhir;
    }

    public void setOperatorAkhir(String operatorAkhir) {
        this.operatorAkhir = operatorAkhir;
    }

    public String getIs_rejected() {
        return this.is_rejected;
    }

    public void setIs_rejected(String is_rejected) {
        this.is_rejected = is_rejected;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStatusApproved() {
        return this.statusApproved;
    }

    public void setStatusApproved(String statusApproved) {
        this.statusApproved = statusApproved;
    }

    public Integer getProgram() {
        return this.program;
    }

    public void setProgram(Integer program) {
        this.program = program;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public Date getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Integer getCreatedby() {
        return this.createdby;
    }

    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    public Date getUpdateddate() {
        return this.updateddate;
    }

    public void setUpdateddate(Date updateddate) {
        this.updateddate = updateddate;
    }

    public Integer getUpdatedby() {
        return this.updatedby;
    }

    public void setUpdatedby(Integer updatedby) {
        this.updatedby = updatedby;
    }

    public Integer getIs_login() {
        return this.is_login;
    }

    public void setIs_login(Integer is_login) {
        this.is_login = is_login;
    }

}
