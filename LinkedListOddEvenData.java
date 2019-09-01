/*Given a linkedlist, form a linkedlist such that the nodes with odd data come before the nodes with even data
 * 
 * Solution = Take two pointers both initially pointing to null;
 * Traverse the original list If the data is even make even.next to that node , else odd.next to that node.
 * 
 * 
 * 
 */
public class LinkedListOddEvenData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode n = new LinkedListNode(1);
		n.next = new LinkedListNode(2);
		n.next.next = new LinkedListNode(2);
		n.next.next.next = new LinkedListNode(4);
		n.next.next.next.next = new LinkedListNode(5);
		n.next.next.next.next.next = new LinkedListNode(6);
		oddEvenSeggregate(n);
		

	}

	
	public static void oddEvenSeggregate(LinkedListNode header){
		
		LinkedListNode even = null;
		LinkedListNode evenHead = null;
		LinkedListNode odd = null;
		LinkedListNode oddHead = null;
		LinkedListNode temp = header;
		
		while(temp !=null){
			
			if(temp.data%2 ==0){
				
				//it's an even node
				if(even == null){
					even = temp;
					evenHead = temp;
				}
				
				else {
					even.next = temp;
					even = even.next;
				}
			}
			
			else if(temp.data%2 !=0){
				//it's an odd node
				if(odd == null){
					odd = temp;
					oddHead = temp;
				}
				
				
				else {
					
					odd.next = temp;
					odd = odd.next;
				}
			}
			
			temp = temp.next;
		}
		
		odd.next = evenHead;
		//Now traverse the list.
		
		temp = oddHead;
		while(temp!=null){
			
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
