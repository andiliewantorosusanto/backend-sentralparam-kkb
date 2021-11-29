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
@Table(name = "sp_usiakendaraanlunas")
public class modelUsiaKendaraanLunas implements Serializable {
  
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "nama_skema")
    private String namaSkema; 

    @Column(name = "maksimal_usia_kendaraan")
    private String maksimalUsiaKendaraan;


    public modelUsiaKendaraanLunas() {
    }

    public modelUsiaKendaraanLunas(Integer id, String namaSkema, String maksimalUsiaKendaraan) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.maksimalUsiaKendaraan = maksimalUsiaKendaraan;
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

    public String getMaksimalUsiaKendaraan() {
        return this.maksimalUsiaKendaraan;
    }

    public void setMaksimalUsiaKendaraan(String maksimalUsiaKendaraan) {
        this.maksimalUsiaKendaraan = maksimalUsiaKendaraan;
    }

 
}