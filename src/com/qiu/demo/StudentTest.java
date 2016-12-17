package com.qiu.demo;

public class StudentTest {
	public static void main(String[] args) {
		Student stu = new Student();
		Student stu1 = new Student();
	//	stu.setterAge(20);
	//	System.out.println(stu.getterAge());
		stu.setterName("小刚");
		stu.setterAge(20);
		stu.setterHeight(180);
		stu.setGender("男");
		
		stu.eat();
		stu.sleep();
		stu.play();
		stu.study();
		stu.info();
		
		stu1.setterName("小明");
		stu1.setterAge(22);
		stu1.setterHeight(175);
		stu1.setGender("男");
		
		stu1.eat();
		stu1.sleep();
		stu1.play();
		stu1.study();
		stu1.info();
		
		Student stu2 = new Student("如花", "女", 18, 155);
		Student stu3 = new Student("张飞", "男", 20, 165);
			
		stu2.eat();
		stu2.sleep();
		stu2.play();
		stu2.study();
		stu2.info();
		
		stu3.eat();
		stu3.sleep();
		stu3.play();
		stu3.study();
		stu3.info();
		
		
		
	}

}
