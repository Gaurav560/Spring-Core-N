package in.ineuron.component;

public class BlueDart implements Courier {

	static {
		
		System.out.println("BlueDart.class file is loading....");
		
	}
	
public BlueDart() {
	System.out.println("Zero param constrcutor ......");
	}
	
	
	
	
	
	
	
	
	
	@Override
	public String deliver(int oid) {
System.out.println("BlueDart.deliver()");
return "BlueDart will deliver the courier with oid ::"+oid;
	}

}
