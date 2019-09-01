/*Given a linkedlist where each node points to the next node and a randm pointer. Clone the linkedlist.
 * 
 * 
 * 
 */
public class LinkedListClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListNode l = new LinkedListNode(1);
		l.next = new LinkedListNode(2);
		l.next.next = new LinkedListNode(3);
		l.next.next.next = new LinkedListNode(4);
		l.next.next.next.next = new LinkedListNode(5);
		l.random = l.next.next;
		l.next.random = l;
		l.next.next.random = l.next.next.next.next;
		l.next.next.next.random = l.next.next.next.next;
		l.next.next.next.next.random = l.next;
		print(l);
		clone(l);

		
	}

	
	public static void clone(LinkedListNode header){
		
		LinkedListNode original = header;
		LinkedListNode copy = null;
		
		while(original!=null){
			
			
			LinkedListNode temp = new LinkedListNode(original.data);
			if(copy == null){
				copy = temp;
			}
			temp.next = original.next;
			original.next = temp;
			original = temp.next;
			
		}
		//print(header);
		//Now copy the random pointers.
		
		original = header;
		LinkedListNode temp = copy;
		while(original !=null){
			
			temp.random = original.random.next;
			original = original.next.next;
			if(temp.next !=null){
			temp = temp.next.next;
			}
			else {
				temp = temp.next;
			}
		}
		
		//Now reverse the next pointers of the original and copy list.
		original = header;
		temp = copy;
		
		while(original!=null){
			
			original.next = original.next.next;
			if(temp.next !=null){
				temp.next = temp.next.next;
			}
			else {
				temp.next = null;
			}
			original = original.next;
			temp = temp.next;
		}
		
		original = header;
		
		//printing the nodes.
		print(original);
		print(copy);
	}
	
	public static void print(LinkedListNode header){
		
		System.out.println();
		System.out.println("The linkedlist is ");
		while(header !=null){
			
			System.out.println(header.data + " random pointing to " +  header.random.data);
			header = header.next;
		}
	}
}
