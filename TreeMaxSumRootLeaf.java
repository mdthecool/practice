/*For a given tree, find the max path from root to leaf
 * 
 * 
 */
public class TreeMaxSumRootLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node n = new Node(10);
		n.left = new Node(2);
		n.left.left = new Node(20);
		n.left.right = new Node(1);
		
		n.right = new Node(10);
		n.right.right = new Node(-25);
		n.right.right.left = new Node(3);
		n.right.right.right = new Node(4);
		
		int sum = maxSumRootToLeaf(n);
		System.out.println("Max sum from root to leaf is " + sum);
		
	}

	
	public static int maxSumRootToLeaf(Node n){
		
		if(n==null){
			
			return 0;
		}
		
		//Do a post order traversal
		int left = maxSumRootToLeaf(n.left);
		int right=  maxSumRootToLeaf(n.right);
		int max = Math.max(left,right);
		return (max + n.data);
		
	}
}
