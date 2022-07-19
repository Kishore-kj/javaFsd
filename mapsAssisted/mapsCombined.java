package mapsAssisted;

import java.util.*;

public class mapsCombined {
   
	public static void main(String[] args) {
		
		//HashMap
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		System.out.println("HashMap");
		hm.put(1,"Kishore");
		hm.put(4,"Monesh");
		hm.put(3,"Ajjey");
		hm.put(2,"Sanjay");
		System.out.println("the Elements in the hashmap are");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//Hashtable
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		System.out.println("\n"+"Hashtable");
		ht.put(5, "Reshma");
		ht.put(6, "Naren");
		ht.put(7, "Sharan");
		ht.put(8, "Siva");
		System.out.println("The elements in the hashtable");
		for(Map.Entry n:ht.entrySet()) {
			System.out.println(n.getKey()+" "+n.getValue());
		}
		
		//TreeMap
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		System.out.println("\n"+"TreeMap");
		tm.put(9,"Mouli");
		tm.put(11, "Deekshu");
		tm.put(10,"Nazir");
		System.out.println("The elements in tree map are ");
		for(Map.Entry o:tm.entrySet()) {
			System.out.println(o.getKey()+" "+o.getValue());
		}
		
	}
}
