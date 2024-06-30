package com.demo.springframework6.game.example.e1;


import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeD somed;

	public SomeClass(SomeD somed) {
		super();
		this.somed = somed;
		System.out.println("All dependies are ready");
	}
	
	@PostConstruct
	public void intializw() {
		somed.getReady();
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("Clean up");
	}
}

@Component
class SomeD{

	public void getReady() {
		System.out.println("GetReady method!!");
	}
	
}

@Configuration
@ComponentScan
public class PrePostLuncherApplication {
	public static void main(String[] args) 
	{
		try (var context = new AnnotationConfigApplicationContext(PrePostLuncherApplication.class)) 
		{
		}
		catch (BeansException e) 
		{
			e.printStackTrace();
		}
	}

}
