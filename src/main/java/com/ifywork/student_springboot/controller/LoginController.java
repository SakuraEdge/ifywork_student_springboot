package com.ifywork.student_springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {


    @PostMapping("/login")
    public CommonResp<String> login(@RequestBody Map<String,String> map){
        String role = map.get("role");

        CommonResp<String> commonResp = new CommonResp<>();

        commonResp.setCode(200);
        commonResp.setMsg("我是超人强，越超人越强");
        commonResp.setResult(role);

        return commonResp;
    }
}
