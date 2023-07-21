package com.example.testdocker.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Test {
    String select();
}
