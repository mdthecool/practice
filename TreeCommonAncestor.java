
public class TreeCommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(5);
		n.left = new Node(2);
		n.right = new Node(7);
		n.left.left = new Node(1);
		n.left.right = new Node(8);
		n.right.left = new Node(6);
		n.right.right = new Node(15);
		commonAncestor(n,1,15);

	}
	
	
	public static int commonAncestor(Node n,int k1,int k2){
		
		if(n==null){
			
          return -1;
		}
		
		if(n.data ==k1){
			
			return k1;
		}
		
		if(n.data == k2){
			
			return k2;
		}
		
		int left = commonAncestor(n.left,k1,k2);
		int right = commonAncestor(n.right,k1,k2);
		
		if(left != -1 && right != -1){
			
			System.out.println("Lowest common ancestor is " + n.data);
			return n.data;
		}
		
		else if(left != -1 && right == -1){
			
			return left;
		}
		
		else if(left == -1 && right != -1){
			
			return right;
		}
        else {
        	
        	return -1;
        }
		
	}

}
