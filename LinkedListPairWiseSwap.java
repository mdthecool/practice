
public class LinkedListPairWiseSwap {

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
		
		LinkedListNode head = swap(n1);

		System.out.println("The linkedlist is ");
		while(head !=null){
			
			System.out.print(head.data);
			head = head.next;
		}
	}
	
	public static LinkedListNode swap(LinkedListNode head){
		
		if(head.next == null){
			return head;
		}
		LinkedListNode prev = head;
		LinkedListNode curr = head.next;
		LinkedListNode next;
		boolean flag = false;
		
		
		while(curr !=null){
			next = curr.next;
			curr.next = prev;
			prev.next = next;
			
			if(flag == false){
				flag = true;
				head = curr;
			}
			curr = curr.next;
			System.out.println("The curr is " + curr.data);
			
		}
		
		return head;
		
		
	}

}
