package com.ifywork.student_springboot.controller;

import com.ifywork.student_springboot.aspect.CommonResp;
import com.ifywork.student_springboot.bean.Task;
import com.ifywork.student_springboot.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/selectTaskByClassName")
    public CommonResp<List<Task>> selectTaskByClassID(@RequestBody Map<String,String> map){
        String name = map.get("className");

        List<Task> list = taskService.selectTaskByClassName(name);

        CommonResp<List<Task>> commonResp = new CommonResp<>();
        commonResp.setResult(list);
        commonResp.setCode(200);

        return commonResp;
    }

    @PostMapping("/selectStuNoTask")
    public CommonResp<List<Task>> selectStuTask(@RequestBody Map<String,String> map){
        String id = map.get("uid");

        List<Task> list = taskService.selectStuTask(id);

        CommonResp<List<Task>> commonResp = new CommonResp<>();
        commonResp.setCode(200);
        commonResp.setResult(list);

        return commonResp;

    }

}
