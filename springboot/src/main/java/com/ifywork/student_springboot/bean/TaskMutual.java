package com.ifywork.student_springboot.bean;

import java.io.Serializable;
import java.util.Date;

public class TaskMutual implements Serializable{
    /** 创建人 */
    private String CREATED_BY ;
    /** 创建时间 */
    private Date CREATED_TIME ;
    /** 更新人 */
    private String UPDATED_BY ;
    /** 更新时间 */
    private Date UPDATED_TIME ;
    /** 主键 */

    private String COMMENT;
    private Integer id ;
    /** 任务id;外键，连接task表id */
    private Integer T_ID ;
    /** 互评人id一;外键，连接user表id */
    private Integer STUDENT_ID1 ;


    /** 互评成绩一 */
    private Integer MUTUAL_SCORE1 ;

    private String DELETED;

    public String getDELETED() {
        return DELETED;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDELETED(String DELETED) {
        this.DELETED = DELETED;
    }

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
    public Integer geT_ID(){
        return this.id;
    }
    /** 主键 */
    public void seT_ID(Integer id){
        this.id = id;
    }
    /** 任务id;外键，连接task表id */
    public Integer getT_ID(){
        return this.T_ID;
    }
    /** 任务id;外键，连接task表id */
    public void setT_ID(Integer T_ID){
        this.T_ID = T_ID;
    }
    /** 互评人id一;外键，连接user表id */
    public Integer getSTUDENT_ID(){
        return this.STUDENT_ID1;
    }
    /** 互评人id一;外键，连接user表id */
    public void setSTUDENT_ID1(Integer STUDENT_ID1){
        this.STUDENT_ID1 = STUDENT_ID1;
    }
    /** 互评成绩 */
    public Integer getMUTUAL_SCORE(){
        return this.MUTUAL_SCORE1;
    }
    /** 互评成绩 */
    public void setMUTUAL_SCORE(Integer MUTUAL_SCORE1){
        this.MUTUAL_SCORE1 = MUTUAL_SCORE1;
    }

    public String getCOMMENT() { return this.COMMENT; }
    public void setCOMMENT(String COMMENT) { this.COMMENT = COMMENT; }
}