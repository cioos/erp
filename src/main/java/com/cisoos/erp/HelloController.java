package com.cisoos.erp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cisoos.erp.dao.IPWPUdao;

@Controller
public class HelloController {
    @Autowired
    private IPWPUdao pwpUdao;
    @ResponseBody
    @RequestMapping("hello")

    public String hello(){

        String a = String.valueOf(pwpUdao.findById(1).toString());
        return a;
    }

}
