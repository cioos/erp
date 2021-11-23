package com.cisoos.erp.service;
import  com.cisoos.erp.dao.pojo.PlatformWarehouseProductUser;

import java.util.List;

public interface IPWPUService {
    Iterable<PlatformWarehouseProductUser> getAllPlatformWarehouseProductUser();
    Iterable <PlatformWarehouseProductUser> getByUidAndWid(Integer Uid,Integer Wid);

}
