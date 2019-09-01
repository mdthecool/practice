class LinkedListNode{
	
	int data;
	LinkedListNode next;
	LinkedListNode random; //for the random node problem
	LinkedListNode down;   //for the flatten linkedlist problem
	
	
	LinkedListNode(int data){
		
		this.data = data;
		this.next = null;
	}
	
}
public class LinkedListMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListNode n1 = new LinkedListNode(1);
		LinkedListNode n2 = new LinkedListNode(2);
		LinkedListNode n3 = new LinkedListNode(3);
		LinkedListNode n4 = new LinkedListNode(4);
		LinkedListNode n5 = new LinkedListNode(5);
		LinkedListNode n6 = new LinkedListNode(6);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		middle(n1);
		
	}
	
	
	public static void middle(LinkedListNode head){
		
		LinkedListNode temp = head;
		LinkedListNode middle = head;
		while(temp!=null && temp.next !=null){
			
			temp = temp.next.next;
			middle = middle.next;
		}
		
		System.out.println("The middle node is " + middle.data);
	}

	
	
}
