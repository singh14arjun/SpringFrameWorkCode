package com.demo.springframework6.game.example.a0;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.demo.springframework6.game.example.a1")
public class SimpleSpringContextLuncherApplication {
	public static void main(String[] args) 
	{
		try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLuncherApplication.class)) 
		{
		Arrays.stream(context.getBeanDefinitionNames()).forEach(p->System.out.println(p));
		}
		catch (BeansException e) 
		{
			e.printStackTrace();
		}
	}

}
