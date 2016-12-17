package com.qiu.demo;
/**
 * 1)写给学生类
 * 2)属性(name(名字),age(年龄),height(身高),gender(性别))
 * 3)方法(eat(吃),sleep(睡),paly(玩),study(学习))
 * 4)构造方法 (构造几个)
 * 5)Getter(获取) Setter(设置，输入)
 * 6) new 创建对象  
 */
public class Student {
	/**
	 * 定义属性
	 */
	private String name = "";
	private int age = 0;
	private int height = 0;
	private String gender = "";
	
	/**
	 * 创建一个无参的构造方法
	 */
	public Student(){
		
	}
	/**
	 * 创建一个有4个参数的方法
	 */
	public Student(String name,String gender,int age,int height){
		this.name = name;
		this.gender = gender;
	    this.age = age;
	    this.height = height;
	}
	/**
	 * 写了一个吃的方法
	 */
	public void eat(){
		System.out.println(name+"，一天吃四顿饭");
		
	}
	/**
	 * 写了一个睡觉的方法
	 */
	public void sleep(){
		System.out.println(name+"，每天晚上10点半睡觉");
	}
	/**
	 * 写了一个玩的方法
	 */
	public void play(){
		System.out.println(name+"，喜欢玩LOL");
	}
	/**
	 * 写了一个学习的方法
	 */
	public void study(){
		System.out.println(name+"，每个周末都要去市图书馆看半天书");
		
	}
	
	/**
	 * 写一个自我介绍
	 */
	
	public void info(){
		System.out.println("name:"+name);
		System.out.println("gender:"+gender);
		System.out.println("age:"+age);
		System.out.println("height:"+height);
	}

	
	public String getterName() {

		return name;

	}
	
	public void setterName(String name) {
		
		 this.name = name;
	}
	public String getterGender() {
		
		return gender;

	}
	
	public void setGender(String gender) {
		
		this.gender = gender;
	}
	public int getterAge() {
		
		return age;
	}
	
	public void setterAge(int age) {
		
		this.age = age;

	}
	public int getterHeight() {
		
		return height;

	}
	
	public void setterHeight(int height) {
		
		this.height = height;

	}
	
}
