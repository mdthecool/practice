
public class LinkedListRemoveLoop {

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
		
		removeLoop(n1);
		print(n1);

	}

	
	
	public static void removeLoop(LinkedListNode header){
		
		
		LinkedListNode hare = header;
		LinkedListNode tor = header;
		
		while(hare!=null && tor!=null && hare.next!=null){
			
			hare = hare.next.next;
			tor = tor.next;
			
			if(tor == hare){
				
				System.out.println("Loop Detected");
				removeLoop(header,hare);
				return;
			}
		}
		
		System.out.println("No Loop found");
	}

	
	public static void removeLoop(LinkedListNode tor, LinkedListNode hare){
		
		while(hare.next!=null){
			
			if(hare.next == tor.next){
				System.out.println("Removing loop");
				hare.next = null;
				System.out.println("Loop Removed");
				break;
			}
			
			hare = hare.next;
			tor = tor.next;
		}
		
	}
	
	
	public static void print(LinkedListNode header){
		
		System.out.println("Printing the linkedlist");
		while(header !=null){
			
			System.out.print(header.data);
			header = header.next;
		}
	}
}
