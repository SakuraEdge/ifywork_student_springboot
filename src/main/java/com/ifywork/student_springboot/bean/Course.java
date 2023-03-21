package com.ifywork.student_springboot.bean;

import java.io.Serializable;
import java.util.Date;


public class Course implements Serializable{
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
    /** 课程名称 */
    private String courseName ;
    /** 课程简介 */
    private String courseIntroduce ;
    /** 上课时间;设置起始周于结束周，使用"-"进行连接，具体时间信息使用"|" 衔接，多个时间段使用 ","进行分割
     例如：
     1-7|2|1-2,9-12|3|3-4
     表示该课程的上课时间为1到7周星期二的1到2节，和9到12周星期三的3到4节 */
    private String courseTime ;
    /** 上课地址 */
    private String courseAddress ;
    /** 主讲老师id;外键，连接user表id */
    private String teacherMainId ;
    /** 助教老师id;使用","分割 */
    private String teacherAssistId ;

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
    /** 课程名称 */
    public String getCourseName(){
        return this.courseName;
    }
    /** 课程名称 */
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    /** 课程简介 */
    public String getCourseIntroduce(){
        return this.courseIntroduce;
    }
    /** 课程简介 */
    public void setCourseIntroduce(String courseIntroduce){
        this.courseIntroduce = courseIntroduce;
    }
    /** 上课时间;设置起始周于结束周，使用"-"进行连接，具体时间信息使用"|" 衔接，多个时间段使用 ","进行分割
     例如：
     1-7|2|1-2,9-12|3|3-4
     表示该课程的上课时间为1到7周星期二的1到2节，和9到12周星期三的3到4节 */
    public String getCourseTime(){
        return this.courseTime;
    }
    /** 上课时间;设置起始周于结束周，使用"-"进行连接，具体时间信息使用"|" 衔接，多个时间段使用 ","进行分割
     例如：
     1-7|2|1-2,9-12|3|3-4
     表示该课程的上课时间为1到7周星期二的1到2节，和9到12周星期三的3到4节 */
    public void setCourseTime(String courseTime){
        this.courseTime = courseTime;
    }
    /** 上课地址 */
    public String getCourseAddress(){
        return this.courseAddress;
    }
    /** 上课地址 */
    public void setCourseAddress(String courseAddress){
        this.courseAddress = courseAddress;
    }
    /** 主讲老师id;外键，连接user表id */
    public String getTeacherMainId(){
        return this.teacherMainId;
    }
    /** 主讲老师id;外键，连接user表id */
    public void setTeacherMainId(String teacherMainId){
        this.teacherMainId = teacherMainId;
    }
    /** 助教老师id;使用","分割 */
    public String getTeacherAssistId(){
        return this.teacherAssistId;
    }
    /** 助教老师id;使用","分割 */
    public void setTeacherAssistId(String teacherAssistId){
        this.teacherAssistId = teacherAssistId;
    }
}