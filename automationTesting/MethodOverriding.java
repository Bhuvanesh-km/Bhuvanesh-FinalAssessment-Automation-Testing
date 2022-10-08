package automationTesting;
class Vehicles{
	void wheels() {
		System.out.println("All cars have 4 wheels");
	}
}
public class MethodOverriding extends Vehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding bike = new MethodOverriding();
		bike.wheels();
	}
	void wheels() {
		System.out.println("Bike has 2 wheels");
	}

}
