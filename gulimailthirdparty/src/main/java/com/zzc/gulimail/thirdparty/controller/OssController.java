package com.zzc.gulimail.thirdparty.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author: 赵智超
 * @date: 2023/07/14/15:43
 * @Description:
 */
@RestController
@RequestMapping("/thirdparty/")
public class OssController {

    @RequestMapping("oss/policy")
    public Map<String,String> policy(){

        return null;
    }
}
