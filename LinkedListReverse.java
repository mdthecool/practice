
public class LinkedListReverse {

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
		reverseLinkedList(n1);

	}
	
	public static void reverseLinkedList(LinkedListNode header){
		
		
		LinkedListNode prev = null;
		LinkedListNode curr = header;
		LinkedListNode next = header.next;
		
		if(curr==header){
			curr.next = null;
			prev = curr;
			curr = next;
			next = next.next;
		}
		
		while(curr !=null){
			
			curr.next = prev;
			
			prev = curr;
			
			curr = next;
			if(next!=null){
			next = next.next;
			}
		}
		
		header = prev;
		curr = prev;
		System.out.println("The reversed linkedlist is ");
		while(curr !=null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}
