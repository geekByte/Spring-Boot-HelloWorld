package com.geekbyte.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//本身就是Spring的一个组件

//程序的入口

@SpringBootApplication  //标注这个类是一个Spring Boot应用
public class HelloworldApplication {

	public static void main(String[] args) {

		//将Spring Boot应用启动
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
