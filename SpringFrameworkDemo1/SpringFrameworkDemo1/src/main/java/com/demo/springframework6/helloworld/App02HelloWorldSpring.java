package com.demo.springframework6.helloworld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring
{
	public static void main(String[] args) {
		try (//1 launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			//3 Retrieving beans managed by Spring
			Object name = context.getBean("name");
			Object age = context.getBean("age");
			Object person = context.getBean("person");
			Object address = context.getBean("addr");
			Object person2 = context.getBean("person2MethodCall");
			System.out.println(name);
			System.out.println(age);
			System.out.println(person);
			System.out.println(address);
			System.out.println("Another adddress : "+context.getBean(Address.class));
			System.out.println("Another adddress : "+context.getBean(Person.class));
			System.out.println("Person adddress : "+person2);
			System.out.println("Person adddress 3: "+context.getBean("address3"));
			System.out.println("Person adddress 4: "+context.getBean("person5QualifierCall"));
		   
			
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//			System.out.println(context.getBeanDefinitionCount());
		} catch (BeansException e) {
		
			e.printStackTrace();
		}
	}

}
