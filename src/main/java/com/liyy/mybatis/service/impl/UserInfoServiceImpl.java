package com.liyy.mybatis.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.liyy.mybatis.model.UserInfo;
import com.liyy.mybatis.service.UserInfoService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

/**
 * 
 * @ClassName: UserInfoServiceImpl 
 * @Description: 用户信息
 * @author: liyanyong
 * @date: 2017年10月30日 上午11:18:14
 */
@Service
public class UserInfoServiceImpl extends BaseService<UserInfo> implements UserInfoService {
	
	/**
	 * <p>Title: doUserLogin</p>
	 * <p>Description: </p>
	 * @param userInfo
	 * @return
	 * @see com.liyy.mybatis.service.UserInfoService#doUserLogin(com.liyy.mybatis.model.UserInfo)
	 */
	@Override
	public UserInfo doUserLogin(UserInfo userInfo) {
		Example example = new Example(UserInfo.class);
		Example.Criteria criteria = example.createCriteria();
		if (StringUtil.isNotEmpty(userInfo.getUserName())) {
			criteria.andLike("userName", userInfo.getUserName());
		}
		if (StringUtil.isNotEmpty(userInfo.getPassWord())) {
			criteria.andLike("passWord", userInfo.getPassWord());
		}
		List<UserInfo> userInfoList = selectByExample(example);
		if(userInfoList.size() > 0) {
			return userInfoList.get(0);
		}
		return null;
	}

}
