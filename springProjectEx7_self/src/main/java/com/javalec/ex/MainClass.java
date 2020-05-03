package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); // 1. 컨테이너 생성

		ctx.load("classpath:applicationContext.xml"); // 2. 컨테이너 설정.

		ctx.refresh(); // 위처럼 ctx.load로 설정을 따로 해주었다면 refresh를 해주어야한다.

		Student student = ctx.getBean("student", Student.class); // 3. 컨테이너 사용

		System.out.println("이름 : " + student.getName());
		System.out.println("나이 : " + student.getAge());

		ctx.close(); // 4. 컨테이너 종료

	}
}
