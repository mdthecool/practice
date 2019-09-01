/*Given a tree, find the height of the tree.
 * Solution - The height of the tree is the 1 + Max (left tree, right tree)
 * 
 * 
 * 
 * 
 */
public class TreeHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(10);
		n.left = new Node(-5);
		n.right = new Node(16);
		n.left.left = new Node(-8);
		n.left.right =  new Node(7);
		n.left.right.left =  new Node(6);
		n.right.right = new Node (18);
		
		int x = height(n);
		System.out.println("The height of the tree is " + x);

	}

	
	public static int height(Node n){
		
		//base condition 
		
		if(n == null){
			
			return 0;
		}
		
		else {
			
			
			int left_height = height(n.left);
			int right_height = height(n.right);
			return 1 + Math.max(left_height,right_height);
		}
		
	}
	
	
}
