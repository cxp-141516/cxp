package com.cxp.controller;

import com.cxp.bean.Student;
import com.cxp.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("test")
public class StuController {
    @Resource
    private StuService stuService;

    @RequestMapping("/nihao")
    @ResponseBody
    public String getStu(){
        Student getStu=stuService.getStu();
        return getStu.toString();
    }
}
