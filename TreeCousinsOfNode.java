import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*Given root and and a target node. Print all the cousins of the node.
 * Input : root of below tree 
             1
           /   \
          2     3
        /   \  /  \
       4    5  6   7
       and pointer to a node say 5.

Output : 6, 7
*Solution - Store the level order traversal in a queue. Then print the left and right child of all the nodes 
*belonging to the same level. 
* 
* 
* 
*/
public class TreeCousinsOfNode {

	static Queue<Node> q = new LinkedList<Node>();
	
	static ArrayList<Node> al = new ArrayList<Node>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(1);
		n.left = new Node(2);
		n.right = new Node(3);
		n.left.left = new Node(4);
		n.left.right = new Node(5);
		n.right.left = new Node(6);
		n.right.right = new Node(7);
		printCousins(n,n.left.right);
	}
	
	
	
	public static void printCousins(Node n, Node target){
		
		if(n==null){
			
			System.out.println("Tree is empty");
			return;
		}
		
		boolean flag = false;
		q.add(n);
		al.add(n);
		q.add(null);
		
		
		while(!q.isEmpty()){
			
			Node temp = q.remove();
			if(temp ==null){
				if(!q.isEmpty()){
				
				q.add(null);
				}
				if(flag == true){
					
					print(al,target);
					return;
				}
				
				else {
					
					al.removeAll(al);
				}
			}
			
			else {
			if(temp.left !=null){
				if(temp.left == target || temp.right == target ){
					flag = true;
				}
				else {
				q.add(temp.left);
				al.add(temp.left);
				}
			}
			if(temp.right !=null){
				if(temp.left == target || temp.right == target){
					flag = true;
					
				}
				else{
				
				q.add(temp.right);
				al.add(temp.right);
				}
			}
			
			}	
			
		}
		
	}
	
	
	public static void print(ArrayList<Node> al,Node target){
		
		System.out.println("The cousin nodes are ");
		for(int i=0;i<al.size();i++){
			
			System.out.print(al.get(i).data + " ");
			
		}
	}

}
