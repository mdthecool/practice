import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeBottomView {

	static TreeMap<Integer,Integer> m = new TreeMap<Integer,Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node(20); 
        root.left = new Node(8); 
        root.right = new Node(22); 
        root.left.left = new Node(5); 
        root.left.right = new Node(3); 
        root.right.left = new Node(4); 
        root.right.right = new Node(25); 
        root.left.right.left = new Node(10); 
        root.left.right.right = new Node(14); 
        
		bottomView(root,0);
		
		System.out.println("The bottom view of the tree is ");
		 Iterator itr = m.entrySet().iterator();
		
		while(itr.hasNext()){
			
			 Map.Entry<Integer,Integer> entry = (Entry<Integer,Integer>) itr.next();
			 System.out.print(entry.getValue() + " ");
		}
	}
	
	
	public static void bottomView(Node n, int x){
		
		if(n==null){
			
			return;
		}
		
		   
			m.put(x,n.data);
		
		
			bottomView(n.right,x+1);
	        bottomView(n.left,x-1);
			
			
			
			
		
	}
	
	
	

}
