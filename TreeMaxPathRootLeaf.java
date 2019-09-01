/*Given a tree, find the max sum from root to the leaf of the tree.
 * 
 * 
 * 
 */
public class TreeMaxPathRootLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(10);
		n.left = new Node(-5);
		n.right = new Node(16);
		n.left.left = new Node(-8);
		n.left.right =  new Node(7);
		n.left.right.left =  new Node(6);
		n.right.right = new Node (18);
		
		int x = maxPathSum(n);
		System.out.println(x);

	}
	
	
	public static int maxPathSum(Node n){
		
		//Writing base conditions
		if(n == null){
			
			return 0;
		}
		
		int left_sum = maxPathSum(n.left);
		int right_sum = maxPathSum(n.right);
		return n.data + Math.max(left_sum,right_sum);
		
	}

}
