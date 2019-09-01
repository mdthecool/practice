/*Given a tree, find the max path sum between any node to any node
 * 
 * 
 */
public class TreeMaxPathSumAnyNode {

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
		
		int sum = pathSum(n);
		System.out.println("Max sum from root to leaf is " + sum);
	}
	
	public static int pathSum(Node n){
		
		if(n==null){
			return 0;
		}
		
		int left = pathSum(n.left);
		int right = pathSum(n.right);
		int max = Math.max(left,right);
		System.out.println("n.data is " + n.data);
		System.out.println("Max is " + max);
		System.out.println("n.data + max is " + (n.data+max));
		System.out.println("Returning " + Math.max(n.data,n.data+max));
		return(Math.max(n.data,n.data+max));
	}

}
