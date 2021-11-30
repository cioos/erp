package com.cisoos.erp.dao;

import com.cisoos.erp.dao.pojo.PWPUvo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IPWPUdao extends JpaRepository<PWPUvo,Integer> {
    List<PWPUvo> findByWarehouseIdAndAndChargeUserId(Integer wid, Integer uid);
    List<PWPUvo> findByChargeUserId(Integer Uid);
    List<PWPUvo> findByWarehouseId(Integer Uid);

}
