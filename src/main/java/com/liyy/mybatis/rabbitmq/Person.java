package com.liyy.mybatis.rabbitmq;

/**
 * @ClassName: Person 
 * @Description: 创建实体类
 * @author: liyanyong
 * @date: 2018年3月30日 下午1:22:04
 */
public class Person {
	private String name;
    private int age;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		super();
	}
}
