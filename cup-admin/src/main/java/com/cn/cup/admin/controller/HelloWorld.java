package com.cn.cup.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class HelloWorld {

    @RequestMapping(value = "find", method = RequestMethod.GET)
    public Map<String, String> findAll() {
        Map<String, String> all = new HashMap<>();
        all.put("remark", "可以返回json，xml或自定义mediaType内容到页面");
        return all;
    }
}
