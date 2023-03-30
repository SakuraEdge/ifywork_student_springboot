package com.ifywork.student_springboot.service;

import java.util.List;
import java.util.Map;

public interface WorkService {
    
    List<Map<String,String>> selectStuWork(String uid);
}
