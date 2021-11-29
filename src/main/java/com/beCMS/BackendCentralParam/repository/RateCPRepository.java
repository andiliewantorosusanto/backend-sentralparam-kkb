package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.modelRateCP;
import com.beCMS.BackendCentralParam.view.vwDataRateCP;
import com.beCMS.BackendCentralParam.view.vwSkemaRateCP;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface RateCPRepository extends JpaRepository<modelRateCP, Integer> {

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataRateCP(a.jenis_kendaraan,b.jenis_kendaraan_id as jenis_kendaraan,a.produk,a.tenor1,a.tenor2,a. tenor3,a. tenor4,a. tenor5,a. tenor6,a. tenor7,a. tenor8,a. tenor9,a. tenor10,a.startBerlaku,a.endBerlaku,a.is_approved,a.Remarks,a.statusApproved,a.tipeKonsumen,c.Nama,a.namaSkema) from modelRateCP a left join modelJenisKendaraan b on a.jenis_kendaraan = b.id LEFT JOIN modelTipeKonsumen c ON a.tipeKonsumen = c.id")
    List<vwDataRateCP> getListDataRateCP();


    // @Query(value = "SELECT a.jenis_kendaraan,a.produk,a.tenor1,a.tenor2,a. tenor3,a. tenor4,a. tenor5,a. tenor6,a. tenor7,a. tenor8,a. tenor9,a. tenor10,a.startBerlaku,a.endBerlaku,a.is_approved,a.Remarks from sp_ratecp a left join sp_jenisKendaraan b on a.jenis_kendaraan = b.id", nativeQuery = true)
    // List<vwDataRateCP> getNativeListDataRateCP();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataRateCP(a.jenis_kendaraan,b.jenis_kendaraan_id as jenis_kendaraan,a.produk,a.tenor1,a.tenor2,a. tenor3,a. tenor4,a. tenor5,a. tenor6,a. tenor7,a. tenor8,a. tenor9,a. tenor10,a.startBerlaku,a.endBerlaku,a.is_approved,a.Remarks,a.statusApproved,a.tipeKonsumen,c.Nama,a.namaSkema) from modelRateCP a left join modelJenisKendaraan b on a.jenis_kendaraan = b.id LEFT JOIN modelTipeKonsumen c ON a.tipeKonsumen = c.id where a.statusApproved = 0 OR a.statusApproved IS NULL")
    List<vwDataRateCP> getListBucketApprovalRateCP();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaRateCP(id,namaSkema) from modelRateCP")
    List<vwSkemaRateCP> getAllDataSkemaRateCP();

}