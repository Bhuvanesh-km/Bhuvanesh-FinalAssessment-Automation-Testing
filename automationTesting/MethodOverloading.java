// program for methodOverloading In java

package automationTesting;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading ob = new MethodOverloading();
		ob.add(2, 4);
		ob.add(5, 5.7);
		ob.add(2, 4, 7);
	}
	
	void add(int a,int b) {
		System.out.println("Addition of "+a+"+"+b+"="+(a+b));
	}
	void add(int a,double b) {
		System.out.println("Addition of "+a+"+"+b+"="+(a+b));
	}
	void add(int a, int b, int c) {
		System.out.println("Addition of "+a+"+"+b+"+"+c+"="+(a+b+c));
	}


}
