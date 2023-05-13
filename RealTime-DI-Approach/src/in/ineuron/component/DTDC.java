package in.ineuron.component;

public class DTDC implements Courier {

	
	
	
static {
		
		System.out.println("DTDC.class file is loading....");
		
	}
	
public DTDC() {
	System.out.println("DTDC::Zero param constrcutor ......");
	}
	
	@Override
	public String deliver(int oid) {
System.out.println("DTDC.deliver()");
		return "DTDC will deliver the courier with oid ::"+oid;
	}

}
