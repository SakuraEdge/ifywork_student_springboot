package com.ifywork.student_springboot.bean;

import java.io.Serializable;
import java.util.Date;


public class ClassStudent implements Serializable{
    /** 创建人 */
    private String CREATED_BY ;
    /** 创建时间 */
    private Date CREATED_TIME ;
    /** 更新人 */
    private String UPDATED_BY ;
    /** 更新时间 */
    private Date UPDATED_TIME ;
    /** 主键 */
    private Integer id ;
    /** 班级id;外键，连接class表id */
    private Integer CLASS_ID ;
    /** 学生id;外键，连接user表id */
    private Integer STUDENT_ID ;

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
        this.UPDATED_TIME = UPDATED_TIME;
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
    public Integer getCLASS_ID(){
        return this.CLASS_ID;
    }
    /** 班级id;外键，连接class表id */
    public void setCLASS_ID(Integer CLASS_ID){
        this.CLASS_ID = CLASS_ID;
    }
    /** 学生id;外键，连接user表id */
    public Integer getSTUDENT_ID(){
        return this.STUDENT_ID;
    }
    /** 学生id;外键，连接user表id */
    public void setSTUDENT_ID(Integer STUDENT_ID){
        this.STUDENT_ID = STUDENT_ID;
    }
}