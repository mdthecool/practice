/*Given a Binary Tree, find the maximum sum in a binary tree by adding the parent with its children. Exactly three Node needs to be added. 
 * If the tree does not have a node with both of its children as not NULL, return 0.
 * 
 * Solution - 
 * 
 * 
 */
public class TreeMaxParentChildSum {

	static int max = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(15);
		n.left = new Node(16);
		n.right = new Node(17);
		n.left.left = new Node(8);
		n.left.right =  new Node(67);
		n.left.left.left = new Node(55);
		n.left.right.right = new Node(44);
		n.right.right = new Node(41);
	    n.right.left = new Node(7);
	    n.right.left.right = new Node(11);
	    maxParentChildSum(n);
	    System.out.println("The max parent child sum is " + max);
	}

	
	
	public static int maxParentChildSum(Node n){
		
		if(n==null){
			
			return 0;
		}
		
		int left = maxParentChildSum(n.left);
		int right = maxParentChildSum(n.right);
		
		if(left ==0 || right ==0){
			
			if(max < n.data){
				
				max = Math.max(max,n.data);
			}
		}
		
		else {
			
			max = Math.max(max,left+right+n.data);
		}
		
		return n.data;
	}
}
