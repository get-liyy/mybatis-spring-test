package com.liyy.mybatis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "_user_login_info")
public class UserLoginInfo {
    @Id
    @Column(name = "_id")
    private Integer id;

    /**
     * 登录名
     */
    @Id
    @Column(name = "_user_name")
    private String userName;

    /**
     * 登录时间
     */
    @Column(name = "_login_date")
    private Date loginDate;

    /**
     * 登录IP
     */
    @Column(name = "_log_in_ip")
    private String logInIp;

    /**
     * @return _id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取登录名
     *
     * @return _user_name - 登录名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置登录名
     *
     * @param userName 登录名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取登录时间
     *
     * @return _login_date - 登录时间
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * 设置登录时间
     *
     * @param loginDate 登录时间
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * 获取登录IP
     *
     * @return _log_in_ip - 登录IP
     */
    public String getLogInIp() {
        return logInIp;
    }

    /**
     * 设置登录IP
     *
     * @param logInIp 登录IP
     */
    public void setLogInIp(String logInIp) {
        this.logInIp = logInIp;
    }
}