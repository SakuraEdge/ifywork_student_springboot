package com.ifywork.student_springboot.service.impl;

import com.ifywork.student_springboot.bean.Task;
import com.ifywork.student_springboot.bean.TaskMutual;
import com.ifywork.student_springboot.dao.TaskDao;
import com.ifywork.student_springboot.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Override
    public List<Task> selectTaskByClassName(String cname) {
        return taskDao.selectTaskByClassName(cname);
    }

    @Override
    public List<Task> selectStuTask(String id) {
        return taskDao.selectStuTask(id);
    }

    @Override
    public String selectTaskNameByTaskID(String taskID) {
        return taskDao.selectTaskNameByTaskID(taskID);
    }

    @Override
    public List<TaskMutual> selectStuMutual(String id) {
        return taskDao.selectStuMutual(id);
    }

    @Override
    public int updateTaskFilePath(String taskID, String filePath) {
        return taskDao.updateTaskFilePath(taskID,filePath);
    }

}
