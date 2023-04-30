package in.ineuron.test;

import in.ineuron.component.WishMessageGenerator;

public class MainApp {

	public static void main(String[] args) {

		// Target object is created
		WishMessageGenerator generator = new WishMessageGenerator();
System.out.println("Target object before setter injection .."+generator);
		
		
		// later on dependent object is created
		java.util.Date date = new java.util.Date();
		System.out.println("Dependent object is ..."+date);
		// setter injection is done.dependent object is being injected in target object
		//Note when we use spring core ,all these works like objection creation ,injection wil be done by IOC Containers.
		//we just to have configure those IOC containers provided by Spring 
		
		generator.setDate(date);

		System.out.println("Target object after setter injection .."+generator);
		
		String result=generator.generateMessage("Gaurav");
		System.out.println(result);
		
		
	}

}
