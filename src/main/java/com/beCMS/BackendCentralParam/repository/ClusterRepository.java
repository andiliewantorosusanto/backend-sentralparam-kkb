package com.beCMS.BackendCentralParam.repository;

import com.beCMS.BackendCentralParam.model.modelCluster;


import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface ClusterRepository extends JpaRepository<modelCluster, Integer> {

}