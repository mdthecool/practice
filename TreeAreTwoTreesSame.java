/*Given the root of two trees , check whether the two trees are same or not.
 * 
 * 
 * 
 */
public class TreeAreTwoTreesSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(10);
		n.left = new Node(-5);
		n.right = new Node(16);
		n.left.left = new Node(-8);
		n.left.right =  new Node(7);
		n.left.right.left =  new Node(6);
		n.right.right = new Node (18);
		
		Node n1 = new Node(10);
		n1.left = new Node(-5);
		n1.right = new Node(16);
		n1.left.left = new Node(-9);
		n1.left.right =  new Node(7);
		n1.left.right.left =  new Node(6);
		n1.right.right = new Node (18);
		
		boolean b = isSame(n,n1);
		System.out.println(b);

	}

	
	
	public static boolean isSame(Node n1,Node n2){
		
		if(n1 == null && n2 == null){
			
			return true;
		}
		
		if((n1 == null && n2 !=null) || (n1 !=null && n2 ==null)) {
			
			return false;
		}
		else {
			
			return (n1.data == n2.data && isSame(n1.left,n2.left) && isSame(n1.right,n2.right));
		}
	}
}
