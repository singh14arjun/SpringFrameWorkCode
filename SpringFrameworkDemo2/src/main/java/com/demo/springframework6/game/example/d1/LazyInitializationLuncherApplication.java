package com.demo.springframework6.game.example.d1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}
@Component
@Lazy
class ClassB{
	private ClassA classA;

	public ClassB(ClassA classA) {
		super();
		System.out.println("Some logic goes here");
		this.classA = classA;
	}

	public void doSomething() {
		System.out.println("Do something method!");
	}
	
}
@Configuration
@ComponentScan
public class LazyInitializationLuncherApplication {
	public static void main(String[] args) 
	{
		try (var context = new AnnotationConfigApplicationContext(LazyInitializationLuncherApplication.class)) 
		{
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(p->System.out.println(p));
		System.out.println("Initialization of context is completd!!");
		context.getBean(ClassB.class).doSomething();
		}
		catch (BeansException e) 
		{
			e.printStackTrace();
		}
	}

}
