/*Given a linkedlist return the linkedlist containing first and last in alternate fashion.
 * 
 *  1->2->3->4->5
 *  
 *  return
 *  
 *  1->5->2->4->3
 *  
 *  Solution - Split the linkedlist into two halves. Reverse the second half and then merge in alternate way.
 * 
 * 
 * 
 */
public class LinkedListFirstLastAlternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListNode l = new LinkedListNode(1);
		l.next = new LinkedListNode(2);
		l.next.next = new LinkedListNode(3);
		l.next.next.next = new LinkedListNode(4);
		l.next.next.next.next = new LinkedListNode(5);
		print(l);
		l = firstLast(l);
		print(l);
	}

	
	public static LinkedListNode firstLast(LinkedListNode header){
		
		
		LinkedListNode middle = findMiddle(header);
		LinkedListNode sec_header = middle.next;
		middle.next = null;
		sec_header = reverse(sec_header);
		LinkedListNode first_header = header;
		LinkedListNode temp1,temp2;
		//Add alternates.
		while(first_header !=null && sec_header !=null){
			
			temp1 = first_header.next;
			temp2 = sec_header.next;
			first_header.next = sec_header;
			sec_header.next = temp1;
			first_header = temp1;
			sec_header = temp2;
		}
		
		return header;
	}
	
	
	public static LinkedListNode reverse(LinkedListNode header){
		
		LinkedListNode prev = null;
		LinkedListNode curr = header;
		LinkedListNode next = null;
		
		while(curr !=null){
			
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
	}
	
	public static LinkedListNode findMiddle(LinkedListNode header){
		
		LinkedListNode hare = header;
		LinkedListNode tor = header;
		
		while(hare!=null && hare.next !=null){	
			
			hare = hare.next.next;
			tor = tor.next;
		}
		
		return tor;
		}
	
	public static void print(LinkedListNode header){
		
		System.out.println();
		while(header !=null){
			
			System.out.print(header.data + " ");
			header = header.next;
		}
	}
}
