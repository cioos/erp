package com.cisoos.erp;

import com.cisoos.erp.dao.IPWPUdao;
import com.cisoos.erp.dao.vo.PWPUvo;
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
    public List<PWPUvo> hello() {
        List<PWPUvo> ap = (List<PWPUvo>) ipwpuService.getAllPlatformWarehouseProductUser();
        for (PWPUvo a1 : ap) System.out.println(a1);
        return ap;
    }

    @ResponseBody
    @RequestMapping("uw")
    public List<PWPUvo> helloa(HttpServletRequest request) {
        List<PWPUvo> ap = (List<PWPUvo>) ipwpuService.getByUidAndWid(Integer.valueOf(request.getParameter("Uid")),Integer.valueOf(request.getParameter("Wid")) );
        for (PWPUvo a1 : ap) System.out.println(a1);
        return ap;
    }
}

