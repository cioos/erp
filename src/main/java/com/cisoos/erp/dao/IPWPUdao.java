package com.cisoos.erp.dao;

import com.cisoos.erp.dao.pojo.PlatformWarehouseProductUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;


public interface IPWPUdao extends JpaRepository<PlatformWarehouseProductUser ,Integer> {
    List<PlatformWarehouseProductUser> findByWarehouseIdAndAndChargeUserId(Integer wid,Integer uid);
    List<PlatformWarehouseProductUser> findByChargeUserId(Integer Uid);
    List<PlatformWarehouseProductUser> findByWarehouseId(Integer Uid);

}
