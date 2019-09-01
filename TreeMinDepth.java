/*Given a tree, find the min depth of the tree.
 * 
 * Solution - For any tree, min depth of a node is the min(left_depth,right_depth) +1
 * 
 * 
 * 
 */
public class TreeMinDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(1);
		n.left = new Node(2);
		n.right = new Node(3);
		n.right.left = new Node(4);
		n.right.right = new Node(5);
		n.right.left.left = new Node(6);
		int depth = minDepth(n);
		System.out.println("The min depth is " + depth);
		
	}
	
	
	public static int minDepth(Node n){
		
	//base condition.
		if(n==null){
			
			return 0;
		}
		
		int left_depth = minDepth(n.left);
		int right_depth = minDepth(n.right);
		return 1 + Math.min(left_depth,right_depth);
	}

}
