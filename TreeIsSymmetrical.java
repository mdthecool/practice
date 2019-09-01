/*Given a tree, find if the tree is symmetrical to itself.
 *       1
      /   \
    2       2
  /   \   /   \
 3     4 4     3
 * 
 * 
 * Solution - pass roo.left and root.right as two sub trees to the isMirror method and check whether the sub trees
 * are mirror image of each other or not.
 * 
 * 
 */
public class TreeIsSymmetrical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(1);
		n.left = new Node(2);
		n.right = new Node(2);
		n.left.left = new Node(3);
		n.left.right =  new Node(4);
		n.right.right = new Node(3);
		n.right.left = new Node (4);
		
	   
		
		
		boolean b = isSymmetrical(n);
		if(b==true){
			
			System.out.println("Tree is symmetrical");
		}
		
		else {
			
			System.out.println("Tree is not symmetrical");
		}

	}

	
	public static boolean isSymmetrical(Node n){
		
		//base condition
		if(n==null){
			
			return true;
		}
		
		else {
			
			boolean b = isMirror(n.left,n.right);
			return b;
		}
	}
	
	
	public static boolean isMirror(Node n1, Node n2){
		
		//base condition
		
		if(n1 == null && n2 == null){
			
			return true;
		}
		
		if((n1==null && n2 !=null) || (n1!=null && n2 == null)){
			
			return false;
		}
		
		else return ((n1.data==n2.data) && isMirror(n1.left,n2.right) && isMirror(n1.right,n2.left));
	}
}
