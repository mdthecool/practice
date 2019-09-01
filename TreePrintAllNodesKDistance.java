/*Given the root node and a target node, print all the nodes that are k distance from the target node.
 * 
 * Solution - Divide the problem into 2 parts. Print all the nodes k distance down from the target node.
 * 
 * Go up and check the nodes at the other sub tree which are at distance k-dl-2 distance apart
 * 
 * Check these links for reference.
 * 
 * https://algorithms.tutorialhorizon.com/print-all-the-nodes-which-are-x-distance-from-the-given-node/
 * https://www.geeksforgeeks.org/print-nodes-distance-k-given-node-binary-tree/
 * 
 * 
 * 
 * 
 */
public class TreePrintAllNodesKDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(20);
		n.left = new Node(8);
		n.left.left = new Node(4);
		n.left.right = new Node(12);
		n.left.right.left = new Node(10);
		n.left.right.right = new Node(14);
		n.right = new Node(22);
		printKDistance(n,n.left,2);

	}

	
	public static void printKDistanceDown(Node n,int k){
		
		//base condition
		if(n==null ){
			
			return;
		}
		if(k==0){
			
			System.out.print(n.data + " ");
			return;
		}
		
		printKDistanceDown(n.left,k-1);
		printKDistanceDown(n.right,k-1);
		
	}
	
	
	public static int printKDistance(Node n,Node target,int k){
		
		//base condition 
		
		if(n==null){
			
			return -1;
		}
		
		if(n==target){
			
			printKDistanceDown(n,k);
			return 0;
		}
		
		int dl = printKDistance(n.left,target,k);
		
		if(dl!=-1){
			
			//node found
			
			if(dl+1==k){
				
				System.out.print(n.data + " ");
			}
			
			else {
				
				printKDistanceDown(n.right,k-dl-2);
			}
			
			return 1+dl;
		}
		
        int dr = printKDistance(n.right,target,k);
		
		if(dr!=-1){
			
			//node found
			
			if(dr+1==k){
				
				System.out.print(n.data + " ");
			}
			
			else {
				
				printKDistanceDown(n.left,k-dr-2);
			}
			
			return 1+dr;
		}    
		
		return -1;
	}
}
