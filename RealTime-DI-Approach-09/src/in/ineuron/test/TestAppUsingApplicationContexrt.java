package in.ineuron.test;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.component.Flipkart;

public class TestAppUsingApplicationContexrt {
	
	
	public static void main(String[] args) throws Exception {
		
		
		ClassPathXmlApplicationContext dfactory=new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
		System.out.println("**********application cotext started ************");
		System.in.read();
		
		Flipkart flipkart=dfactory.getBean("flpkrt",Flipkart.class);
		System.out.println(flipkart);
		String result=flipkart.doShopping(new String[] {"fossil","tissot"},new float[] {12454.4f,4646.5f});
		System.out.println(result);
		
		
		
		
		
		
		System.out.println("********************Container stopped**********");
		dfactory.close();
	}
	

	
	
		
		
		
}

	

