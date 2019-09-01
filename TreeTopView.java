import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeTopView {

	static TreeMap<Integer,Integer> m = new TreeMap<Integer,Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(5);
		n.left = new Node(2);
		n.right = new Node(7);
		n.left.left = new Node(1);
		n.left.right = new Node(8);
		n.left.right.right = new Node(10);
		n.right.left = new Node(6);
		n.right.right = new Node(15);
		topView(n,0);
		
		System.out.println("The top view of the tree is ");
		 Iterator itr = m.entrySet().iterator();
		
		while(itr.hasNext()){
			
			 Map.Entry<Integer,Integer> entry = (Entry<Integer,Integer>) itr.next();
			 System.out.print(entry.getValue() + " ");
		}
	}
	
	
	public static void topView(Node n, int x){
		
		if(n==null){
			
			return;
		}
		if(!m.containsKey(x)){
		   
			m.put(x,n.data);
		}
		
		
	        topView(n.left,x-1);
			topView(n.right,x+1);
			
			
			
		
	}
	
	
	

}
