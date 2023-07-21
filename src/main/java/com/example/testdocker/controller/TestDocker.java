package com.example.testdocker.controller;

import com.example.testdocker.mapper.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("api/docker")
public class TestDocker {

    @Resource
    private Test test;

    @GetMapping
    public String testDocker() {

        return test.select();
    }
}
