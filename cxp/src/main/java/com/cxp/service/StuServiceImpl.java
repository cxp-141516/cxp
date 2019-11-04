package com.cxp.service;

import com.cxp.bean.Student;
import com.cxp.mapper.StuMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StuServiceImpl implements StuService{
    @Resource
    private StuMapper stuMapper;

    @Override
    public Student getStu() {
        Student student = stuMapper.getStu();
        return student;
    }
}
