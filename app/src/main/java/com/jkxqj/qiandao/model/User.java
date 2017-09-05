package com.jkxqj.qiandao.model;

import cn.bmob.v3.BmobObject;

/**
 * Created by JKXQJ on 2015/8/1.
 */
public class User extends BmobObject {
    private String account;
    private String password;
    private String realName;
    private String studentID;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}