package com.ifywork.student_springboot.service.impl;

import com.ifywork.student_springboot.bean.Task;
import com.ifywork.student_springboot.dao.TaskDao;
import com.ifywork.student_springboot.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Override
    public List<Task> selectTaskByClassID(String cid) {
        return taskDao.selectTaskByClassID(cid);
    }

    @Override
    public List<Task> selectStuNoTask(String uid) {
        return taskDao.selectStuNoTask(uid);
    }
}
