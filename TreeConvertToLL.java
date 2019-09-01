import java.util.LinkedList;

/*Given a tree, convert it to LL in inorder manner in place
 * 
 * 
 * 
 */
public class TreeConvertToLL {

	static Node prev;
	static Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(10);
		n.left = new Node(-5);
		n.right = new Node(16);
		n.left.left = new Node(-8);
		n.left.right =  new Node(7);
		n.left.right.left =  new Node(6);
		n.right.right = new Node (18);
		convert(n);
		print(head);
		
	}
	
	
	public static void convert(Node n){
		
		
		if(n==null){
			
			return ;
		}
		
		convert(n.left);
		
		if(prev == null){
			//means even head is not set.
			head = n;
			n.left = null;
			
		}
		
		else {
			
			prev.right = n;
			n.left = prev;
		}
		
		prev = n;
		convert(n.right);
		
	}
	
	
	public static void print(Node head){
		
		while(head!=null){
			
			System.out.print(head.data + " ");
			head = head.right;
		}
	}
	}
	
	


