package com.demo.springframework6.game.example.h1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.springframework6.game.GameRunner;


public class XMLConfigurationContextLuncherApplication {
	public static void main(String[] args) 
	{
		try (var context = new ClassPathXmlApplicationContext("context.xml")) 
		{
		Arrays.stream(context.getBeanDefinitionNames()).forEach(p->System.out.println(p));
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		context.getBean(GameRunner.class).run();
		}
		catch (BeansException e) 
		{
			e.printStackTrace();
		}
	}

}
