//Program for Inheritance-> Single level Inheritance

package automationTesting;


class Parent{
	String name="Bhuvanesh";
	String company="Tietoevry";
	int empid=12345;
	void show() {
		System.out.println("Employee name "+name);
		System.out.println("Employee compnany "+company);
		System.out.println("Employee Id "+empid);
	}
}

public class Inheritance extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance obj = new Inheritance();
		obj.show();

	}

}
