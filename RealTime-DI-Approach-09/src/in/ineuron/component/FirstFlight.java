package in.ineuron.component;

public class FirstFlight implements Courier {

	
	
	
	
	
static {
		
		System.out.println("FirstFlight.class file is loading....");
		
	}
	
 public FirstFlight() {
	System.out.println("Zero param constructor....");
}
	
	
	
	
	
	
	@Override
	public String deliver(int oid) {
System.out.println("FirstFlight.deliver()");

		return "FIrstFlight will deliver the courier with oid ::"+oid;
	}

}
