package com.liyy.mybatis.model;

import javax.persistence.*;

@Table(name = "_user_info")
public class UserInfo {
    @Id
    @Column(name = "_id")
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "_user_name")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "_pass_word")
    private String passWord;

    /**
     * 用户类型
     */
    @Column(name = "_user_type")
    private String userType;

    /**
     * 是否可用
     */
    @Column(name = "_enabled")
    private Integer enabled;

    /**
     * 真实姓名
     */
    @Column(name = "_real_name")
    private String realName;

    /**
     * QQ
     */
    @Column(name = "_qq")
    private String qq;

    @Column(name = "_email")
    private String email;

    /**
     * 联系电话
     */
    @Column(name = "_tel")
    private String tel;

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
     * 获取用户名
     *
     * @return _user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return _pass_word - 密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置密码
     *
     * @param passWord 密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取用户类型
     *
     * @return _user_type - 用户类型
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置用户类型
     *
     * @param userType 用户类型
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * 获取是否可用
     *
     * @return _enabled - 是否可用
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * 设置是否可用
     *
     * @param enabled 是否可用
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取真实姓名
     *
     * @return _real_name - 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名
     *
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取QQ
     *
     * @return _qq - QQ
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置QQ
     *
     * @param qq QQ
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * @return _email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取联系电话
     *
     * @return _tel - 联系电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置联系电话
     *
     * @param tel 联系电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }
}