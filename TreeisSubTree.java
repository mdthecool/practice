/*Given two trees with nodes n1 and n2, find whether the tree with root n2 is a subtree of another.
 * 
 * 
 * 
 */
public class TreeisSubTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n1 = new Node(10);
		n1.left = new Node(4);
		n1.right = new Node(6);
		n1.left.right = new Node(30);
		
		Node n2 = new Node(26);
		n2.left = new Node(10);
		n2.right = new Node(3);
		n2.left.left = new Node(4);
		n2.left.right = new Node(6);
		n2.left.left.right = new Node(30);
		n2.right.right = new Node(3);
		
		boolean b = isSubTree(n2,n1);
		System.out.println(b);
		
		
		
		

	}

	
	public static boolean isSubTree(Node n1,Node n2){
		
		if(n2==null){
			return  true;
			//as null is a subtree of every tree
		}
		
		if(n1==null){
			
			return false;
		}
		
		boolean b = isEqual(n1,n2);
		if(b==true){
			return true;
		}
		boolean left = isSubTree(n1.left,n2);
		boolean right = isSubTree(n1.right,n2);
		if(left || right){
			
			return true;
		}
		
		return false;
	}
	
	public static boolean isEqual(Node n1, Node n2){
		
		if(n1==null && n2 == null){
			return true;
		}
		
		if((n1==null && n2 !=null) || n2==null && n1!=null){
			return false;
		}
		
		boolean b1 = isEqual(n1.left,n2.left);
		boolean b2 = isEqual(n1.right,n2.right);
		return ((n1.data == n2.data) && b1 && b2);
		
		
	}
}
