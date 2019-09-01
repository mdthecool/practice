
public class DeleteWithoutHeaderNode {

	static LinkedListNode header;
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
		header = n1;
		delete(n3);
	}

	
	public static void delete(LinkedListNode n){
		
		n.data = n.next.data;
		n.next = n.next.next;
		System.out.println("The linkedlist aftr deletion is ");
		LinkedListNode temp = header;
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	
	
}
