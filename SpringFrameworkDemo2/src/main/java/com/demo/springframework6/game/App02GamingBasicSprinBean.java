package com.demo.springframework6.game;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;;

@Configuration
@ComponentScan("com.demo.springframework6.game")
public class App02GamingBasicSprinBean 
{
	


	/*
	 * @Bean public GameRunner gameRunner1(GamingConsole game1) {
	 * System.out.println("Inside game!!"+game1); var gameRunner = new
	 * GameRunner(game1); return gameRunner; }
	 * 
	 * 
	 */
	public static void main(String[] args) 
	{
		try (var context = new AnnotationConfigApplicationContext(App02GamingBasicSprinBean.class)) 
		{
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		catch (BeansException e) 
		{
			e.printStackTrace();
		}
	}

}
