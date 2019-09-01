/*Given a binary tree, write a function that returns true if the tree satisfies below property.
For every node, data value must be equal to sum of data values in left and right children.
Consider data value as 0 for NULL children. 
 * 
 * 
 * 
 */
public class TreeCheckParentChildSumProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(10);
		n.left = new Node(8);
		n.right = new Node(2);
		n.left.left = new Node(3);
		n.left.right =  new Node(5);
		n.right.left = new Node(2);
		
		boolean b = isChildSum(n);
		System.out.println(b);
	}
	
	public static boolean isChildSum(Node n){
		
		if(n==null){
			
			return true;
		}
		
		boolean b1 = isChildSum(n.left);
		boolean b2 = isChildSum(n.right);
		
		if(b1 == true && b2 == true){
			
			if(n.left !=null && n.right !=null){
				
				if(n.data == n.left.data+n.right.data){
					return true;
				}
				else {
					System.out.println(n.data + " not equal to sum of children " + n.left.data + " and " + n.right.data);
					return false;
				}
			}
			
			if(n.left == null && n.right !=null){
				
				if(n.data == n.right.data){
					return true;
				}
				else {
					System.out.println(n.data + " not equal to left child " + n.left.data);
					return false;
				}
				
			}
			
            if(n.right == null && n.left !=null){
				
				if(n.data == n.left.data){
					return true;
				}
				else {
					System.out.println(n.data + " not equal to right child " + n.right.data);
					return false;
				}
				
			}
            
            if(n.left == null && n.right == null){
            	return true;
            }
		
		
	}
		
		return false;
		
		

	}
}
