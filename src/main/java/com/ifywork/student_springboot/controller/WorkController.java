package com.ifywork.student_springboot.controller;

import com.ifywork.student_springboot.aspect.CommonResp;
import com.ifywork.student_springboot.bean.User;
import com.ifywork.student_springboot.service.UserService;
import com.ifywork.student_springboot.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/work")
public class WorkController {

    @Autowired
    private WorkService workService;

    @PostMapping("/selectStuTaskInfo")
    public CommonResp<List<Map<String,String>>> selectUserByUid(@RequestBody Map<String,String> map){
        String uid = map.get("uid");
        List<Map<String,String>> list = workService.selectStuWork(uid);

        CommonResp<List<Map<String,String>>> commonResp = new CommonResp<>();
        commonResp.setResult(list);
        commonResp.setCode(200);
        commonResp.setMsg("成功");
        return commonResp;
    }
}
