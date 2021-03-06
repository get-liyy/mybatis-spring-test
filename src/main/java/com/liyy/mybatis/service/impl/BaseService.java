package com.liyy.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.liyy.mybatis.service.IService;

import tk.mybatis.mapper.common.Mapper;

/**
 * @ClassName: BaseService 
 * @Description: 通用service
 * @author: liyanyong
 * @date: 2017年10月30日 上午11:18:32 
 * @param <T>
 */
public abstract class BaseService<T> implements IService<T> {

    @Autowired
    protected Mapper<T> mapper;

    public Mapper<T> getMapper() {
        return mapper;
    }

    @Override
    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    public int save(T entity) {
        return mapper.insert(entity);
    }

    public int delete(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    public int updateAll(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    public int updateNotNull(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

    //TODO 其他...
}
