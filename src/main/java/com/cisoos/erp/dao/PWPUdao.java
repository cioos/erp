package com.cisoos.erp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cisoos.erp.dao.vo.PlatformWarehouseProductUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface PWPUdao extends PagingAndSortingRepository<PlatformWarehouseProductUser, Integer> {
    List<PlatformWarehouseProductUser> findByWarehouseIdAndAndChargeUserId(Integer wid,Integer uid);
}
