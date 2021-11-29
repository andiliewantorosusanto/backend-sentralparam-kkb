package com.beCMS.BackendCentralParam.repository;

import java.util.List;
import org.springframework.data.domain.Pageable;
import com.beCMS.BackendCentralParam.model.modelProgram;
import com.beCMS.BackendCentralParam.model.modelRateBunga;
import com.beCMS.BackendCentralParam.view.vwDataProgram;
import com.beCMS.BackendCentralParam.view.vwSkemaRateBunga;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface ProgramRepository extends JpaRepository<modelProgram, Integer> {

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataProgram(a.id, a.program, a.produk,m.produk as nama_produk, a.deskripsi, a.start_date, a.end_date, a.is_approved, a.is_rejected, a.remarks, a.createdby, a.createddate, a.updatedby, a.updateddate, a.BranchId, a.id_biayaadmin,f.namaSkema as nama_skema_biayaadmin, a.id_rateasuransi,d.namaSkema as nama_skema_rateasuransi, a.id_ratebunga,c.namaSkema as nama_skema_ratebunga, a.id_ratecp,c.namaSkema as nama_skema_ratecp, a.id_minimaldp,g.namaSkema as nama_skema_minimaldp, a.id_komponenph,h.namaSkema as nama_skema_komponenph, a.id_rateperluasan,i.namaSkema as nama_skema_rateperluasan, a.id_biayaprovisi,j.namaSkema as nama_skema_biayaprovisi, a.id_biayafidusia,k.namaSkema as nama_skema_biayafidusia, a.id_usiakendaraanlunas, l.namaSkema as nama_skema_usiakendaraanlunas) from modelProgram a "
    +" LEFT JOIN modelProduk b ON a.produk = b.id"
    +" LEFT JOIN modelRateBunga c ON a.id_ratebunga = c.id"
    +" LEFT JOIN modelRateAsuransi d ON a.id_rateasuransi = d.id"
    +" LEFT JOIN modelRateCP e ON a.id_ratecp = e.id"
    +" LEFT JOIN modelBiayaAdmin f ON a.id_biayaadmin = f.id"
    +" LEFT JOIN modelMinimalDP g ON a.id_minimaldp = g.id"
    +" LEFT JOIN modelKomponenPH h ON a.id_komponenph = h.id"
    +" LEFT JOIN modelPerluasanAsuransi i ON a.id_rateperluasan = i.id"
    +" LEFT JOIN modelBiayaProvisi j ON a.id_biayaprovisi = j.id"
    +" LEFT JOIN modelBiayaFidusia k ON a.id_biayafidusia = k.id"
    +" LEFT JOIN modelUsiaKendaraanLunas l ON a.id_usiakendaraanlunas = l.id"
    +" LEFT JOIN modelProduk m ON a.produk = m.id")
    List<vwDataProgram> getListDataProgram();


    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataProgram(a.id, a.program, a.produk,m.produk as nama_produk, a.deskripsi, a.start_date, a.end_date, a.is_approved, a.is_rejected, a.remarks, a.createdby, a.createddate, a.updatedby, a.updateddate, a.BranchId, a.id_biayaadmin,f.namaSkema as nama_skema_biayaadmin, a.id_rateasuransi,d.namaSkema as nama_skema_rateasuransi, a.id_ratebunga,c.namaSkema as nama_skema_ratebunga, a.id_ratecp,c.namaSkema as nama_skema_ratecp, a.id_minimaldp,g.namaSkema as nama_skema_minimaldp, a.id_komponenph,h.namaSkema as nama_skema_komponenph, a.id_rateperluasan,i.namaSkema as nama_skema_rateperluasan, a.id_biayaprovisi,j.namaSkema as nama_skema_biayaprovisi, a.id_biayafidusia,k.namaSkema as nama_skema_biayafidusia, a.id_usiakendaraanlunas, l.namaSkema as nama_skema_usiakendaraanlunas) from modelProgram a "
    +" LEFT JOIN modelProduk b ON a.produk = b.id"
    +" LEFT JOIN modelRateBunga c ON a.id_ratebunga = c.id"
    +" LEFT JOIN modelRateAsuransi d ON a.id_rateasuransi = d.id"
    +" LEFT JOIN modelRateCP e ON a.id_ratecp = e.id"
    +" LEFT JOIN modelBiayaAdmin f ON a.id_biayaadmin = f.id"
    +" LEFT JOIN modelMinimalDP g ON a.id_minimaldp = g.id"
    +" LEFT JOIN modelKomponenPH h ON a.id_komponenph = h.id"
    +" LEFT JOIN modelPerluasanAsuransi i ON a.id_rateperluasan = i.id"
    +" LEFT JOIN modelBiayaProvisi j ON a.id_biayaprovisi = j.id"
    +" LEFT JOIN modelBiayaFidusia k ON a.id_biayafidusia = k.id"
    +" LEFT JOIN modelUsiaKendaraanLunas l ON a.id_usiakendaraanlunas = l.id"
    +" LEFT JOIN modelProduk m ON a.produk = m.id where a.is_approved = 0 OR a.is_approved IS NULL")
    List<vwDataProgram> getListBucketApprovalDataProgram();


    // @Query(value =  "SELECT a.id, a.program, a.produk, a.deskripsi, a.start_date, a.end_date, a.is_approved, a.is_rejected, a.remarks, a.createdby, a.createddate, a.updatedby, a.updateddate, a.BranchId,a.id_biayaadmin,a.id_rateasuransi,a.id_ratebunga,a.id_ratecp,a.id_minimaldp,a.id_komponenph,a.id_rateperluasan,a.id_biayaprovisi,a.id_biayafidusia,a.id_usiakendaraanlunas from modelProgram a "
    // +"LEFT JOIN modelProduk b ON a.produk = b.id"
    // +"LEFT JOIN modelRateBunga c ON a.id_ratebunga = c.id"
    // +"LEFT JOIN modelRateAsuransi d ON a.id_rateasuransi = d.id"
    // +"LEFT JOIN modelRateCP e ON a.id_ratecp = e.id"
    // +"LEFT JOIN modelBiayaAdmin f ON a.id_biayaadmin = f.id"
    // +"LEFT JOIN modelMinimalDP g ON a.id_minimaldp = g.id"
    // +"LEFT JOIN modelKomponenPH h ON a.id_komponenph = h.id"
    // +"LEFT JOIN modelPerluasanAsuransi i ON a.id_rateperluasan = i.id"
    // +"LEFT JOIN modelBiayaProvisi j ON a.id_biayaprovisi = j.id"
    // +"LEFT JOIN modelBiayaFidusia k ON a.id_biayafidusia = k.id"
    // +"LEFT JOIN modelUsiaKendaraanLunas l ON a.id_usiakendaraanlunas = l.id",nativeQuery = true)
    // List<vwDataProgram> getListDataProgramNative();

    // @Query(value = "SELECT a.jenis_kendaraan,a.produk,a.tenor1,a.tenor2,a. tenor3,a. tenor4,a. tenor5,a. tenor6,a. tenor7,a. tenor8,a. tenor9,a. tenor10,a.startBerlaku,a.endBerlaku,a.is_approved,a.Remarks from sp_ratecp a left join sp_jenisKendaraan b on a.jenis_kendaraan = b.id", nativeQuery = true)
    // List<vwDataRateCP> getNativeListDataRateCP();


}