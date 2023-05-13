package in.ineuron.component;


//target class
public class A {
	
	//dependent on b class
private B b;





static {
	 
	 System.out.println("A.class file is loading ");
}

public A() {
	
	System.out.println("A:: zero param constructor ");
}







public void setB(B b) {
	this.b = b;
	System.out.println("A.setB()");
}







public A(B b) {
	super();
	this.b = b;
}







@Override
public String toString() {
	return "A [b=" + b + "]";
}
}
