package in.ineuron.component;

import java.util.Arrays;
import java.util.Random;

//Target Object
public class Flipkart {

	// Dependent Object
	private Courier courier;
	private Float discount;

	static {

		System.out.println("Flipkart.class file is loading.. ");
	}

	public Flipkart() {
		System.out.println("Flipkart ::zero param constructor");
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("Flipkart.setCourier()");
		System.out.println(this);
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
		System.out.println("Flipkart.setDiscount()");
	}

	// Buisness logic
	public String doShopping(String[] items, float prices[]) {

		System.out.println("Flipkart.doShopping()");
		System.out.println("Implementation class is ::" + courier.getClass().getName());
		System.out.println("Discount amount is ::" + discount);

		int oid = 0;
		float billAmount = 0.0f;
		Random random = null;
		for (float f : prices) {
			billAmount += f;
		}
		billAmount=billAmount-(billAmount*discount/100);

		random = new Random();

		oid = random.nextInt(1000);
		String msg = courier.deliver(oid);

		return Arrays.toString(items) + "are purchased having prices " + Arrays.toString(prices)
				+ "with bill amount of " + billAmount+"-------->"+msg;

	}

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}

}
