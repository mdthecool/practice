/*Implement a LRU cache.
 * Solution - LRU cache can be implemented using a dequeue(elements can be inserted from at the end and at the front)
 * and a hashset.
 * 
 * 
 * 
 * 
 * 
 */


import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class LRUCache {

	
	static HashMap<Integer,DoubleLinkedListNode> m = new HashMap<Integer,DoubleLinkedListNode>();
	static int size;
	static DoubleLinkedListNode head=null;
	static DoubleLinkedListNode end = null;
	
	LRUCache(int size){
		
		this.size = size;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LRUCache la = new LRUCache(3);
		la.add(1);
		print();
		la.add(2);
		print();
		la.add(3);
		print();
		la.add(4);
		print();
		la.add(1);
		print();
		la.add(2);
		print();
		la.add(5);
		print();
		la.add(1);
		print();
		la.add(2);
		print();
		la.add(3);
		print();
		la.add(4);
		print();
		la.add(5);
		print();
		
		
		
		
	}
	
	
	
	public static void add (int num){
	
		//if the element is already present in the hashmap, bring it to the front. If not,check if less than size
		//then add to both the linked list and map. if Size is full then remove the last and add.
		
		if(m.containsKey(num)){
			
			System.out.println("Element already present ...Putting to front");
			delete(m.get(num));
			addFront(num);
			
		}
		
		else {
			
			if(m.size()<size){
				
				
				System.out.println("Element Not found ...Putting to front");
				DoubleLinkedListNode temp = addFront(num);
				m.put(num,temp);
			}
			
			else {
				
				System.out.println("Size exceeded ....removing from last.." + end.data + " and adding to front");
				//remove from last and add to front.
				
				m.remove(end.data);
				delete(end);
				
				DoubleLinkedListNode temp = addFront(num);
				m.put(num,temp);
				
				
			}
		}
		
		
	}

	
	public static void delete(DoubleLinkedListNode n){
		
		if(n.prev ==null){
			
			
			DoubleLinkedListNode temp = head.next;
			head.next = null;
			head = temp;
			return;
			
		}
		
		if(n.next == null){
			
			
			DoubleLinkedListNode temp = n.prev;
			n.prev.next = null;
			n.prev = null;
			n.next = null;
			end = temp;
			return;
		}
		
		else {
		n.prev.next = n.next;
        n.next.prev = n.prev;
        n.prev = null;
        n.next = null;
		}
		
		
	}
	
	public static DoubleLinkedListNode addFront(int num){
		
		DoubleLinkedListNode temp = new DoubleLinkedListNode(num);
		
		if(head == null){
			end = temp;
			head = temp;
			temp.prev = null;
			temp.next = null;
			
		    
		}
		else {
		temp.next = head;
		head.prev = temp;
		
		head = temp;
		}
		return head;
		
		
	}
	
	public static void print(){
		
		DoubleLinkedListNode temp = head;
		while(temp !=null){
			
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
		System.out.println(" ");
	}
}
