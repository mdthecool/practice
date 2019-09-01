/*Given a linkedlist, 
 * 
 * 
 * 
 */
public class LinkedListZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListNode l = new LinkedListNode(1);
		l.next = new LinkedListNode(2);
		l.next.next = new LinkedListNode(3);
		l.next.next.next = new LinkedListNode(4);
		l.next.next.next.next = new LinkedListNode(5);
		System.out.println("The original list is ");
		print(l);
		l = zigzag(l);
		System.out.println("The zig zag list is ");
		print(l);
		
	}

	
	public static LinkedListNode zigzag(LinkedListNode header){
		
		LinkedListNode curr = header;
		LinkedListNode next = null;
		LinkedListNode prev = null;
		boolean flag = false;
		
		while(curr.next !=null){
			
			if(flag==false){
				
				if(curr.data > curr.next.data){
					
					next = curr.next;
					curr.next = curr.next.next;
					next.next = curr;
					if(prev !=null){
						prev.next = next;
					}
					else {
						//change the header;
						header = next;
						}
					
					prev = next;
				}
				else {
					prev = curr;
					curr = curr.next;
				}
				
				flag = true;
			}	
				else if (flag == true){
					
					if(curr.data < curr.next.data){
						
						next = curr.next;
						curr.next = curr.next.next;
						next.next = curr;
						if(prev !=null){
							prev.next = next;
						}
						
						prev = next;
					}
					
					else {
						
						prev = curr;
						curr = curr.next;
					}
					flag = false;
				}
			
			}
			
		return header;
	}
	
	public static void print(LinkedListNode header){
		
		while(header!=null){
			
			System.out.print(header.data + " ");
			header = header.next;
		}
		System.out.println();
	}
}
