/*Problem - Given a linkedlist. Delete all the nodes that have nodes with greater value to its right.
 * Solution - Reverse the linkedlist. ow traverse the list. Take the max in a variable. If the value in linkedlist is
 * less than max delete the node. Also , Update max
 * 
 * 
 * 
 * 
 */
public class LinkedListDeleteNodeGreaterRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode n1 = new LinkedListNode(60);
		LinkedListNode n2 = new LinkedListNode(50);
		LinkedListNode n3 = new LinkedListNode(40);
		LinkedListNode n4 = new LinkedListNode(30);
		LinkedListNode n5 = new LinkedListNode(20);
		LinkedListNode n6 = new LinkedListNode(10);
		
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		
		
		deleteNode(n1);
		

	}
	
	
	public static void deleteNode(LinkedListNode head){
		
		LinkedListNode new_head = reverse(head);
		print(new_head);
		LinkedListNode rev = new_head;
		LinkedListNode prev;
		//Now traverse the array the delete the elements.
		
		int max = rev.data;
		prev = rev;
		rev = rev.next;
		
		while(rev!=null){
			
			if(rev.data < max){
				
				//delete the node
				prev.next = rev.next;
				rev.next = null;
				rev = prev.next;
				
			}
			
			else {
				
				max = rev.data;
				prev = prev.next;
				rev = rev.next;
			}
			
			
		}
		
		new_head = reverse(new_head);
		print(new_head);
	}
	
	
	public static LinkedListNode reverse(LinkedListNode head){
		
		
		LinkedListNode prev = null;
		LinkedListNode curr = head;
		LinkedListNode next;
		
		while(curr!=null){
			
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		
		return prev;
			
	}
	
	public static void print(LinkedListNode head){
		
		System.out.println(" ");
		System.out.print("The linkedlist is ");
		while(head!=null){
			
			System.out.print(head.data + " ");
			head = head.next;
			
		}
	}

}
