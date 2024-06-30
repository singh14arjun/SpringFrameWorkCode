package com.demo.springframework6.game.example.a1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BussinessLogicClass {

	Dependency1 deoendeny1;

	Dependency2 deoendeny2;

	@Autowired
	public BussinessLogicClass(Dependency1 deoendeny1, Dependency2 deoendeny2) {
		super();
		System.out.println("Constructor");
		this.deoendeny1 = deoendeny1;
		this.deoendeny2 = deoendeny2;
	}

	/*
	 * @Autowired public void setDeoendeny1(Dependency1 deoendeny1) {
	 * System.out.println("Setter1"); this.deoendeny1 = deoendeny1; }
	 * 
	 * @Autowired public void setDeoendeny2(Dependency2 deoendeny2) {
	 * System.out.println("Setter2");
	 * 
	 * this.deoendeny2 = deoendeny2; }
	 */

	public String toString() {
		return "Using " + deoendeny1 + "and " + deoendeny2;
	}

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan("com.demo.springframework6.game.example.a1")
public class DependencyInjectionLumcherApplication {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLumcherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BussinessLogicClass.class));
			;
		}

		catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
