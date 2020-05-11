/**************************************************************************
 * Copyright (c) 2017-2020 ZheJiang Electronic Port, Inc.
 * All rights reserved.
 * 
 * 项目名称：嘉兴市港务管理局可视化查询服务项目
 * 版权说明：本软件属浙江电子口岸有限公司所有，在未获得浙江电子口岸有限公司正式授权
 *           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
 *           识产权保护的内容。                            
 ***************************************************************************/
package com.cn.cup.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
  * 测试类
  * @author &lt;a href="mailto:guozl@zjport.gov.cn gzl
  * @version V1.0 22:44 guozl
  * @since 1.0
  */

@RestController
public class HelloWorld {

    @RequestMapping(value = "find", method = RequestMethod.GET)
    public Map<String, String> findAll() {
        Map<String, String> all = new HashMap<>();
        all.put("remark", "可以返回json，xml或自定义mediaType内容到页面");
        return all;
    }
}
