package com.cisoos.erp.service;
import com.cisoos.erp.dao.pojo.PWPUvo;

public interface IPWPUService {
    Iterable<PWPUvo> getAllPlatformWarehouseProductUser();
    Iterable <PWPUvo> getByUidAndWid(Integer Uid, Integer Wid);

}
