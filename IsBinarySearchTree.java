
public class IsBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isBinarySearchTree(Node n,int min,int max){
		
		if(n==null){
			
			return true;
		}
		
		else if(n.data <min || n.data > max){
			
			return false;
		}
		
		else {
			
			return (isBinarySearchTree(n.left,min,n.data) && isBinarySearchTree(n.left,n.data,max));
		}
	}

}
