package com.ifywork.student_springboot.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
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
    /** 学工号 */
    private String U_ID ;
    /** 用户姓名 */
    private String U_NAME ;
    /** 用户密码 */
    private String U_PASSWORD ;
    /** 用户职位;0管理员，1老师，2学生 */
    private Integer U_POST ;
    /** 用户性别 */
    private String U_SEX ;
    /** 用户民族 */
    private String U_NATION ;
    /** 用户身份证号;默认隐藏 */
    private String U_NID ;
    /** 用户电话 */
    private String U_PHONE ;
    /** 用户安全问题一 */
    private String U_QUESTION1 ;
    /** 用户安全问题二 */
    private String U_QUESTION2 ;
    /** 用户安全问题三 */
    private String U_QUESTION3 ;
    /** 用户安全问题答案一 */
    private String U_ANSWER1 ;
    /** 用户安全问题答案二 */
    private String U_ANSWER2 ;
    /** 用户安全问题答案三 */
    private String U_ANSWER3 ;
    /** 用户所在班级;使用字符串记录用户所在的所有班级，使用 , 进行分割，例如：
     1,3,7
     表示该用于处于ID分别为1，3，7的班级中 */
    private String U_CLASS ;

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
    /** 学工号 */
    public String getU_ID(){
        return this.U_ID;
    }
    /** 学工号 */
    public void setU_ID(String U_ID){
        this.U_ID = U_ID;
    }
    /** 用户姓名 */
    public String getU_NAME(){
        return this.U_NAME;
    }
    /** 用户姓名 */
    public void setU_NAME(String U_NAME){
        this.U_NAME = U_NAME;
    }
    /** 用户密码 */
    public String getU_PASSWORD(){
        return this.U_PASSWORD;
    }
    /** 用户密码 */
    public void setU_PASSWORD(String U_PASSWORD){
        this.U_PASSWORD = U_PASSWORD;
    }
    /** 用户职位;0管理员，1老师，2学生 */
    public Integer getU_POST(){
        return this.U_POST;
    }
    /** 用户职位;0管理员，1老师，2学生 */
    public void setU_POST(Integer U_POST){
        this.U_POST = U_POST;
    }
    /** 用户性别 */
    public String getU_SEX(){
        return this.U_SEX;
    }
    /** 用户性别 */
    public void setU_SEX(String U_SEX){
        this.U_SEX = U_SEX;
    }
    /** 用户民族 */
    public String getU_NATION(){
        return this.U_NATION;
    }
    /** 用户民族 */
    public void setU_NATION(String U_NATION){
        this.U_NATION = U_NATION;
    }
    /** 用户身份证号;默认隐藏 */
    public String getU_NID(){
        return this.U_NID;
    }
    /** 用户身份证号;默认隐藏 */
    public void setU_NID(String U_NID){
        this.U_NID = U_NID;
    }
    /** 用户电话 */
    public String getU_PHONE(){
        return this.U_PHONE;
    }
    /** 用户电话 */
    public void setU_PHONE(String U_PHONE){
        this.U_PHONE = U_PHONE;
    }
    /** 用户安全问题一 */
    public String getU_QUESTION1(){
        return this.U_QUESTION1;
    }
    /** 用户安全问题一 */
    public void setU_QUESTION1(String U_QUESTION1){
        this.U_QUESTION1 = U_QUESTION1;
    }
    /** 用户安全问题二 */
    public String getU_QUESTION2(){
        return this.U_QUESTION2;
    }
    /** 用户安全问题二 */
    public void setU_QUESTION2(String U_QUESTION2){
        this.U_QUESTION2 = U_QUESTION2;
    }
    /** 用户安全问题三 */
    public String getU_QUESTION3(){
        return this.U_QUESTION3;
    }
    /** 用户安全问题三 */
    public void setU_QUESTION3(String U_QUESTION3){
        this.U_QUESTION3 = U_QUESTION3;
    }
    /** 用户安全问题答案一 */
    public String getU_ANSWER1(){
        return this.U_ANSWER1;
    }
    /** 用户安全问题答案一 */
    public void setU_ANSWER1(String U_ANSWER1){
        this.U_ANSWER1 = U_ANSWER1;
    }
    /** 用户安全问题答案二 */
    public String getU_ANSWER2(){
        return this.U_ANSWER2;
    }
    /** 用户安全问题答案二 */
    public void setU_ANSWER2(String U_ANSWER2){
        this.U_ANSWER2 = U_ANSWER2;
    }
    /** 用户安全问题答案三 */
    public String getU_ANSWER3(){
        return this.U_ANSWER3;
    }
    /** 用户安全问题答案三 */
    public void setU_ANSWER3(String U_ANSWER3){
        this.U_ANSWER3 = U_ANSWER3;
    }
    /** 用户所在班级;使用字符串记录用户所在的所有班级，使用 , 进行分割，例如：
     1,3,7
     表示该用于处于ID分别为1，3，7的班级中 */
    public String getU_CLASS(){
        return this.U_CLASS;
    }
    /** 用户所在班级;使用字符串记录用户所在的所有班级，使用 , 进行分割，例如：
     1,3,7
     表示该用于处于ID分别为1，3，7的班级中 */
    public void setU_CLASS(String U_CLASS){
        this.U_CLASS = U_CLASS;
    }
}
