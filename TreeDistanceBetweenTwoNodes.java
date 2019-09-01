/*Given two nodes of a tree, find the distance between them.
 * Solution - Find the LCA of the two nodes. Then calculate the distance of the two nodes from LCA and add them.
 * 
 * or 
 * 
 * Find the distance of the two nodes from the root. Distance = (d1+d2-2*LCA)
 * 
 * 
 * 
 * 
 * 
 */
public class TreeDistanceBetweenTwoNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(10);
		n.left = new Node(5);
		n.left.left = new Node(45);
		n.left.left.right = new Node(70);
		n.right = new Node(89);
		n.right.left = new Node(84);
		n.right.left.right = new Node(65);
		distance(n,n.left.left.right,n.right.left);

	}
	
	
	public static void distance(Node root, Node n2, Node n3){
		
		
		//base condition 
		if(n2==null || n3 == null){
			
			System.out.println("0");
		}
		
		Node lca = LCA(root,n2.data,n3.data);
		System.out.println("Least common ancestor is " + lca.data);
		int d1 = findLevel(root,n2,0);
		System.out.println("Distance d1 is " + d1);
		int d2 = findLevel(root,n3,0);
		System.out.println("Distance d2 is " + d2);
		int d3 = findLevel(root,lca,0);
		System.out.println("Distance d3 is " + d3);
		
		System.out.println("Distance is " + (d1+d2-(2*d3)+1));
		
	}
	
	public static Node LCA(Node n,int k1,int k2){
		
		if(n==null){
			
	          return null;
			}
			
			if(n.data ==k1){
				
				return n;
			}
			
			if(n.data == k2){
				
				return n;
			}
			
			Node left = LCA(n.left,k1,k2);
			Node right = LCA(n.right,k1,k2);
			
			if(left != null && right != null){
				
				System.out.println("Lowest common ancestor is " + n.data);
				return n;
			}
			
			else if(left != null && right == null){
				
				return left;
			}
			
			else if(left == null && right != null){
				
				return right;
			}
	        else {
	        	
	        	return null;
	        }
			
		}
		
	
	
	
	public static int findLevel(Node root, Node n,int level){
		
		//base condition
		if(root == null || n == null){
			return -1;
		}
		
		if(root.data == n.data){
			
			return level;
			
		}
		
		int left = findLevel(root.left,n,level+1);
		int right = findLevel(root.right,n,level+1);
		return Math.max(left,right);
	}

}
