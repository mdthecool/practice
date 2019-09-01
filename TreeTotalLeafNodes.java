/*Given a tree, find the total no of leaf nodes in the tree.
 * 
 * 
 * 
 * 
 */
public class TreeTotalLeafNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(10);
		n.left = new Node(-5);
		n.right = new Node(16);
		n.left.left = new Node(-8);
		n.left.right =  new Node(7);
		n.left.right.left =  new Node(6);
		n.right.right = new Node (18);
		
		int x = totalLeafNodes(n);
		System.out.println(x);

	}
	
	
	public static int totalLeafNodes(Node n){
		
		//writing base conditions.
		
		if(n == null){
			
			return 0;
		}
		
		if(n.left == null && n.right == null){
			
			return 1;
		}
		int left_leaf_nodes = totalLeafNodes(n.left);
		int right_leaf_nodes = totalLeafNodes(n.right);
		return left_leaf_nodes + right_leaf_nodes;
	}

}
