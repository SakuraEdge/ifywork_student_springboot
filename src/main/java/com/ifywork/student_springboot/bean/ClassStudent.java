package com.ifywork.student_springboot.bean;

import java.io.Serializable;
import java.util.Date;


public class ClassStudent implements Serializable{
    /** 创建人 */
    private String createdBy ;
    /** 创建时间 */
    private Date createdTime ;
    /** 更新人 */
    private String updatedBy ;
    /** 更新时间 */
    private Date updatedTime ;
    /** 主键 */
    private Integer id ;
    /** 班级id;外键，连接class表id */
    private Integer classId ;
    /** 学生id;外键，连接user表id */
    private Integer studentId ;

    /** 创建人 */
    public String getCreatedBy(){
        return this.createdBy;
    }
    /** 创建人 */
    public void setCreatedBy(String createdBy){
        this.createdBy = createdBy;
    }
    /** 创建时间 */
    public Date getCreatedTime(){
        return this.createdTime;
    }
    /** 创建时间 */
    public void setCreatedTime(Date createdTime){
        this.createdTime = createdTime;
    }
    /** 更新人 */
    public String getUpdatedBy(){
        return this.updatedBy;
    }
    /** 更新人 */
    public void setUpdatedBy(String updatedBy){
        this.updatedBy = updatedBy;
    }
    /** 更新时间 */
    public Date getUpdatedTime(){
        return this.updatedTime;
    }
    /** 更新时间 */
    public void setUpdatedTime(Date updatedTime){
        this.updatedTime = updatedTime;
    }
    /** 主键 */
    public Integer getId(){
        return this.id;
    }
    /** 主键 */
    public void setId(Integer id){
        this.id = id;
    }
    /** 班级id;外键，连接class表id */
    public Integer getClassId(){
        return this.classId;
    }
    /** 班级id;外键，连接class表id */
    public void setClassId(Integer classId){
        this.classId = classId;
    }
    /** 学生id;外键，连接user表id */
    public Integer getStudentId(){
        return this.studentId;
    }
    /** 学生id;外键，连接user表id */
    public void setStudentId(Integer studentId){
        this.studentId = studentId;
    }
}