/*Given a tree, find the max sum from any leaf to any leaf.
 * Solution - Do a post order traversal. Similar to diameter concept.
 * 
 * 
 * 
 */
public class TreeMaxSumLeafToLeaf {

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
		
		int sum = maxSumPath(n);
		System.out.println("Max sum from root to leaf is " + sum);
	}
	
	
	public static int maxSumPath(Node n){
		
		if(n==null){
			return 0;
		}
		
		
		int left_sum = sum(n.left); //equivalent to height method in diameter
		int right_sum = sum(n.right); //equivalent to height method in diameter
		int left_max_sum = maxSumPath(n.left);
		int right_max_sum = maxSumPath(n.right);
		System.out.println("Left sum is " + left_sum);
		System.out.println("Right sum is " + right_sum);
		System.out.println("Left max sum is " + left_max_sum);
		System.out.println("Right max sum is " + right_sum);
		int max1 =  Math.max(left_max_sum,right_max_sum);
		System.out.println("Returning " +  Math.max(n.data+left_sum+right_sum,max1));
		return Math.max(n.data+left_sum+right_sum,max1);
	}

	
	public static int sum(Node n){
		
		
		if(n==null){
			
			return 0;
		}
		
		int left = sum(n.left);
		int right = sum(n.right);
		//System.out.println("Returning " + (Math.max(left,right) + n.data));
		return (Math.max(left,right) + n.data);
		
	}
}
