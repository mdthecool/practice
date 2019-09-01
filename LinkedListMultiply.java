
public class LinkedListMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListNode n1 = new LinkedListNode(1);
		LinkedListNode n2 = new LinkedListNode(2);
		LinkedListNode n3 = new LinkedListNode(3);
		LinkedListNode n4 = new LinkedListNode(4);
		LinkedListNode n5 = new LinkedListNode(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		LinkedListNode head1 = reverse(n1);
		print(head1);
	}

	
	
	public static LinkedListNode multiply(LinkedListNode head1,LinkedListNode head2){
		
		
		LinkedListNode temp1 = reverse(head1);
		LinkedListNode temp2 = reverse(head2);
		int mult = 0;
		int carry =0;
		//Now multiply
		
		while(temp1 !=null && temp2 !=null){
			
			
		}
		return temp1;
		
	}
	
	
	public static LinkedListNode reverse(LinkedListNode head){
		
		
		LinkedListNode curr = head;
		LinkedListNode prev  = null;
		LinkedListNode next = null;
		
		while(curr!=null){
			
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
		
	}
	
	
	public static void print(LinkedListNode head){
		
		System.out.println("The reversed linkedlist is");
		while(head!=null){
			
			System.out.print(head.data);
			head = head.next;
		}
		
		System.out.println("");
	}
}
