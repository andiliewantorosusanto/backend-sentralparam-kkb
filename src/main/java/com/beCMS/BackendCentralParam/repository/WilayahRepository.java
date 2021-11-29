package com.beCMS.BackendCentralParam.repository;

import java.util.Date;
import java.util.List;

import com.beCMS.BackendCentralParam.view.vwDataRateBunga;
import com.beCMS.BackendCentralParam.view.vwSkemaRateBunga;
import com.beCMS.BackendCentralParam.model.modelRateAsuransi;
import com.beCMS.BackendCentralParam.model.modelRateBunga;
import com.beCMS.BackendCentralParam.model.modelWilayah;

import org.springframework.data.domain.Pageable;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface WilayahRepository extends JpaRepository<modelWilayah, Integer> {

}