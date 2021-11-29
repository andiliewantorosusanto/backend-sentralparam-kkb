package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.modelBiayaFidusia;
import com.beCMS.BackendCentralParam.view.vwDataBiayaFidusia;
import com.beCMS.BackendCentralParam.view.vwSkemaBiayaFidusia;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface BiayaFidusiaRepository extends JpaRepository<modelBiayaFidusia, Integer> {

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataBiayaFidusia(id,namaSkema, startPH, endPH, biaya, startBerlaku, endBerlaku, created_at, operatorAwal, operatorAkhir, is_rejected, remarks, statusApproved, program, produk, createddate, createdby, updateddate, updatedby, is_login) from modelBiayaFidusia")
    List<vwDataBiayaFidusia> getListDataBiayaFidusia();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataBiayaFidusia(id,namaSkema, startPH, endPH, biaya, startBerlaku, endBerlaku, created_at, operatorAwal, operatorAkhir, is_rejected, remarks, statusApproved, program, produk, createddate, createdby, updateddate, updatedby, is_login) from modelBiayaFidusia where statusApproved = 0 OR statusApproved IS NULL")
    List<vwDataBiayaFidusia> getListBucketApprovalBiayaFidusia();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaBiayaFidusia(id,namaSkema) from modelBiayaFidusia")
    List<vwSkemaBiayaFidusia> getAllDatavwSkemaBiayaFidusia();
}