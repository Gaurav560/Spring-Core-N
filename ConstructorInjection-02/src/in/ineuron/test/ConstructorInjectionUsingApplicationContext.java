package in.ineuron.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.component.WishMessageGenerator;

public class ConstructorInjectionUsingApplicationContext {

	public static void main(String[] args) {

		System.out.println("Application context container starting.......");
		// ACTIVATING THE IOC CONTAINER(Application context container starting.......)

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		// Beans already created after creating Application context container object and
		// configuring it through applicationcontext.xml file
		System.out.println("no of beans is :" + factory.getBeanDefinitionCount());
		System.out.println("no of beans is :" + Arrays.toString(factory.getBeanDefinitionNames()));

		System.out.println("\nApplication context container started.......");
		WishMessageGenerator wmg = (WishMessageGenerator) factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg.hashCode());
		String msg1 = wmg.generateMessage("gaurvaa");
		System.out.println(msg1);

		// 2nd time no object is created .it uses the same object kept in cache memory
		// for faster execution
		// note hashcode of both the objects is same

		WishMessageGenerator wmg1 = (WishMessageGenerator) factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg1.hashCode());
		String msg2 = wmg.generateMessage("Kohli");
		System.out.println(msg2);

		System.out.println("container is closing..");

		System.out.println("no of beans is :" + factory.getBeanDefinitionCount());
		System.out.println("no of beans is :" + Arrays.toString(factory.getBeanDefinitionNames()));

		factory.close();
	}

}
