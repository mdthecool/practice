
public class LinkedListReverseInGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListNode n1 = new LinkedListNode(1);
		LinkedListNode n2 = new LinkedListNode(2);
		LinkedListNode n3 = new LinkedListNode(3);
		LinkedListNode n4 = new LinkedListNode(4);
		LinkedListNode n5 = new LinkedListNode(5);
		LinkedListNode n6 = new LinkedListNode(6);
		LinkedListNode n7 = new LinkedListNode(7);
		LinkedListNode n8 = new LinkedListNode(8);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n8;
		int k =3;
		LinkedListNode h = reverseInGroups(n1,3);
		print(h);
	}
	
	
	public static LinkedListNode reverseInGroups(LinkedListNode header,int k){
		
		LinkedListNode prev,curr,next = null;
		prev = null;
		curr = header;
		
		
		int count =0;
		
		while(count < k && curr !=null){
			
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		
			
		}
		if(next!=null){
		header.next = reverseInGroups(next,k);
		}
		return prev;
		
	}
	
	public static void print(LinkedListNode header){
		
		System.out.println("The linkedlist is ");
		while(header!=null){
			
			System.out.print(header.data + " ");
			header = header.next;
		}
		
	}

}
