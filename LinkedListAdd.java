/*Problem - Given two linkedlists, add them.
 * 
 * 
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Collections;

/*Given two linked lists. Add them
 * Solution - Reverse the linked lists. Then add the first node. 
 * Check if sum greater than 10. If yes do num%10 and make the carry as the remainder.
 * 
 * 
 * 
 */
public class LinkedListAdd {

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
		
		
		
		LinkedListNode n6 = new LinkedListNode(6);
		LinkedListNode n7 = new LinkedListNode(7);
		LinkedListNode n8 = new LinkedListNode(8);
		LinkedListNode n9 = new LinkedListNode(9);
		
		n6.next=n7;
		n7.next=n8;
		n8.next=n9;
		
		
		
		add(n1,n6);
		
		
	}

	
	public static void add(LinkedListNode head1, LinkedListNode head2){
		
		LinkedListNode temp1 = reverse(head1);
		LinkedListNode temp2 = reverse(head2);
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		//Now add the individual nodes.
		int sum =0; int carry =0;
		while(temp1!=null && temp2 !=null){
			
			//System.out.println("Temp1 data is " + temp1.data);
			//System.out.println("temp2 data is " + temp2.data);
			//System.out.println(carry);
			sum = temp1.data + temp2.data + carry;
			if(sum>=10){
				carry = 1;
				sum = sum%10;
			}
			else {
				carry =0;
			}
			al.add(sum);
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		
		if(temp1!=null){
			
			while(temp1 !=null){
			
				sum = carry + temp1.data;
			
				if(sum>=10){
					 carry = 1;
					 sum = sum%10;
				}
				else {
					carry =0;
				}
				
				al.add(sum);
				temp1 = temp1.next;
			}
		}
		
            if(temp2!=null){
			
			while(temp2 !=null){
			
				sum = carry + temp2.data;
			
				if(sum>=10){
					 carry = 1;
					 sum = sum%10;
				}
				else {
					carry =0;
				}
				
				al.add(sum);
				temp2 = temp2.next;
			}
		}
		
		
		//reversing the list 
		
		Collections.reverse(al);
		
		System.out.println("The added list is " + al);
	}
	
	
	public static LinkedListNode reverse(LinkedListNode head){
		
		LinkedListNode curr = head;
		LinkedListNode prev = null;
		LinkedListNode next;
		
		if(curr.next== null){
			
			return curr;
		}
		
		else {
			
			
			
			while(curr!=null){
				
				next = curr.next;
				curr.next=prev;
				prev = curr;
				curr = next;
				
			}
		}
		
		return prev;
	}
	
	
	public static void print(LinkedListNode head){
		
		System.out.println("The linkedlist is ");
		while(head!=null){
			
			System.out.print(head.data);
			head = head.next;
			
			
		}
		
		System.out.println("");
	}
}
