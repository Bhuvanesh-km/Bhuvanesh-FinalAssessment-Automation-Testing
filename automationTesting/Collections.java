package automationTesting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection values=new ArrayList();
		values.add("Bhuvi");
		values.add("K");
		values.add(123);
		values.add(12.25);
		Iterator i= values.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
	
		}
		System.out.println();
		values.remove(12.25);
		for(Object j : values)
		{
			System.out.print(j+" ");

		}

	}

}
