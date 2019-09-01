/*Given a BST , find the triplet a+b=c.
 * Solution - Convert the tree to DLL. Since it is a BST, the DLL formed will be in ascending order.
 * Now traverse the dll from front and behind and solve.
 * 
 * 
 */
public class TreeTripletInBST {

	static Node header = null;
	static Node prev = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(10);
		n.left = new Node(5);
		n.left.right = new Node(7);
		n.left.right.right = new Node(8);
		n.right = new Node(15);
		n.right.left = new Node(13);
		n.right.left.right = new Node(14);
		triplet(n,27);
		findPair(header,27);
	}
	
	public static void triplet(Node n,int k){
		
		//base condition 
		if(n==null){
			return;
		}
		
		triplet(n.left,k);
		
		//Now form the DLL
		if(prev == null){
			
			header = n;
			prev = n;
		}
		
		else {
			 prev.right = n;
			 n.left = prev;
			 prev = prev.right;
		}
		
		triplet(n.right,k);
	}
	
	
	public static void findPair(Node header,int k){
		//Now traverse the dll from front and back.
		Node last;
		Node first = header;
		
		while(first.right !=null){
			
			first=first.right;
		}
		last = first;
		
		//Now traverse from back and front. If sum greater than k , move last else move first.
		first = header;
		while(first !=last.right){
			
			if((first.data + last.data) ==k){
				
				System.out.println("The pair is " + first.data + " and " + last.data);
				break;
			}
			
			else if (first.data + last.data > k){
				
				last = last.left;
			}
			
			else {
				
				first = first.right;
			}
		}
	}

	
	
}
