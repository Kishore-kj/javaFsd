package collections;
import java.util.*;
public class collectionCombined {

	public static void main(String[] args) {
		
	System.out.println("ArrayList");
	ArrayList<String> cities =new ArrayList<String>();   
	  cities.add("Chennai");
	  cities.add("Bangalore");
      cities.add("Delhi");
      cities.add("Noida");
      cities.add("Hyderabad");
      
      System.out.println(cities);  
	
	
      System.out.println("\n");
      System.out.println("Vector");
      Vector<Integer> vec = new Vector();
      vec.addElement(15); 
      vec.addElement(30); 
      vec.addElement(40); 
      System.out.println(vec);
	
	
      System.out.println("\n");
      System.out.println("LinkedList");
      LinkedList<String> names=new LinkedList<String>();  
      names.add("Kishore");  
      names.add("Monesh");
      names.add("Ajjey");
      names.add("Sanjay");
      names.add("Sharan");
      Iterator<String> itr=names.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());  
      }
       
       System.out.println("\n");
       System.out.println("HashSet");
       HashSet<Integer> set=new HashSet<Integer>();  
       set.add(101);  
       set.add(103);  
       set.add(102);
       set.add(104);
       System.out.println(set);
       
       
       System.out.println("\n");
       System.out.println("LinkedHashSet");
       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
       set2.add(11);  
       set2.add(13);  
       set2.add(12);
       set2.add(14);	       
       System.out.println(set2);
      	} 
      }  


