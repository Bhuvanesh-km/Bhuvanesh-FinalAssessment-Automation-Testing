/*
 * Access Modifiers
 * public is accessible everywhere
 * private accessible only within class
 * protected accessible within package & outside package but through inheritance only
 * default accessible only within package
 */


package automationTesting;
class Info{
	//string variable is declare public
	public String name="Kiran";
	//default variable
	int value=123;
	protected void show() {
		System.out.println("name in Info "+name);
	}
	
}

public class AccessModifiers extends Info{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers ob = new AccessModifiers();
		
		ob.show();
		ob.name="Bhuvi";
		ob.show();
		System.out.println(ob.value);
		

	}

}
