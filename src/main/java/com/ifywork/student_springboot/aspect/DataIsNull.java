package com.ifywork.student_springboot.aspect;

import java.util.List;
import java.util.Map;

/**
 * 工具类，用于判断查询的值是否为空值
 * 根据是否空值返回对应的code和msg
 */
public class DataIsNull<T> {

    public CommonResp<T> listIsNull(T list) {
        CommonResp<T> commonResp = new CommonResp<>();
        commonResp.setResult(list);
        if (list==null){
            commonResp.setCode(300);
            commonResp.setMsg("没有数据");
        }
        else {
            commonResp.setCode(200);
            commonResp.setMsg("成功");
        }
        return commonResp;
    }
}
