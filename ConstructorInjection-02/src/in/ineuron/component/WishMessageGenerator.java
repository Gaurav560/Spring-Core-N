package in.ineuron.component;

import java.util.Date;


//this class is normal java bean not spring bean as all the things are done by  GAURAV 
//Target Class(user defined class)
public class WishMessageGenerator {



	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}





	//predefined class(dependent class)also called helper class .
	private Date date;
	

	static {
		
		System.out.println("WishMessageGenerator.class file is loading..... ");
	}

//One parameterized constructor
	
	
	public WishMessageGenerator(Date date) {
	super();
	this.date = date;
	System.out.println("WishMessageGenerator :One Parametrized Constructor....");
}
	

	


	//Business logic method=>using dependent object in business logic 
	
	public String generateMessage(String username) {
		
			int hour=date.getHours();
			if (hour<12) {
				return "Good Morning ::"+username;
				
			}else if (hour<16) {
				return "Good Afternoon ::"+username;
			}
			else if (hour<20) {
				return "Good Evening  ::"+username;
				
			}else {
				return "Good Night ::"+username;
			}
		
		
		
		
		
	}
}
