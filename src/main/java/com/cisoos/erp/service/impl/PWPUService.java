package com.cisoos.erp.service.impl;

import com.cisoos.erp.dao.IPWPUdao;
import com.cisoos.erp.dao.pojo.PlatformWarehouseProductUser;
import com.cisoos.erp.service.IPWPUService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PWPUService implements IPWPUService {
    @Resource
    private IPWPUdao ipwpUdao;
    @Override
    public List <PlatformWarehouseProductUser> getAllPlatformWarehouseProductUser(){
        return ipwpUdao.findAll();
    }

    @Override
    public List<PlatformWarehouseProductUser> getByUidAndWid(Integer Uid, Integer Wid) {
        return ipwpUdao.findByWarehouseIdAndAndChargeUserId( Uid,Wid);
    }


}
