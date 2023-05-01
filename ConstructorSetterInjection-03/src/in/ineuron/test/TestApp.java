package in.ineuron.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.component.WishMessageGenerator;

public class TestApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
System.out.println("no of beans is :"+factory.getBeanDefinitionCount());
System.out.println("bean id is ::"+Arrays.toString(factory.getBeanDefinitionNames()));

		
		
		
		WishMessageGenerator wmg=(WishMessageGenerator)factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg);
		factory.close();
	}

}
