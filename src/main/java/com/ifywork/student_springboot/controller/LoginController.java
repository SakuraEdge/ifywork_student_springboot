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
    public CommonResp<User> selectUserByUid(@RequestBody Map<String,String> map){
        String uid = map.get("uid");


        User user = loginService.selectUserByUid(uid);

        CommonResp<User> commonResp = new CommonResp<>();
        commonResp.setResult(user);
        commonResp.setCode(200);
        commonResp.setMsg("成功");


        return commonResp;
    }

    @PostMapping("/checkUserLogin")
    public CommonResp<User> checkUserLogin(@RequestBody Map<String,String> map){
        String uid = map.get("uid");
        String pwd = map.get("pwd");

        User user = loginService.checkUser(uid,pwd);

        CommonResp<User> commonResp = new CommonResp<>();
        if (user != null){
            commonResp.setCode(200);
            commonResp.setResult(user);
            commonResp.setMsg("登录成功！");
        }
        else {
            commonResp.setCode(500);
            commonResp.setResult(null);
            commonResp.setMsg("登录失败！");
        }
        return commonResp;
    }
}
