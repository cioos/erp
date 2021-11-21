package com.cisoos.erp;

import com.cisoos.erp.dao.PWPUdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Hellotest {
    @Autowired
    private PWPUdao pwpUdao;

    @ResponseBody
    @RequestMapping("hellotest")
    public String hello(HttpServletRequest request) {

        return String.valueOf(pwpUdao.findByWarehouseIdAndAndChargeUserId(Integer.valueOf(request.getParameter("wid")), Integer.valueOf(request.getParameter("uid"))));
    }
}
