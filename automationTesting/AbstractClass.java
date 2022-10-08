package automationTesting;

abstract class Animal{
	void eat(){
		System.out.println("All amimals can eat");
	}
	abstract void sleep();
}

public class AbstractClass extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass obj = new AbstractClass();
		obj.eat();
		obj.sleep();
	}

	
	void sleep() {
		// Speak for animal
		System.out.println("All animals will sleep");
	}

}
