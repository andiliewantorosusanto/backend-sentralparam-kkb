package com.beCMS.BackendCentralParam.repository;

import java.util.Date;
import java.util.List;

import com.beCMS.BackendCentralParam.view.vwDataRateBunga;
import com.beCMS.BackendCentralParam.view.vwSkemaRateBunga;
import com.beCMS.BackendCentralParam.model.modelRateAsuransi;
import com.beCMS.BackendCentralParam.model.modelRateBunga;
import org.springframework.data.domain.Pageable;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface RateBungaRepository extends JpaRepository<modelRateBunga, Integer> {

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataRateBunga(a.namaSkema,a.loan_type,e.deskripsi,a.jenis_kendaraan,b.jenis_kendaraan_id as jenis_kendaraan,a.jenis_pembiayaan,d.jenis_pembiayaan_id as jenis_pembiayaan,a.cluster,c.cluster_id as cluster,a.start_tahun_kendaraan,a.end_tahun,a.start_berlaku,a.end_berlaku,a.statusApproved,a.Remarks) from modelRateBunga a left join modelJenisKendaraan b on a.jenis_kendaraan = b.id left join modelCluster c on a.cluster = c.id left join modelJenisPembiayaan d on a.jenis_pembiayaan = d.id left join modelLoanType e on a.loan_type = e.id_komp")
    List<vwDataRateBunga> getListDataRateBunga();

    @Query(value = "INSERT INTO sp_ratebunga_kkbsk (id,loan_type_produk,jenis_kendaraan,kondisi_kendaraan,start_tahun_kendaraan,end_tahun,start_berlaku,end_berlaku,tenor1,tenor2,tenor3,tenor4,tenor5periode1,tenor5periode2,tenor5rate1,tenor5rate2,tenor6periode1,tenor6periode2,tenor6rate1,tenor6rate2,tenor7periode1,tenor7periode2,tenor7rate1,tenor7rate2,tenor8periode1,tenor8periode2,tenor8rate1,tenor8rate2,tenor9periode1,tenor9periode2,tenor9rate1,tenor9rate2,tenor10periode1,tenor10periode2,tenor10rate1,tenor10rate2,operatorawal,operatorakhir,statusapproved,remarks,is_rejected,jenis_pembiayaan,tujuan_pembiayaan,is_approved,cluster,program,createddate,updatedate,updatedby,createdby,tipe_konsumen,is_login) VALUES (?1,?2,?3,?4,?5) ",nativeQuery = true)
    String inputRateBunga(Integer id, Integer loan_type, Integer produk, Integer jenis_kendaraan, Integer kondisi_kendaraan, Integer start_tahun_kendaraan, Integer end_tahun, Date start_berlaku, Date end_berlaku, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Integer tenor5periode1, Integer tenor5periode2, Float tenor5rate1, Float tenor5rate2, Integer tenor6periode1, Integer tenor6periode2, Float tenor6rate1, Float tenor6rate2, Integer tenor7periode1, Integer tenor7periode2, Float tenor7rate1, Float tenor7rate2, Integer tenor8periode1, Integer tenor8periode2, Float tenor8rate1, Float tenor8rate2, Integer tenor9periode1, Integer tenor9periode2, Float tenor9rate1, Float tenor9rate2, Integer tenor10periode1, Integer tenor10periode2, Float tenor10rate1, Float tenor10rate2, String operatorAwal, String operatorAkhir, String statusApproved, String Remarks, String is_rejected, Integer jenis_pembiayaan, Integer tujuan_pembiayaan, Integer is_approved, Integer cluster, Integer program, Date createddate, Date updatedate, Integer updatedby, Integer createdby, Integer tipe_konsumen, Integer is_login);

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataRateBunga(a.namaSkema,a.loan_type,e.deskripsi,a.jenis_kendaraan,b.jenis_kendaraan_id as jenis_kendaraan,a.jenis_pembiayaan,d.jenis_pembiayaan_id as jenis_pembiayaan,a.cluster,c.cluster_id as cluster,a.start_tahun_kendaraan,a.end_tahun,a.start_berlaku,a.end_berlaku,a.statusApproved,a.Remarks) from modelRateBunga a left join modelJenisKendaraan b on a.jenis_kendaraan = b.id left join modelCluster c on a.cluster = c.id left join modelJenisPembiayaan d on a.jenis_pembiayaan = d.id left join modelLoanType e on a.loan_type = e.id_komp where a.statusApproved = 0 OR a.statusApproved IS NULL")
    List<vwDataRateBunga> getListBucketApprovalRateBunga();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaRateBunga(id,namaSkema) from modelRateBunga")
    List<vwSkemaRateBunga> getAllDataSkemaRateBunga();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaRateBunga(id,namaSkema) from modelRateBunga")
    List<vwSkemaRateBunga> getAllDataSkemaMinimalDP();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaRateBunga(id,namaSkema) from modelRateBunga")
    List<vwSkemaRateBunga> getAllDataSkemaKomponenPH();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaRateBunga(id,namaSkema) from modelRateBunga")
    List<vwSkemaRateBunga> getAllDataSkemaGaransiKendaraan();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaRateBunga(id,namaSkema) from modelRateBunga")
    List<vwSkemaRateBunga> getAllDataSkemaRatePerluasan();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaRateBunga(id,namaSkema) from modelRateBunga")
    List<vwSkemaRateBunga> getAllDataSkemaRateProvisi();


}