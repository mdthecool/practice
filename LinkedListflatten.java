/*Given a linkedlist with next and down pointers in sorted order. Flatten this linkedlist.
 * 
 * 
 * 
 */
public class LinkedListflatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListNode l = new LinkedListNode(5);
		l.next = new LinkedListNode(10);
		l.next.next = new LinkedListNode(19);
		l.next.next.next = new LinkedListNode(28);
		
		l.down = new LinkedListNode(7);
		l.down.down = new LinkedListNode(8);
		l.down.down.down = new LinkedListNode(30);
		
		l.next.down = new LinkedListNode(20);
		
		l.next.next.down = new LinkedListNode(22);
		l.next.next.down.down = new LinkedListNode(50);
		
		l.next.next.next.down = new LinkedListNode(35);
		l.next.next.next.down.down = new LinkedListNode(40);
		l.next.next.next.down.down.down = new LinkedListNode(45);
		
		l = flatten(l);
		print(l);
		
		
		
		
	}

	
	public static LinkedListNode flatten(LinkedListNode header){
		
		LinkedListNode temp = header;
		
		//base condition 
		if(temp == null){
			return null;
		}
		if(temp.next == null){
			//nothing to merge 
			return temp;
		}
		
		while(temp !=null){
			
			header = merge(header,temp.next);
			LinkedListNode next = temp.next;
			temp.next = null;
			//print(header);
			temp = next;
		}
		
		return header;
	}
	
	public static LinkedListNode merge(LinkedListNode header1,LinkedListNode header2){
		
		
		LinkedListNode curr = header1;
		LinkedListNode next = header1.down;
		
		while(next !=null && header2 !=null){
			if(header2.data > curr.data && header2.data < next.data){
			LinkedListNode temp = header2.down;
			header2.down = next;
			curr.down = header2;
			header2 = temp;
			curr = curr.down;
			}
			
			else {
				
				curr = curr.down;
				next = next.down;
			}
		}
		
		if(header2 !=null){
			
			//while(header2 !=null){
				
				curr.down = header2;
				//curr = curr.down;
				//header2 = header2.down;
			//}
		}
		//print(header1);
		return header1;
	}
	
	public static void print(LinkedListNode header){
		
		System.out.println("The flattened linkedlist is ");
		while(header!=null){
			System.out.print(header.data + " ");
			header = header.down;
		}
	}
}
