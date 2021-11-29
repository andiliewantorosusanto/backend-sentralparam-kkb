package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.modelBiayaProvisi;
import com.beCMS.BackendCentralParam.view.vwDataBiayaProvisi;
import com.beCMS.BackendCentralParam.view.vwSkemaBiayaProvisi;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface BiayaProvisiRepository extends JpaRepository<modelBiayaProvisi, Integer> {

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataBiayaProvisi(a.id,a.startBerlaku,a.endBerlaku,a.loanType,a.productid,a.jeniskendaraanid,b.jenis_kendaraan_id,a.kondisikendaraanid,a.tipe_konsumen,a.jenis_pembiayaan,c.jenis_pembiayaan_id,a.tujuan_penggunaan,a.cluster,a.program,a.remarks,a.status,a.tahun_awal,a.tahun_akhir,a.updateddate,a.createddate,a.createdby,a.updatedby,a.is_login,a.statusApproved,a.namaSkema,d.deskripsi) from modelBiayaProvisi a LEFT JOIN modelJenisKendaraan b ON a.jeniskendaraanid = b.id LEFT JOIN modelJenisPembiayaan c ON a.jenis_pembiayaan = c.id LEFT JOIN modelLoanType d ON a.loanType = d.id_komp")
    List<vwDataBiayaProvisi> getListDataBiayaProvisi();


    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataBiayaProvisi(a.id,a.startBerlaku,a.endBerlaku,a.loanType,a.productid,a.jeniskendaraanid,b.jenis_kendaraan_id,a.kondisikendaraanid,a.tipe_konsumen,a.jenis_pembiayaan,c.jenis_pembiayaan_id,a.tujuan_penggunaan,a.cluster,a.program,a.remarks,a.status,a.tahun_awal,a.tahun_akhir,a.updateddate,a.createddate,a.createdby,a.updatedby,a.is_login,a.statusApproved,a.namaSkema,d.deskripsi) from modelBiayaProvisi a LEFT JOIN modelJenisKendaraan b ON a.jeniskendaraanid = b.id LEFT JOIN modelJenisPembiayaan c ON a.jenis_pembiayaan = c.id LEFT JOIN modelLoanType d ON a.loanType = d.id_komp where a.statusApproved = 0 OR a.statusApproved IS NULL")
    List<vwDataBiayaProvisi> getListDataBucketApprovalBiayaProvisi();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaBiayaProvisi(id,namaSkema) from modelBiayaProvisi")
    List<vwSkemaBiayaProvisi> getAllDatavwSkemaBiayaProvisi();

}