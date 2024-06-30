package com.demo.springframework6.game.example.g1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BuscinessClass{
	  private ServiceClass servicClass;


	  @Inject
//	  @Autowired
	public void setServicClass(ServiceClass servicClass) {
		System.out.println("Setter Injection");
		this.servicClass = servicClass;
	}


	public ServiceClass getServicClass() 
	{
		return servicClass;
	}
	  
	  
}
//@Component
@Named
class ServiceClass{
	
}

@Configuration
@ComponentScan
public class CDIContextLuncherApplication {
	public static void main(String[] args) 
	{
		try (var context = new AnnotationConfigApplicationContext(CDIContextLuncherApplication.class)) 
		{
		Arrays.stream(context.getBeanDefinitionNames()).forEach(p->System.out.println(p));
		System.out.println(context.getBean(BuscinessClass.class).getServicClass());
		}
		catch (BeansException e) 
		{
			e.printStackTrace();
		}
	}

}
