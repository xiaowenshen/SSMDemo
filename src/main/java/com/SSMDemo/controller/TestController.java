package com.SSMDemo.controller;

import com.SSMDemo.common.ServerResponse;
import com.SSMDemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiao on 2018/3/30.
 */
@Controller
@RequestMapping("/test/")
public class TestController {

    @Autowired
    private  IUserService iUserService;

    @RequestMapping("test.do")
    @ResponseBody
    public ServerResponse<String> testMethod(){
        String res = iUserService.Test();
        return  ServerResponse.createBySuccess("success : getUser  " + res);
    }
}
