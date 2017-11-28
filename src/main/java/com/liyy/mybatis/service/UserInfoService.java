package com.liyy.mybatis.service;

import com.liyy.mybatis.model.UserInfo;

/**
 * @ClassName: UserInfoService 
 * @Description: 
 * @author: liyanyong
 * @date: 2017年10月30日 上午11:11:43
 */
public interface UserInfoService extends IService<UserInfo> {
	
	/**
	 * @Title: doUserLogin 
	 * @Description: 验证登录
	 * @author: liyanyong 
	 * @param: @param userInfo
	 * @param: @return
	 * @return: UserInfo 
	 * @throws
	 */
	UserInfo doUserLogin(UserInfo userInfo);
}
