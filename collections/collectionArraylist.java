package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class collectionArraylist {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("Size of array list : "+al.size());
		
		al.add("Apple");
		al.add("Banana");
		al.add("Cucumber");
		al.add("Apple");
		al.add("Fig");
		al.add(null);
		System.out.println("Size of array list : "+al.size());
		System.out.println(al);
		
		System.out.println("Element 4 : "+al.get(4));
		
		al.remove(null);
		System.out.println(al);
		al.remove(3);
		Iterator<String> i = al.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
