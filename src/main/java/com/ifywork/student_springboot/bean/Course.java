package com.ifywork.student_springboot.bean;

import java.io.Serializable;
import java.util.Date;


public class Course implements Serializable{
    /** 创建人 */
    private String CREATED_BY ;
    /** 创建时间 */
    private Date CREATED_TIME ;
    /** 更新人 */
    private String UPDATED_BY ;
    /** 更新时间 */
    private Date UPDATED_TIME;
    /** 主键 */
    private Integer id ;
    /** 课程名称 */
    private String COURSE_NAME ;
    /** 课程简介 */
    private String COURSE_INTRODUCE ;
    /** 上课时间;设置起始周于结束周，使用"-"进行连接，具体时间信息使用"|" 衔接，多个时间段使用 ","进行分割
     例如：
     1-7|2|1-2,9-12|3|3-4
     表示该课程的上课时间为1到7周星期二的1到2节，和9到12周星期三的3到4节 */
    private String COURSE_TIME ;
    /** 课程是否为线上课程 */
    private String COURSE_ONLINE ;
    /** 上课地址 */
    private String COURSE_ADDRESS ;
    /** 主讲老师id;外键，连接user表id */
    private String TEACHER_MAIN_ID ;
    /** 助教老师id;使用","分割 */
    private String TEACHER_ASSIST_ID ;

    /** 创建人 */
    public String getCREATED_BY(){
        return this.CREATED_BY;
    }
    /** 创建人 */
    public void setCREATED_BY(String CREATED_BY){
        this.CREATED_BY = CREATED_BY;
    }
    /** 创建时间 */
    public Date getCREATED_TIME(){
        return this.CREATED_TIME;
    }
    /** 创建时间 */
    public void setCREATED_TIME(Date CREATED_TIME){
        this.CREATED_TIME = CREATED_TIME;
    }
    /** 更新人 */
    public String getUPDATED_BY(){
        return this.UPDATED_BY;
    }
    /** 更新人 */
    public void setUPDATED_BY(String UPDATED_BY){
        this.UPDATED_BY = UPDATED_BY;
    }
    /** 更新时间 */
    public Date getUPDATED_TIME(){
        return this.UPDATED_TIME;
    }
    /** 更新时间 */
    public void setUPDATED_TIME(Date UPDATED_TIME){
        this.UPDATED_TIME= UPDATED_TIME;
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
    public String getCOURSE_NAME(){
        return this.COURSE_NAME;
    }
    /** 课程名称 */
    public void setCOURSE_NAME(String COURSE_NAME){
        this.COURSE_NAME = COURSE_NAME;
    }
    /** 课程简介 */
    public String getCOURSE_INTRODUCE(){
        return this.COURSE_INTRODUCE;
    }
    /** 课程简介 */
    public void setCOURSE_INTRODUCE(String COURSE_INTRODUCE){
        this.COURSE_INTRODUCE = COURSE_INTRODUCE;
    }
    /** 上课时间;设置起始周于结束周，使用"-"进行连接，具体时间信息使用"|" 衔接，多个时间段使用 ","进行分割
     例如：
     1-7|2|1-2,9-12|3|3-4
     表示该课程的上课时间为1到7周星期二的1到2节，和9到12周星期三的3到4节 */
    public String getCOURSE_TIME(){
        return this.COURSE_TIME;
    }
    /** 上课时间;设置起始周于结束周，使用"-"进行连接，具体时间信息使用"|" 衔接，多个时间段使用 ","进行分割
     例如：
     1-7|2|1-2,9-12|3|3-4
     表示该课程的上课时间为1到7周星期二的1到2节，和9到12周星期三的3到4节 */
    public void setCOURSE_TIME(String COURSE_TIME){
        this.COURSE_TIME = COURSE_TIME;
    }
    /** 上课地址 */
    public String getCOURSE_ADDRESS(){
        return this.COURSE_ADDRESS;
    }
    /** 上课地址 */
    public void setCOURSE_ADDRESS(String COURSE_ADDRESS){
        this.COURSE_ADDRESS = COURSE_ADDRESS;
    }
    /** 主讲老师id;外键，连接user表id */
    public String getTEACHER_MAIN_ID(){
        return this.TEACHER_MAIN_ID;
    }
    /** 主讲老师id;外键，连接user表id */
    public void setTEACHER_MAIN_ID(String TEACHER_MAIN_ID){
        this.TEACHER_MAIN_ID = TEACHER_MAIN_ID;
    }
    /** 助教老师id;使用","分割 */
    public String getTEACHER_ASSIST_ID(){
        return this.TEACHER_ASSIST_ID;
    }
    /** 助教老师id;使用","分割 */
    public void setTEACHER_ASSIST_ID(String TEACHER_ASSIST_ID){
        this.TEACHER_ASSIST_ID = TEACHER_ASSIST_ID;
    }

    public String getCOURSE_ONLINE() {
        return COURSE_ONLINE;
    }

    public void setCOURSE_ONLINE(String COURSE_ONLINE) {
        this.COURSE_ONLINE = COURSE_ONLINE;
    }
}