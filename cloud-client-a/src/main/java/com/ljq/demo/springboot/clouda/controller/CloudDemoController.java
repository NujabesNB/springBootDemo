package com.ljq.demo.springboot.clouda.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Description: spring cloud demo controller
 * @Author: junqiang.lu
 * @Date: 2018/10/17
 */
@RestController
public class CloudDemoController {

    @RequestMapping(value = "/info", method = {RequestMethod.GET,RequestMethod.POST})
    public String info(){
        System.out.println("Spring cloud module A controller,date: " + new Date());
        String demoStr = "Spring cloud demo. Server A";
        return demoStr;
    }



}
