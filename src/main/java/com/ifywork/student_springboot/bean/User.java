package com.ifywork.student_springboot.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
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
    /** 学工号 */
    private String uId ;
    /** 用户姓名 */
    private String uName ;
    /** 用户密码 */
    private String uPassword ;
    /** 用户职位;0管理员，1老师，2学生 */
    private Integer uPost ;
    /** 用户性别 */
    private String uSex ;
    /** 用户民族 */
    private String uNation ;
    /** 用户身份证号;默认隐藏 */
    private String uNid ;
    /** 用户电话 */
    private String uPhone ;
    /** 用户安全问题一 */
    private String uQuestion1 ;
    /** 用户安全问题二 */
    private String uQuestion2 ;
    /** 用户安全问题三 */
    private String uQuestion3 ;
    /** 用户安全问题答案一 */
    private String uAnswer1 ;
    /** 用户安全问题答案二 */
    private String uAnswer2 ;
    /** 用户安全问题答案三 */
    private String uAnswer3 ;
    /** 用户所在班级;使用字符串记录用户所在的所有班级，使用 , 进行分割，例如：
     1,3,7
     表示该用于处于ID分别为1，3，7的班级中 */
    private String uClass ;

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
    /** 学工号 */
    public String getUId(){
        return this.uId;
    }
    /** 学工号 */
    public void setUId(String uId){
        this.uId = uId;
    }
    /** 用户姓名 */
    public String getUName(){
        return this.uName;
    }
    /** 用户姓名 */
    public void setUName(String uName){
        this.uName = uName;
    }
    /** 用户密码 */
    public String getUPassword(){
        return this.uPassword;
    }
    /** 用户密码 */
    public void setUPassword(String uPassword){
        this.uPassword = uPassword;
    }
    /** 用户职位;0管理员，1老师，2学生 */
    public Integer getUPost(){
        return this.uPost;
    }
    /** 用户职位;0管理员，1老师，2学生 */
    public void setUPost(Integer uPost){
        this.uPost = uPost;
    }
    /** 用户性别 */
    public String getUSex(){
        return this.uSex;
    }
    /** 用户性别 */
    public void setUSex(String uSex){
        this.uSex = uSex;
    }
    /** 用户民族 */
    public String getUNation(){
        return this.uNation;
    }
    /** 用户民族 */
    public void setUNation(String uNation){
        this.uNation = uNation;
    }
    /** 用户身份证号;默认隐藏 */
    public String getUNid(){
        return this.uNid;
    }
    /** 用户身份证号;默认隐藏 */
    public void setUNid(String uNid){
        this.uNid = uNid;
    }
    /** 用户电话 */
    public String getUPhone(){
        return this.uPhone;
    }
    /** 用户电话 */
    public void setUPhone(String uPhone){
        this.uPhone = uPhone;
    }
    /** 用户安全问题一 */
    public String getUQuestion1(){
        return this.uQuestion1;
    }
    /** 用户安全问题一 */
    public void setUQuestion1(String uQuestion1){
        this.uQuestion1 = uQuestion1;
    }
    /** 用户安全问题二 */
    public String getUQuestion2(){
        return this.uQuestion2;
    }
    /** 用户安全问题二 */
    public void setUQuestion2(String uQuestion2){
        this.uQuestion2 = uQuestion2;
    }
    /** 用户安全问题三 */
    public String getUQuestion3(){
        return this.uQuestion3;
    }
    /** 用户安全问题三 */
    public void setUQuestion3(String uQuestion3){
        this.uQuestion3 = uQuestion3;
    }
    /** 用户安全问题答案一 */
    public String getUAnswer1(){
        return this.uAnswer1;
    }
    /** 用户安全问题答案一 */
    public void setUAnswer1(String uAnswer1){
        this.uAnswer1 = uAnswer1;
    }
    /** 用户安全问题答案二 */
    public String getUAnswer2(){
        return this.uAnswer2;
    }
    /** 用户安全问题答案二 */
    public void setUAnswer2(String uAnswer2){
        this.uAnswer2 = uAnswer2;
    }
    /** 用户安全问题答案三 */
    public String getUAnswer3(){
        return this.uAnswer3;
    }
    /** 用户安全问题答案三 */
    public void setUAnswer3(String uAnswer3){
        this.uAnswer3 = uAnswer3;
    }
    /** 用户所在班级;使用字符串记录用户所在的所有班级，使用 , 进行分割，例如：
     1,3,7
     表示该用于处于ID分别为1，3，7的班级中 */
    public String getUClass(){
        return this.uClass;
    }
    /** 用户所在班级;使用字符串记录用户所在的所有班级，使用 , 进行分割，例如：
     1,3,7
     表示该用于处于ID分别为1，3，7的班级中 */
    public void setUClass(String uClass){
        this.uClass = uClass;
    }
}
