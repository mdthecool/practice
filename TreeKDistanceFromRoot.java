/*Given a tree, find the nodes which are k distance from the root.
 * 
 * 
 *Solution - To find the nodes which are k distance from root, call the left and right sub child with k-1.
 *If k ==0 that is child. if node == null then return.
 * 
 * 
 */
public class TreeKDistanceFromRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(5);
		n.left = new Node(2);
		n.right = new Node(7);
		n.left.left = new Node(1);
		n.left.right = new Node(8);
		n.right.left = new Node(6);
		n.right.right = new Node(15);
		kDistance(n,2);

	}
	
	
	
	public static void kDistance(Node n,int k){
		
		//writing the base condition.
		
		if(n==null){
			
			return ;
		}
		
		if(k==0){
		   System.out.print(n.data + " ");
		}
		
		
			
			kDistance(n.left,k-1);
			kDistance(n.right,k-1);
	
		
		
	}

}
