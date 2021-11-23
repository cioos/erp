package com.cisoos.erp;

import com.cisoos.erp.dao.IPWPUdao;
import com.cisoos.erp.dao.pojo.PlatformWarehouseProductUser;
import com.cisoos.erp.service.IPWPUService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class Hellotest {
    @Autowired
    private IPWPUdao ipwpUdao;
    @Resource
    private IPWPUService ipwpuService;

    @ResponseBody
    @RequestMapping("hello1")
    public String hello(HttpServletRequest request) {

        return String.valueOf(ipwpUdao.findByWarehouseIdAndAndChargeUserId(Integer.valueOf(request.getParameter("wid")), Integer.valueOf(request.getParameter("uid"))));
    }

    @ResponseBody
    @RequestMapping("hellotest")
    public List<PlatformWarehouseProductUser> hello() {
        List<PlatformWarehouseProductUser> ap = (List<PlatformWarehouseProductUser>) ipwpuService.getAllPlatformWarehouseProductUser();
        for (PlatformWarehouseProductUser a1 : ap) System.out.println(a1);
        return ap;
    }

    @ResponseBody
    @RequestMapping("hellotestuw")
    public List<PlatformWarehouseProductUser> helloa(HttpServletRequest request) {
        List<PlatformWarehouseProductUser> ap = (List<PlatformWarehouseProductUser>) ipwpuService.getByUidAndWid(Integer.valueOf(request.getParameter("Uid")),Integer.valueOf(request.getParameter("Wid")) );
        for (PlatformWarehouseProductUser a1 : ap) System.out.println(a1);
        return ap;
    }
}

