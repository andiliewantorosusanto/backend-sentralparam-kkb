package com.beCMS.BackendCentralParam.repository;

import java.util.List;
import org.springframework.data.domain.Pageable;

import com.beCMS.BackendCentralParam.model.modelProduk;
import com.beCMS.BackendCentralParam.model.modelProgram;
import com.beCMS.BackendCentralParam.model.modelRateBunga;
import com.beCMS.BackendCentralParam.view.vwDataProgram;
import com.beCMS.BackendCentralParam.view.vwSkemaRateBunga;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface ProdukRepository extends JpaRepository<modelProduk, Integer> {


}