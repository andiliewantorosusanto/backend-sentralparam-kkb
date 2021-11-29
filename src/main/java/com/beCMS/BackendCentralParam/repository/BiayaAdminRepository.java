package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.modelBiayaAdmin;
import com.beCMS.BackendCentralParam.view.vwDataBiayaAdmin;
import com.beCMS.BackendCentralParam.view.vwSkemaBiayaAdmin;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface BiayaAdminRepository extends JpaRepository<modelBiayaAdmin, Integer> {

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataBiayaAdmin(a.namaSkema,a.tipe_konsumen,i.Nama,a.jeniskendaraanid,b.jenis_kendaraan_id,a.jenis_pembiayaan,d.jenis_pembiayaan_id,a.cluster,j.cluster_id,a.diskon_npwp,a.startBerlaku,a.endBerlaku,a.statusApproval,a.remarks) from modelBiayaAdmin a left join modelJenisKendaraan b on a.jeniskendaraanid = b.id left join modelJenisPembiayaan d on a.jenis_pembiayaan = d.id  LEFT JOIN modelTipeKonsumen i ON a.tipe_konsumen = i.id LEFT JOIN modelCluster j ON a.cluster = j.id")
    List<vwDataBiayaAdmin> getListDataBiayaAdmin();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataBiayaAdmin(a.namaSkema,a.tipe_konsumen,i.Nama,a.jeniskendaraanid,b.jenis_kendaraan_id,a.jenis_pembiayaan,d.jenis_pembiayaan_id,a.cluster,j.cluster_id,a.diskon_npwp,a.startBerlaku,a.endBerlaku,a.statusApproval,a.remarks) from modelBiayaAdmin a left join modelJenisKendaraan b on a.jeniskendaraanid = b.id left join modelJenisPembiayaan d on a.jenis_pembiayaan = d.id  LEFT JOIN modelTipeKonsumen i ON a.tipe_konsumen = i.id LEFT JOIN modelCluster j ON a.cluster = j.id where a.statusApproval = 0 OR a.statusApproval IS NULL")
    List<vwDataBiayaAdmin> getListBucketApprovalBiayaAdmin();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaBiayaAdmin(id,namaSkema) from modelBiayaAdmin")
    List<vwSkemaBiayaAdmin> getAllDataSkemaBiayaAdmin();

}