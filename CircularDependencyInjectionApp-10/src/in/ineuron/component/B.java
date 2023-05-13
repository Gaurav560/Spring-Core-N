package in.ineuron.component;


//target class
public class B {
	
	//dependent class
 private A a;

 static {
	 
	 System.out.println("B.class file is loading ");
 }
 
 
 
 
 
public B(A a) {
	super();
	this.a = a;
}

@Override
public String toString() {
	return "B [a=" + a + "]";
}

public void setA(A a) {
	this.a = a;
	System.out.println("B.setA()");
}

public B() {
	System.out.println(" B:: Zero param constructor ");
}
 
 
}
