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
    private Integer id ;
    /** 任务id;外键，连接task表id */
    private Integer T_ID ;
    /** 互评人id一;外键，连接user表id */
    private Integer STUDENT_ID1 ;
    /** 互评人id二;外键，连接user表id */
    private Integer STUDENT_ID2 ;
    /** 互评人id三;外键，连接user表id */
    private Integer STUDENT_ID3 ;
    /** 互评人id四;外键，连接user表id */
    private Integer STUDENT_ID4 ;
    /** 互评人id五;外键，连接user表id */
    private Integer STUDENT_ID5 ;
    /** 互评成绩一 */
    private Integer MUTUAL_SCORE1 ;
    /** 互评成绩二 */
    private Integer MUTUAL_SCORE2 ;
    /** 互评成绩三 */
    private Integer MUTUAL_SCORE3 ;
    /** 互评成绩四 */
    private Integer MUTUAL_SCORE4 ;
    /** 互评成绩五 */
    private Integer MUTUAL_SCORE5 ;

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
    public Integer getSTUDENT_ID1(){
        return this.STUDENT_ID1;
    }
    /** 互评人id一;外键，连接user表id */
    public void setSTUDENT_ID1(Integer STUDENT_ID1){
        this.STUDENT_ID1 = STUDENT_ID1;
    }
    /** 互评人id二;外键，连接user表id */
    public Integer getSTUDENT_ID2(){
        return this.STUDENT_ID2;
    }
    /** 互评人id二;外键，连接user表id */
    public void setSTUDENT_ID2(Integer STUDENT_ID2){
        this.STUDENT_ID2 = STUDENT_ID2;
    }
    /** 互评人id三;外键，连接user表id */
    public Integer getSTUDENT_ID3(){
        return this.STUDENT_ID3;
    }
    /** 互评人id三;外键，连接user表id */
    public void setSTUDENT_ID3(Integer STUDENT_ID3){
        this.STUDENT_ID3 = STUDENT_ID3;
    }
    /** 互评人id四;外键，连接user表id */
    public Integer getSTUDENT_ID4(){
        return this.STUDENT_ID4;
    }
    /** 互评人id四;外键，连接user表id */
    public void setSTUDENT_ID4(Integer STUDENT_ID4){
        this.STUDENT_ID4 = STUDENT_ID4;
    }
    /** 互评人id五;外键，连接user表id */
    public Integer getSTUDENT_ID5(){
        return this.STUDENT_ID5;
    }
    /** 互评人id五;外键，连接user表id */
    public void setSTUDENT_ID5(Integer STUDENT_ID5){
        this.STUDENT_ID5 = STUDENT_ID5;
    }
    /** 互评成绩一 */
    public Integer getMUTUAL_SCORE1(){
        return this.MUTUAL_SCORE1;
    }
    /** 互评成绩一 */
    public void setMUTUAL_SCORE1(Integer MUTUAL_SCORE1){
        this.MUTUAL_SCORE1 = MUTUAL_SCORE1;
    }
    /** 互评成绩二 */
    public Integer getMUTUAL_SCORE2(){
        return this.MUTUAL_SCORE2;
    }
    /** 互评成绩二 */
    public void setMUTUAL_SCORE2(Integer MUTUAL_SCORE2){
        this.MUTUAL_SCORE2 = MUTUAL_SCORE2;
    }
    /** 互评成绩三 */
    public Integer getMUTUAL_SCORE3(){
        return this.MUTUAL_SCORE3;
    }
    /** 互评成绩三 */
    public void setMUTUAL_SCORE3(Integer MUTUAL_SCORE3){
        this.MUTUAL_SCORE3 = MUTUAL_SCORE3;
    }
    /** 互评成绩四 */
    public Integer getMUTUAL_SCORE4(){
        return this.MUTUAL_SCORE4;
    }
    /** 互评成绩四 */
    public void setMUTUAL_SCORE4(Integer MUTUAL_SCORE4){
        this.MUTUAL_SCORE4 = MUTUAL_SCORE4;
    }
    /** 互评成绩五 */
    public Integer getMUTUAL_SCORE5(){
        return this.MUTUAL_SCORE5;
    }
    /** 互评成绩五 */
    public void setMUTUAL_SCORE5(Integer MUTUAL_SCORE5){
        this.MUTUAL_SCORE5 = MUTUAL_SCORE5;
    }
}