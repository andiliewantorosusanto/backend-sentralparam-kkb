package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.modelMinimalDP;
import com.beCMS.BackendCentralParam.model.modelUsiaKendaraanLunas;
import com.beCMS.BackendCentralParam.view.vwDataMinimalDP;
import com.beCMS.BackendCentralParam.view.vwSkemaMinimalDP;
import com.beCMS.BackendCentralParam.view.vwSkemaUsiaKendaranLunas;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface UsiaKendaraanLunasRepository extends JpaRepository<modelUsiaKendaraanLunas, Integer> {

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaUsiaKendaranLunas(id,namaSkema) from modelUsiaKendaraanLunas")
    List<vwSkemaUsiaKendaranLunas> getAllDatavwSkemaUsiaKendaranLunas();
}