package collections;
import java.util.PriorityQueue;
import java.util.Iterator;
public class priorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> qu = new PriorityQueue<Integer>();
		
		qu.add(67);
		qu.add(88);
		qu.add(78);
		qu.add(67);
		qu.add(99);
		
		System.out.println(qu);
		
		
		System.out.println(qu.peek());
		System.out.println(qu);
		System.out.println(qu.poll());
		System.out.println(qu);
		
		qu.remove(67);
		System.out.println(qu);
		
		Iterator<Integer> i =qu.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
