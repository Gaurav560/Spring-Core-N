package in.ineuron.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.component.WishMessageGenerator;

//in case of constructor injection through spring ioc container ,first dependent class object is created and then target class object
public class ConstructorInjectionUsingSpringIOCContainerBeanFactory {

	public static void main(String[] args) {

		FileSystemResource resource = new FileSystemResource("src/in/ineuron/cfg/applicationContext.xml");

		System.out.println("BeanFactoryContainer starting..");

		// ACTIVATING THE IOC CONTAINER(XML BEAN FACTORY)
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("BeanFactoryContainer started..");
		WishMessageGenerator wmg = (WishMessageGenerator) factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg);
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
	}

}
