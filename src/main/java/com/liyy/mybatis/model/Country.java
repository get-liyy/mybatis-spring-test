package com.liyy.mybatis.model;

import javax.persistence.*;

@Table(name = "_country")
public class Country {
    /**
     * 主键
     */
    @Id
    @Column(name = "_id")
    private Integer id;

    /**
     * 名称
     */
    @Column(name = "_country_name")
    private String countryName;

    /**
     * 代码
     */
    @Column(name = "_country_code")
    private String countryCode;

    /**
     * 获取主键
     *
     * @return _id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return _country_name - 名称
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 设置名称
     *
     * @param countryName 名称
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 获取代码
     *
     * @return _country_code - 代码
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置代码
     *
     * @param countryCode 代码
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}