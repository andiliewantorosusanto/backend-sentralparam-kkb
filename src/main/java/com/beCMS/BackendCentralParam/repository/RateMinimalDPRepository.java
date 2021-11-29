package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.modelMinimalDP;
import com.beCMS.BackendCentralParam.view.vwDataMinimalDP;
import com.beCMS.BackendCentralParam.view.vwSkemaMinimalDP;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface RateMinimalDPRepository extends JpaRepository<modelMinimalDP, Integer> {

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataMinimalDP(a.id,a.namaSkema,a.loanType,b.deskripsi,a.tujuan_penggunaan,c.Nama,a.tipe_konsumen,d.Nama as Nama_konsumen,a.jeniskendaraanid,e.jenis_kendaraan_id,a.jenis_pembiayaan,f.jenis_pembiayaan_id,a.cluster,g.cluster_id,a.minimalDP,a.status,a.remarks) from modelMinimalDP a"
    +" LEFT JOIN modelLoanType b ON a.loanType = b.id_komp"
    +" LEFT JOIN modelTujuanPenggunaan c ON a.tujuan_penggunaan = c.id"
    +" LEFT JOIN modelTipeKonsumen d ON a.tipe_konsumen = d.id"
    +" LEFT JOIN modelJenisKendaraan e ON a.jeniskendaraanid = e.id"
    +" LEFT JOIN modelJenisPembiayaan f ON a.jenis_pembiayaan = f.id"
    +" LEFT JOIN modelCluster g ON a.cluster = g.id")
    List<vwDataMinimalDP> getListDataMinimalDP();


    // @Query(value = "SELECT a.jenis_kendaraan,a.produk,a.tenor1,a.tenor2,a. tenor3,a. tenor4,a. tenor5,a. tenor6,a. tenor7,a. tenor8,a. tenor9,a. tenor10,a.startBerlaku,a.endBerlaku,a.is_approved,a.Remarks from sp_MinimalDP a left join sp_jenisKendaraan b on a.jenis_kendaraan = b.id", nativeQuery = true)
    // List<vwDataMinimalDP> getNativeListDataMinimalDP();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataMinimalDP(a.id,a.namaSkema,a.loanType,b.deskripsi,a.tujuan_penggunaan,c.Nama,a.tipe_konsumen,d.Nama as Nama_konsumen,a.jeniskendaraanid,e.jenis_kendaraan_id,a.jenis_pembiayaan,f.jenis_pembiayaan_id,a.cluster,g.cluster_id,a.minimalDP,a.status,a.remarks) from modelMinimalDP a"
    +" LEFT JOIN modelLoanType b ON a.loanType = b.id_komp"
    +" LEFT JOIN modelTujuanPenggunaan c ON a.tujuan_penggunaan = c.id"
    +" LEFT JOIN modelTipeKonsumen d ON a.tipe_konsumen = d.id"
    +" LEFT JOIN modelJenisKendaraan e ON a.jeniskendaraanid = e.id"
    +" LEFT JOIN modelJenisPembiayaan f ON a.jenis_pembiayaan = f.id"
    +" LEFT JOIN modelCluster g ON a.cluster = g.id where statusApproved = 0 OR statusApproved IS NULL")
    List<vwDataMinimalDP> getListBucketApprovalMinimalDP();


    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaMinimalDP(id,namaSkema) from modelMinimalDP")
    List<vwSkemaMinimalDP> getAllDatavwSkemaMinimalDP();
}