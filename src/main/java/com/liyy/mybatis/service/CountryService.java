package com.liyy.mybatis.service;

import java.util.List;

import com.liyy.mybatis.model.Country;

/**
 * 
 * @author liyanyong
 */
public interface CountryService extends IService<Country> {

    /**
     * 根据条件分页查询
     *
     * @param country
     * @param page
     * @param rows
     * @return
     */
    List<Country> selectByCountry(Country country, int page, int rows);

}
