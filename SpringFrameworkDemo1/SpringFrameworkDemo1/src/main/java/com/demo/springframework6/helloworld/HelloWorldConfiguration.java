package com.demo.springframework6.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//record is released in jdk16

record Person(String name, int age,Address address) {
};

record Address(String city, String state) {
};

@Configuration
public class HelloWorldConfiguration

{
	@Bean
	public String name() {
		return "Arjun";
	}

	@Bean
	public Integer age() {
		return 23;
	}

	@Bean
	public Person person() {
		var person = new Person("Ravi", 45,new Address("Hyderabad","TS"));

		return person;
	}
	@Bean
	public Person person2MethodCall() {
		var person = new Person(name(), age(),address());
		
		return person;
	}
	
	@Bean
	public Person person3MethodCall(String name,int age,Address address3) {
		return  new Person(name, age,address3);
	}
	
	@Bean
	@Primary
	public Person person4MethodCall(String name,int age,Address address) {
		return  new Person(name, age,address);
	}
	
	@Bean
	public Person person5QualifierCall(String name,int age,@Qualifier("address4")Address address) {
		return  new Person(name, age,address);
	}
	
	@Bean(name = "addr")
	@Primary
	public Address address() {
		var address=new Address("Hyderabad","TS");
		return address;
	}
	
	@Bean
	public Address address3() {
		return new Address("Siwan","Bihar");
		
	}
	@Bean
	@Qualifier("address4")
	public Address address4() {
		return new Address("Prayagraj","Uttar Pradesh");
		
	}
}
