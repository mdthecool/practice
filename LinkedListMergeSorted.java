
public class LinkedListMergeSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListNode n1 = new LinkedListNode(3);
		LinkedListNode n2 = new LinkedListNode(5);
		LinkedListNode n3 = new LinkedListNode(7);
		LinkedListNode n4 = new LinkedListNode(9);
		LinkedListNode n5 = new LinkedListNode(11);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		LinkedListNode n6 = new LinkedListNode(1);
		LinkedListNode n7 = new LinkedListNode(2);
		LinkedListNode n8 = new LinkedListNode(4);
		LinkedListNode n9 = new LinkedListNode(6);
		LinkedListNode n10 = new LinkedListNode(8);
		n6.next=n7;
		n7.next=n8;
		n8.next=n9;
		n9.next=n10;
		if(n1.data < n6.data){
		n1 = merge(n1,n6);
		print(n1);
		}
		else {
			n6 = merge(n6,n1);
			print(n6);
		}
	}
	
	
	public static LinkedListNode merge (LinkedListNode head1, LinkedListNode head2){
		
		LinkedListNode curr = head1;
		LinkedListNode next = head1.next;
		
		while(next !=null && head2!=null){
			
			if(head2.data > curr.data && head2.data < next.data){
				
				LinkedListNode temp = head2.next;
				curr.next = head2;
				head2.next = next;
				curr = curr.next;
				head2 = temp;
			}
			
			else {
				
				curr = curr.next;
				next = next.next;
			}
		}
		
		if(head2 !=null){
			while(head2 !=null){
				curr.next = head2;
				curr = curr.next;
				head2 = head2.next;
			}
		}
		return head1;
	}

	public static void print(LinkedListNode header){
		
		System.out.println("The merged list is ");
		while(header !=null){
			
			System.out.print(header.data + " ");
			header = header.next;
		}
	}
	
}
