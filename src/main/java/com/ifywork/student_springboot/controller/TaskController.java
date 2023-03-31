package com.ifywork.student_springboot.controller;

import com.ifywork.student_springboot.aspect.CommonResp;
import com.ifywork.student_springboot.aspect.DataIsNull;
import com.ifywork.student_springboot.bean.Course;
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

    @PostMapping("/selectTaskByCourseName")
    public CommonResp<List<Task>> selectTaskByClassID(@RequestBody Map<String,String> map){
        String name = map.get("courseName");

        List<Task> list = taskService.selectTaskByClassName(name);

        DataIsNull<List<Task>> dataIsNull = new DataIsNull<>();
        return dataIsNull.listIsNull(list);
    }

    @PostMapping("/selectStuTask")
    public CommonResp<List<Task>> selectStuTask(@RequestBody Map<String,String> map){
        String id = map.get("id");

        List<Task> list = taskService.selectStuTask(id);

        DataIsNull<List<Task>> dataIsNull = new DataIsNull<>();
        return dataIsNull.listIsNull(list);
    }

}
