/*Given a linkedlist, move all the odd index nodes first and then even indexes.
 * 
 * Solution - Take two pointers even and odd
 * odd.next = odd.next.next
 * even.next = even.next.next
 * then merge the head of even with last node of odd.
 * 
 * 
 */
public class LinkedListOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListNode l = new LinkedListNode(1);
		l.next = new LinkedListNode(2);
		l.next.next = new LinkedListNode(3);
		l.next.next.next = new LinkedListNode(4);
		l.next.next.next.next = new LinkedListNode(5);
		
		print(l);
		System.out.println();
		l = oddEven(l);
		print(l);
	
	}

	
	public static LinkedListNode oddEven(LinkedListNode header){
		
		if(header == null){
			return null;
		}
		LinkedListNode odd = header;
		LinkedListNode evenHead = header.next;
		LinkedListNode even = header.next;
		
		while(odd.next !=null && even.next !=null){
			
			odd.next = odd.next.next;
			even.next = even.next.next;
			odd = odd.next;
			even = even.next;
		}
		
		//Now put the even head to the end of odd.
		odd.next = evenHead;
		
		return header;
		
	}
	
	public static void print(LinkedListNode header){
		
		while(header!=null){
			
			System.out.print(header.data + " ");
			header = header.next;
		}
	}
}
