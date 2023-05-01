package in.ineuron.component;

import java.util.Date;


//this class is normal java bean not spring bean as all the things are done by  GAURAV 
//Target Class(user defined class)
public class WishMessageGenerator {

//static block(Always execute first inisde a java class )
	static {
		
		System.out.println("WishMessageGenerator.class file is loading..... ");
	}
	
	
	
//setter	
public void setDate(Date date) {
		this.date = date;
		
		System.out.println("setter method is called to perform setter injection ");
		System.out.println(this);
	}




	//zero argument constructor
	public WishMessageGenerator() {
		super();
		System.out.println("WishMessageGenerator object is instantiated using :Zero Param Constructor");
	}

	
	

//One parameterized constructor
	public WishMessageGenerator(Date date) {
		super();
		this.date = date;
		System.out.println("WishMessageGenerator  class object is instantiated using One Parametrized Constructor....");
		System.out.println(this);
	}

	
	
	//to String method
	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}





	//predefined class(dependent class)also called helper class .
	//works as a variable for class WishMessageGenereator
	private Date date;
	

	
	

	

	

		
		
		
		
	
}
