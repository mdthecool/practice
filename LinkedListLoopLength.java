
public class LinkedListLoopLength {

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
		n5.next = n3;
		loopLength(n1);

	}

	
	
	public static void loopLength(LinkedListNode header){
		
		LinkedListNode hare = header;
		LinkedListNode tor = header;
		
		while(hare!=null && tor!=null && hare.next!=null){
			
			hare = hare.next.next;
			tor = tor.next;
			
			if(tor == hare){
				
				System.out.println("Loop Detected");
				
				loopLength(hare,tor);
				return;
			}
		}
	}
	
	
	public static void loopLength(LinkedListNode hare,LinkedListNode tor){
		
		int count =1;
		while(tor.next!=hare){
			
			tor=tor.next;
			count++;
			
		}
		
		System.out.println("The length of the loop is " + count);
	}
}
