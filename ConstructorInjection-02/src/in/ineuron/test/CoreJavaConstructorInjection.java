package in.ineuron.test;



import java.util.Date;

import in.ineuron.component.WishMessageGenerator;
public class CoreJavaConstructorInjection {

	public static void main(String[] args) {

		Date date = new java.util.Date();
		System.out.println("creating an object of dependent class using zero parametrized constructor " + date);

		// creating target object and injecting the dependent class object through
		// Parameterized constructor
		WishMessageGenerator wmg = new WishMessageGenerator(date);
		System.out.println("creating an object of Target Class using :" + wmg);
		
		String name=wmg.generateMessage("Dhoni");
		System.out.println(name);
		

	}

}
