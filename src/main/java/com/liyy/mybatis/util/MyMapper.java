package com.liyy.mybatis.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ClassName: MyMapper 
 * @Description: 继承自己的MyMapper
 * @author: liyanyong
 * @date: 2017年10月30日 下午4:36:20 
 * @param <T>
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
