package com.cxp.mapper;

import com.cxp.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StuMapper {
    Student getStu();
}
