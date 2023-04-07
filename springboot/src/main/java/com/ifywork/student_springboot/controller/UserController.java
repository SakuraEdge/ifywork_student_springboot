package com.ifywork.student_springboot.controller;

import com.ifywork.student_springboot.aspect.CommonResp;
import com.ifywork.student_springboot.aspect.DataIsNull;
import com.ifywork.student_springboot.bean.User;
import com.ifywork.student_springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据uid查询用户
     * @param map uid
     * @return User
     */
    @PostMapping("/selectUserByUid")
    public CommonResp<User> selectUserByUid(@RequestBody Map<String,String> map){
        String uid = map.get("uid");
        User user = userService.selectUserByUid(uid);
        DataIsNull<User> dataIsNull = new DataIsNull<>();
        return dataIsNull.noIsNull(user);
    }

    /**
     * 登录查询
     * @param map uid
     * @return User
     */
    @PostMapping("/checkUserLogin")
    public CommonResp<User> checkUserLogin(@RequestBody Map<String,String> map){
        String uid = map.get("uid");
        String pwd = map.get("pwd");

        User user = userService.checkUser(uid,pwd);

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
