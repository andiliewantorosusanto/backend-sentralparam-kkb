package com.beCMS.BackendCentralParam.repository;

import java.util.List;
import org.springframework.data.domain.Pageable;

import com.beCMS.BackendCentralParam.model.modelPerluasanAsuransi;
import com.beCMS.BackendCentralParam.model.modelRateAsuransi;
import com.beCMS.BackendCentralParam.model.modelTipeAsuransi;
import com.beCMS.BackendCentralParam.view.vwDataRateAsuransi;
import com.beCMS.BackendCentralParam.view.vwDataRatePerluasanAsuransi;
import com.beCMS.BackendCentralParam.view.vwSkemaPerluasanAsuransi;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface TipeAsuransiRepository extends JpaRepository<modelTipeAsuransi, Integer> {
}