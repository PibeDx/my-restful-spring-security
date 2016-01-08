package com.jcuentas.app;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;



@SpringBootApplication
@ImportResource("classpath:spring-security.xml")
public class Main {

	public static void main(String[] args) {
//		SpringApplication.run(Main.class, args);
		ApplicationContext ctx = SpringApplication.run(Main.class, args);
		System.out.println("Let's inspect the beans provided by Spring Boot:");
		// TODO Auto-generated method stub
		System.out.println("hola");
//		String[] beanNames = ctx.getBeanDefinitionNames();
//		Arrays.sort(beanNames);
//		for (String beanName : beanNames) {
//			System.out.println(beanName);
//		}
		
		
		
	}

}
