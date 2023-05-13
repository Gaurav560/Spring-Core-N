package in.ineuron.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;



import in.ineuron.component.Student;

//no resource object is used to load the xml file configuration 
public class AdvancedBeanFactoryApp {
	
	public static void main(String[] args) throws Exception {
		DefaultListableBeanFactory dFactory=null;
	XmlBeanDefinitionReader reader =null;

		dFactory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(dFactory);
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		System.out.println("*************Container Started***************\n");
		
		System.in.read();
		
		Student student=dFactory.getBean("Student",Student.class);
		System.out.println(student);
		System.out.println("\n*******************Container Closed*******************");
		
		
		
	}
	
}




