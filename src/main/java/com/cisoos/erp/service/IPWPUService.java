package com.cisoos.erp.service;
import com.cisoos.erp.dao.vo.PWPUvo;

public interface IPWPUService {
    Iterable<PWPUvo> getAllPlatformWarehouseProductUser();
    Iterable <PWPUvo> getByUidAndWid(Integer Uid, Integer Wid);

}
