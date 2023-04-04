package com.ifywork.student_springboot.controller;


import com.ifywork.student_springboot.aspect.CommonResp;
import com.ifywork.student_springboot.aspect.DataIsNull;
import com.ifywork.student_springboot.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class FileUploadController {
    private String filePath = "E:\\Test\\";

    @Autowired
    TaskService taskService;

    @RequestMapping("/uploadsWork")
    public CommonResp<List<String>> upload(MultipartFile[] uploadFiles, String studentID,String taskID) throws IOException {
        DataIsNull<String> dataIsNull = new DataIsNull<String>();

        String fileSavePath = filePath + "studentID_" + studentID + "_" + "taskID_" + taskID + "\\";
        taskService.updateTaskFilePath(taskID,fileSavePath);
        Files.createDirectories(Paths.get(fileSavePath));
        return dataIsNull.listIsNull(upload(uploadFiles,fileSavePath));
    }

    @Async
     public List<String>  upload(MultipartFile[] files,String fileSavePath) throws IOException {
        List<String> paths = new ArrayList<>();
        if (files.length > 0){
            for (MultipartFile file : files) {
                if (!file.isEmpty()){
                    String originalFilename = file.getOriginalFilename();
                    SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMddHHmmss");
                    String path = fileSavePath+ sdf.format(System.currentTimeMillis()) + "_" + originalFilename;
                    paths.add(path);
                    file.transferTo(new File(path));
                }
            }
        }
        return  paths;
      }
}
