package com.cn.cup.admin.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;


@RestController
public class HelloWorld {


    @GetMapping(value = "find")
    public Map<String, String> findAll() {

        Map<String, String> all = new HashMap<>();
        all.put("remark", "可以返回json，xml或自定义mediaType内容到页面");
        return all;
    }
}
