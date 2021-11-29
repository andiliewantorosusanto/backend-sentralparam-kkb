package com.beCMS.BackendCentralParam.repository;

import java.util.List;
import org.springframework.data.domain.Pageable;
import com.beCMS.BackendCentralParam.model.modelRateAsuransi;
import com.beCMS.BackendCentralParam.view.vwDataRateAsuransi;
import com.beCMS.BackendCentralParam.view.vwSkemaRateAsuransi;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface RateAsuransiRepository extends JpaRepository<modelRateAsuransi, Integer> {

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataRateAsuransi( a.namaSkema, a.wilayah,g.namaWilayah,a.startOTR,a.endOTR,a.startyear,a.endyear,a.tipeAsuransi,f.namaAsuransi,a.startBerlaku,a.endBerlaku,a.loan_type,a.produk,a.jenis_kendaraan,b.jenis_kendaraan_id,a.jenis_pembiayaan,d.jenis_pembiayaan_id,a.statusApproved,a.remarks,a.program) from modelRateAsuransi a left join modelJenisKendaraan b on a.jenis_kendaraan = b.id left join modelJenisPembiayaan d on a.jenis_pembiayaan = d.id left join modelLoanType e on a.loan_type = e.id_komp left join modelTipeAsuransi f on a.tipeAsuransi = f.id left join modelWilayah g on a.wilayah = g.id")
    List<vwDataRateAsuransi> getListDataRateAsuransi();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataRateAsuransi(a.namaSkema, a.wilayah,g.namaWilayah,a.startOTR,a.endOTR,a.startyear,a.endyear,a.tipeAsuransi,f.namaAsuransi,a.startBerlaku,a.endBerlaku,a.loan_type,a.produk,a.jenis_kendaraan,b.jenis_kendaraan_id,a.jenis_pembiayaan,d.jenis_pembiayaan_id,a.statusApproved,a.remarks,a.program) from modelRateAsuransi a left join modelJenisKendaraan b on a.jenis_kendaraan = b.id left join modelJenisPembiayaan d on a.jenis_pembiayaan = d.id left join modelLoanType e on a.loan_type = e.id_komp left join modelTipeAsuransi f on a.tipeAsuransi = f.id left join modelWilayah g on a.wilayah = g.id where a.statusApproved = 0 OR a.statusApproved IS NULL")
    List<vwDataRateAsuransi> getListBucketApprovalRateAsuransi(Pageable pageable);

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaRateAsuransi(id,namaSkema) from modelRateAsuransi")
    List<vwSkemaRateAsuransi> getAllDataSkemaRateAsuransi();

}