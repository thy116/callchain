package com.example.demo.mapper;

import com.example.demo.pojo.callchain;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface callchainMapper {
    @Select("select * from callchain")
    List<callchain> findAll();
}