package com.ifywork.student_springboot.controller;


import com.ifywork.student_springboot.aspect.CommonResp;
import com.ifywork.student_springboot.aspect.DataIsNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
public class FileUploadController {
    private String fileSavePath = "E:\\Test";

    @RequestMapping("/uploads")
    public CommonResp<List<String>> upload(MultipartFile[] uploadFiles, HttpServletRequest req) throws IOException {
        DataIsNull<String> dataIsNull = new DataIsNull<String>();
        return dataIsNull.listIsNull(uoload(uploadFiles));
    }

    @Async
     public List<String>  uoload(MultipartFile[] files) throws IOException {
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
