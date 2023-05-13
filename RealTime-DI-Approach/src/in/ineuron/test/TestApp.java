package in.ineuron.test;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.component.Flipkart;

public class TestApp {
	
	
	public static void main(String[] args) throws Exception {
		DefaultListableBeanFactory  dfactory=null;
		XmlBeanDefinitionReader r1=null;
		
		
				
				dfactory=new DefaultListableBeanFactory();
		r1=new XmlBeanDefinitionReader(dfactory);
		r1.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		
		System.out.println("**********application cotext started ************");
		System.in.read();
		
		Flipkart flipkart=dfactory.getBean("flpkrt",Flipkart.class);
		System.out.println(flipkart);
		String result=flipkart.doShopping(new String[] {"fossil","tissot"},new float[] {12454.4f,4646.5f});
		System.out.println(result);
		
		
		
		
		
		
		System.out.println("********************Container stopped**********");
	}
	

	
	
		
		
		
}

	

