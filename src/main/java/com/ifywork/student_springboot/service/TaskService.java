package com.ifywork.student_springboot.service;

import com.ifywork.student_springboot.bean.Task;

import java.util.List;

public interface TaskService {

    List<Task> selectTaskByClassID(String cid);

    List<Task> selectStuNoTask(String uid);
}
