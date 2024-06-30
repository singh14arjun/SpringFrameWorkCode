package com.demo.springframework6.game.example.c1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldSpringContextLuncherApplication {
	public static void main(String[] args) 
	{
		try (var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLuncherApplication.class)) 
		{
		Arrays.stream(context.getBeanDefinitionNames()).forEach(p->System.out.println(p));
	    int max = context.getBean(BLC.class).findMax();
	    System.out.println("Max  is : "+max);
		}
		catch (BeansException e) 
		{
			e.printStackTrace();
		}
	}

}
