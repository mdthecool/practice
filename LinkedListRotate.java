
public class LinkedListRotate {

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
		n5.next = n6;
	    n6.next =n7;
	    n7.next = n8;
	    
		rotate(n1,4);
	}
	
	public static void rotate(LinkedListNode n1,int k){
		int count=1;
		LinkedListNode temp1 = n1;
		LinkedListNode temp2 = n1.next;
		while(count!=k){
			
			temp1=temp1.next;
			temp2=temp2.next;
			count++;
		}
		
		temp1.next = null;
		temp1 = temp2;
		LinkedListNode header =  temp2;
		while(temp1.next!=null){
			
			temp1 = temp1.next;
		}
		
		temp1.next=n1;
		temp1 = header;
		System.out.println("The roated linkedlist is ");
		while(temp1 !=null){
			System.out.print(temp1.data + " ");
			temp1 = temp1.next;
		}
	}

}
