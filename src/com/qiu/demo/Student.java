package com.qiu.demo;
/**
 * 1)д��ѧ����
 * 2)����(name(����),age(����),height(���),gender(�Ա�))
 * 3)����(eat(��),sleep(˯),paly(��),study(ѧϰ))
 * 4)���췽�� (���켸��)
 * 5)Getter(��ȡ) Setter(���ã�����)
 * 6) new ��������  
 */
public class Student {
	/**
	 * ��������
	 */
	private String name = "";
	private int age = 0;
	private int height = 0;
	private String gender = "";
	
	/**
	 * ����һ���޲εĹ��췽��
	 */
	public Student(){
		
	}
	/**
	 * ����һ����4�������ķ���
	 */
	public Student(String name,String gender,int age,int height){
		this.name = name;
		this.gender = gender;
	    this.age = age;
	    this.height = height;
	}
	/**
	 * д��һ���Եķ���
	 */
	public void eat(){
		System.out.println(name+"��һ����Ķٷ�");
		
	}
	/**
	 * д��һ��˯���ķ���
	 */
	public void sleep(){
		System.out.println(name+"��ÿ������10���˯��");
	}
	/**
	 * д��һ����ķ���
	 */
	public void play(){
		System.out.println(name+"��ϲ����LOL");
	}
	/**
	 * д��һ��ѧϰ�ķ���
	 */
	public void study(){
		System.out.println(name+"��ÿ����ĩ��Ҫȥ��ͼ��ݿ�������");
		
	}
	
	/**
	 * дһ�����ҽ���
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
