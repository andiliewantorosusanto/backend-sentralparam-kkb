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
@Table(name="sp_jenisperluasan_kkbsk")
public class modelJenisPerluasan implements Serializable {
	
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Nama")
    private String jenis_perluasan_id;
    
    @Column(name = "Produk")
    private Integer Produk;

    @Column(name = "Deskripsi")
    private String Deskripsi;

    @Column(name = "Start_date")
    private Date Start_date;

    @Column(name = "End_date")
    private Date End_date;

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

    @Column(name = "multiple_select")
    private Integer multiple_select;
    


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJenis_perluasan_id() {
        return this.jenis_perluasan_id;
    }

    public void setJenis_perluasan_id(String jenis_perluasan_id) {
        this.jenis_perluasan_id = jenis_perluasan_id;
    }

    public Integer getProduk() {
        return this.Produk;
    }

    public void setProduk(Integer Produk) {
        this.Produk = Produk;
    }

    public String getDeskripsi() {
        return this.Deskripsi;
    }

    public void setDeskripsi(String Deskripsi) {
        this.Deskripsi = Deskripsi;
    }

    public Date getStart_date() {
        return this.Start_date;
    }

    public void setStart_date(Date Start_date) {
        this.Start_date = Start_date;
    }

    public Date getEnd_date() {
        return this.End_date;
    }

    public void setEnd_date(Date End_date) {
        this.End_date = End_date;
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

    public Integer getMultiple_select() {
        return this.multiple_select;
    }

    public void setMultiple_select(Integer multiple_select) {
        this.multiple_select = multiple_select;
    }

    public modelJenisPerluasan() {
    }

    public modelJenisPerluasan(Integer id, String jenis_perluasan_id, Integer Produk, String Deskripsi, Date Start_date, Date End_date, Integer is_approved, Integer is_rejected, String remarks, Integer createdby, Date createddate, Integer updatedby, Date updateddate, Integer multiple_select) {
        this.id = id;
        this.jenis_perluasan_id = jenis_perluasan_id;
        this.Produk = Produk;
        this.Deskripsi = Deskripsi;
        this.Start_date = Start_date;
        this.End_date = End_date;
        this.is_approved = is_approved;
        this.is_rejected = is_rejected;
        this.remarks = remarks;
        this.createdby = createdby;
        this.createddate = createddate;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
        this.multiple_select = multiple_select;
    }

}
