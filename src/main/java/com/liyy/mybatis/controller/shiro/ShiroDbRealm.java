package com.liyy.mybatis.controller.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liyy.mybatis.model.UserInfo;
import com.liyy.mybatis.service.UserInfoService;

/**
 * 
 * @ClassName: ShiroDbRealm 
 * @Description: 
 * @author: liyanyong
 * @date: 2017年10月30日 下午3:30:32
 */
@Component
public class ShiroDbRealm extends AuthorizingRealm {
	
	@Autowired
	private UserInfoService userInfoService;
	
	public static final String SESSION_USER_KEY = "gray";

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		UserInfo user = (UserInfo) SecurityUtils.getSubject().getSession().getAttribute(ShiroDbRealm.SESSION_USER_KEY);
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.addRole(user.getUserName().trim());
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
			throws AuthenticationException {
		// 把token转换成User对象
		UserInfo userLogin = tokenToUser((UsernamePasswordToken) authcToken);
		// 验证用户是否可以登录
		UserInfo ui = userInfoService.doUserLogin(userLogin);
		if (ui == null) {
			throw new UnknownAccountException("账号不存在！！！");
		}
		// 设置session
		Session session = SecurityUtils.getSubject().getSession();
		session.setAttribute(ShiroDbRealm.SESSION_USER_KEY, ui);
		// 当前 Realm 的 name
		String realmName = this.getName();
		// 登陆的主要信息: 可以是一个实体类的对象, 但该实体类的对象一定是根据 token 的 username 查询得到的.
		// Object principal = ui.getUsername();
		Object principal = authcToken.getPrincipal();
		return new SimpleAuthenticationInfo(principal, userLogin.getPassWord(), realmName);
	}

	private UserInfo tokenToUser(UsernamePasswordToken authcToken) {
		UserInfo user = new UserInfo();
		user.setUserName(authcToken.getUsername());
		user.setPassWord(String.valueOf(authcToken.getPassword()));
		return user;
	}

	public UserInfoService getUserInfoService() {
		return userInfoService;
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
}
