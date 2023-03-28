package com.ifywork.student_springboot.controller;

import com.ifywork.student_springboot.bean.User;
import com.ifywork.student_springboot.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/selectUserByUid")
    public CommonResp<User> login(@RequestBody Map<String,String> map){
        String uid = map.get("uid");


        User user = loginService.selectUserByUid(uid);

        CommonResp<User> commonResp = new CommonResp<>();
        commonResp.setResult(user);
        commonResp.setCode(200);
        commonResp.setMsg("成功");


        return commonResp;
    }
}
