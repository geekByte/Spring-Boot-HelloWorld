package com.geekbyte.helloworld;


import com.geekbyte.helloworld.Entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloworldApplicationTests {

	@Autowired
//	@Qualifier  //如果有很多组件，指定具体的组件
	private Person person;

	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
