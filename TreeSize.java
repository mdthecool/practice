/*Given a tree, find the total no of nodes in the tree (size of the tree)
 * 
 * 
 * 
 * 
 */
public class TreeSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(10);
		n.left = new Node(-5);
		n.right = new Node(16);
		n.left.left = new Node(-8);
		n.left.right =  new Node(7);
		n.left.right.left =  new Node(6);
		n.right.right = new Node (18);
		
		int x = size(n);
		System.out.println("Total size of tree is " + x);

	}

	//print total no of nodes in binary tree
	
	public static int size(Node n){
		
		//base condition 
		if(n == null){
			
			return 0;
		}
		
		int left_size = size(n.left);
		int right_size = size(n.right);
		return left_size + right_size +1;
	}
	
	
}
