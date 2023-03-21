package com.ifywork.student_springboot.bean;

import java.io.Serializable;
import java.util.Date;

public class MyClass implements Serializable{
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
    /** 班级名称 */
    private String className ;
    /** 班级教师id;外键，连接user表的id */
    private Integer classTeacherId ;
    /** 班级信息 */
    private String classIntroduce ;

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
    /** 班级名称 */
    public String getClassName(){
        return this.className;
    }
    /** 班级名称 */
    public void setClassName(String className){
        this.className = className;
    }
    /** 班级教师id;外键，连接user表的id */
    public Integer getClassTeacherId(){
        return this.classTeacherId;
    }
    /** 班级教师id;外键，连接user表的id */
    public void setClassTeacherId(Integer classTeacherId){
        this.classTeacherId = classTeacherId;
    }
    /** 班级信息 */
    public String getClassIntroduce(){
        return this.classIntroduce;
    }
    /** 班级信息 */
    public void setClassIntroduce(String classIntroduce){
        this.classIntroduce = classIntroduce;
    }
}