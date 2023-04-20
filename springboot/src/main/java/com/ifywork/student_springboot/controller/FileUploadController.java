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

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class FileUploadController {
    private String filePath = "E:\\Test\\";

    @Autowired
    TaskService taskService;

    /**
     * 学生上传任务
     * @param file
     * @return List
     */
    @RequestMapping("/uploadsWork")
    public CommonResp<List<String>> uploadWork(MultipartFile[] file, String studentID,String taskID) throws IOException {
        DataIsNull<String> dataIsNull = new DataIsNull<String>();

        String fileSavePath = filePath + "studentID_" + studentID + "_" + "taskID_" + taskID + "\\";
        taskService.updateTaskFilePath(taskID,fileSavePath);
        Files.createDirectories(Paths.get(fileSavePath));
        return dataIsNull.listIsNull(upload(file,fileSavePath));
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

    @RequestMapping("/getFileName")
      public CommonResp<List<String>> getFileName(@RequestBody Map<String,String> map){
        String studentID = map.get("studentID");
        String taskCode = map.get("taskCode");

        String taskID = taskService.selectTaskByTCode(studentID,taskCode).get("id");
        String path = filePath + "studentID_" + studentID + "_" + "taskID_" + taskID + "\\";

        DataIsNull<String> dataIsNull = new DataIsNull<String>();

        return dataIsNull.listIsNull(getFileNames(path));
      }

    /**
     * @param response
     * @功能描述 下载文件:将输入流中的数据循环写入到响应输出流中，而不是一次性读取到内存
     */
    @RequestMapping("/downloadLocal")
    public void downloadLocal(@RequestBody Map<String,String> map,HttpServletResponse response) throws IOException {
        String studentID = map.get("studentID");
        String taskCode = map.get("taskCode");
        String fileName = map.get("fileName");

        String taskID = taskService.selectTaskByTCode(studentID,taskCode).get("id");
        String path = filePath + "studentID_" + studentID + "_" + "taskID_" + taskID + "\\" + fileName;



        InputStream inputStream = Files.newInputStream(Paths.get(path));// 文件的存放路径
        response.reset();
        response.setContentType("application/octet-stream");
        String filename = new File(path).getName();
        response.addHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(filename, "UTF-8"));
        ServletOutputStream outputStream = response.getOutputStream();
        byte[] b = new byte[1024];
        int len;

        while ((len = inputStream.read(b)) > 0) {
            outputStream.write(b, 0, len);
        }
        inputStream.close();
    }

    /**
     * 得到文件名称
     *
     * @param path 路径
     * @return {@link List}<{@link String}>
     */
    private List<String> getFileNames(String path) {
        File file = new File(path);
        if (!file.exists()) {
            return null;
        }
        List<String> fileNames = new ArrayList<>();
        return getFileNames(file, fileNames);
    }

    /**
     * 得到文件名称
     *
     * @param file      文件
     * @param fileNames 文件名
     * @return {@link List}<{@link String}>
     */
    private List<String> getFileNames(File file, List<String> fileNames) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getFileNames(f, fileNames);
            } else {
                fileNames.add(f.getName());
            }
        }
        return fileNames;
    }
}
