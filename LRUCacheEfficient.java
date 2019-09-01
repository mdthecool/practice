import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCacheEfficient {

	static LinkedList<DoubleLinkedListNode> l = new LinkedList<DoubleLinkedListNode>();
	static int size;
	static HashMap<Integer,DoubleLinkedListNode> m = new HashMap<Integer,DoubleLinkedListNode>();
	static DoubleLinkedListNode head;
	
	LRUCacheEfficient(int size){
		
		this.size = size;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LRUCacheEfficient la = new LRUCacheEfficient(3);
		la.insert(1);
		print();
		//System.out.println("The size is " + l.size());
		la.insert(2);
		print();
		//System.out.println("The size is " + l.size());
		la.insert(3);
		print();
		//System.out.println("The size is " + l.size());
		la.insert(4);
		print();
		//System.out.println("The size is " + l.size());
		la.insert(1);
		print();
		la.insert(2);
		print();
		la.insert(5);
		print();
		la.insert(1);
		print();
		la.insert(2);
		print();
		la.insert(3);
		print();
		la.insert(4);
		print();
		la.insert(5);
		print();

	}

	
	
	public void insert(int x){
		
		if(m.size()==0){
			l.add(new DoubleLinkedListNode(x));
			
			m.put(x,l.peekFirst());
			
			
		}
		
		else if (m.containsKey(x)){
			DoubleLinkedListNode n =  m.get(x);
			l.removeFirstOccurrence(n);
			l.addFirst(n);
			
			
		}
		
		else {
			
			 if(m.size()<size){
				  l.addFirst(new DoubleLinkedListNode(x));
				  m.put(x,l.peekFirst());
				 
				  
			 }
			 
			 else {
				DoubleLinkedListNode temp =  l.removeLast();
				m.remove(temp.data);
				l.addFirst(new DoubleLinkedListNode(x));
				m.put(x,l.peekFirst());
				
			 }
		}
	}
	
	public static void print(){
		
		Iterator<DoubleLinkedListNode> itr = l.iterator();
		while(itr.hasNext()){
			
			System.out.print(itr.next().data + " ");
		}
		System.out.println("");
	}
}
