package com.liyy.mybatis.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.liyy.mybatis.model.Country;
import com.liyy.mybatis.service.CountryService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

/**
 * 
 * @ClassName: CountryServiceImpl 
 * @Description: 城市
 * @author: liyanyong
 * @date: 2017年10月30日 上午11:19:08
 */
@Service
public class CountryServiceImpl extends BaseService<Country> implements CountryService {

	@Override
	public List<Country> selectByCountry(Country country, int page, int rows) {
		Example example = new Example(Country.class);
		Example.Criteria criteria = example.createCriteria();
		if (StringUtil.isNotEmpty(country.getCountryName())) {
			criteria.andLike("countryName", "%" + country.getCountryName() + "%");
		}
		if (StringUtil.isNotEmpty(country.getCountryCode())) {
			criteria.andLike("countryCode", "%" + country.getCountryCode() + "%");
		}
		if (country.getId() != null) {
			criteria.andEqualTo("id", country.getId());
		}
		// 分页查询
		PageHelper.startPage(page, rows);
		return selectByExample(example);
	}

}
