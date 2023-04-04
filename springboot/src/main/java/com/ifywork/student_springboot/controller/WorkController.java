package com.ifywork.student_springboot.controller;

import com.ifywork.student_springboot.aspect.CommonResp;
import com.ifywork.student_springboot.aspect.DataIsNull;
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
    public CommonResp<List<Map<String,String>>> selectStuTaskInfo(@RequestBody Map<String,String> map){
        String id = map.get("id");
        List<Map<String,String>> list = workService.selectStuWork(id);
        DataIsNull<Map<String,String>> dataIsNull = new DataIsNull<>();
        return dataIsNull.listIsNull(list);
    }

    @PostMapping("/selectMutualInfo")
    public CommonResp<List<Map<String,String>>> selectMutualInfo(@RequestBody Map<String,String> map){
        String id = map.get("id");
        List<Map<String,String>> list = workService.selectMutualWork(id);
        DataIsNull<Map<String,String>> dataIsNull = new DataIsNull<>();
        return dataIsNull.listIsNull(list);
    }

}
