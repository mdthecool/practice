/*Given a linkedlist check whether it is a palindrome or not.
 * Solution - Find the length of the linkedlist and reverse the 2nd half.
 * If both the halves are same, it is a palindrome else not. Space o(1).
 * 
 * Space o(n) solution - Completely reverse the first linkedlist and check whether both the linkedlists are same.
 */
public class LinkedListIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode n1 = new LinkedListNode(1);
		LinkedListNode n2 = new LinkedListNode(2);
		LinkedListNode n3 = new LinkedListNode(3);
		LinkedListNode n4 = new LinkedListNode(2);
		LinkedListNode n5 = new LinkedListNode(0);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		isPalindrome(n1);

	}

	
	public static void isPalindrome(LinkedListNode header){
	
	String str = "";
	LinkedListNode temp = header;
	
	while(temp!=null){
		
		str = str + temp.data;
		temp = temp.next;
	}
	
	System.out.println(str);
	char[] ch = str.toCharArray();
	for(int i=0;i<=(ch.length)/2;i++){
		
		if(ch[i] !=ch[ch.length-i-1]){
			
			System.out.println("Not palindrome");
			return;
		}
	}
	
	System.out.println("Is Palindrome");
	}
}
