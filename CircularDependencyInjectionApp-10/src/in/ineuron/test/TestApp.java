package in.ineuron.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.component.A;
import in.ineuron.component.B;

public class TestApp {
	
	
	public static void main(String[] args) throws Exception {
	
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		
		System.out.println("*********Container Started*********");
		
		A aobj=factory.getBean("a1",A.class);
		
		
	B bobj=factory.getBean("b1",B.class);
	
		System.out.println("*********Container Closed*********");
		
		
		
		
	}
	

	
	
		
		
		
}

	

