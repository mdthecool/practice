/*Given a linkedlist having 0,1 and 2. Sort it
 * Solution - Count the 0s 1s and 2s and fill the linkedlist again.
 * 
 */
public class LinkedList012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode n1 = new LinkedListNode(1);
		LinkedListNode n2 = new LinkedListNode(1);
		LinkedListNode n3 = new LinkedListNode(2);
		LinkedListNode n4 = new LinkedListNode(2);
		LinkedListNode n5 = new LinkedListNode(0);
		LinkedListNode n6 = new LinkedListNode(1);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next = n6;
		sort(n1);

	}
	
	
	public static void sort(LinkedListNode header){
		
		LinkedListNode temp = header;
		int count_0 =0;
		int count_1=0;
		int count_2=0;
		
		while(temp!=null){
		
			if(temp.data == 0){
				count_0 ++;
				
			}
			
			else if(temp.data == 1){
				count_1++;
			}
			
			else{
				
				count_2++;
			}
			
			temp = temp.next;
		}
		
		temp =header;
		while(count_0!=0){
			
			temp.data = 0;
			temp = temp.next;
			count_0--;
		}
		
		
        while(count_1!=0){
			
			temp.data = 1;
			temp = temp.next;
			count_1--;
		}
        
        
        while(count_2!=0){
			
			temp.data = 2;
			temp = temp.next;
			count_2--;
		}
        
        temp = header;
        System.out.println("The linkedlist is");
        while(temp!=null){
        	
        	System.out.print(temp.data + " ");
        	temp = temp.next;
        }
		
	}

}
