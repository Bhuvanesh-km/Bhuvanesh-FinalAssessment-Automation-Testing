package automationTesting;

interface dog{
	void speak();
}

public class Interfaces implements dog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaces obj = new Interfaces();
		obj.speak();
	}

	
	public void speak() {
		// dogs will bark
		System.out.println("Dogs will bark");
	}

}
