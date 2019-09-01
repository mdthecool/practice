/*given a linked list find the nth node from the end.
 * Solution - nth node from the end is total_length-n+1 from the beginning.
 * 
 */
public class LinkedListNthFromEnd {

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
		 nthFromEnd(n1,5);
		
	}
	
	
	public static void nthFromEnd(LinkedListNode header,int n){
		
		LinkedListNode temp = header;
		int count=0;
		while(temp!=null){
			
			count++;
			temp = temp.next;
		}
		
		temp = header;
		count = count-n+1;
		while(count>1){
			
			count--;
			temp = temp.next;
		}
		
		System.out.println(temp.data);
	}

}
