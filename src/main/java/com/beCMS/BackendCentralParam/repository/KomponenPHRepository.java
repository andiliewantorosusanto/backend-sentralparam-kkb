package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.modelKomponenPH;
import com.beCMS.BackendCentralParam.view.vwDataKomponenPH;
import com.beCMS.BackendCentralParam.view.vwSkemaKomponenPH;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface KomponenPHRepository extends JpaRepository<modelKomponenPH, Integer> {

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataKomponenPH(id, idKompPH, jenis, addm, addb, created_at, startBerlaku, endBerlaku, Remarks, is_rejected, group_id, kondisi_kendaraan, produk, status, tipe_konsumen, jenis_pembiayaan, jenis_kendaraan, program, cluster, is_login) from modelKomponenPH")
    List<vwDataKomponenPH> getListDataKomponenPH();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataKomponenPH(id, idKompPH, jenis, addm, addb, created_at, startBerlaku, endBerlaku, Remarks, is_rejected, group_id, kondisi_kendaraan, produk, status, tipe_konsumen, jenis_pembiayaan, jenis_kendaraan, program, cluster, is_login) from modelKomponenPH where status = 0 OR status IS NULL")
    List<vwDataKomponenPH> getListBucketApprovalKomponenPH();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaKomponenPH(id,namaSkema) from modelKomponenPH")
    List<vwSkemaKomponenPH> getAllDatavwSkemaKomponenPH();

}