import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeVerticalOrder {

	static TreeMap<Integer,ArrayList<Integer>> m = new TreeMap<Integer,ArrayList<Integer>>();
	static ArrayList<Integer> al;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n = new Node(5);
		n.left = new Node(2);
		n.right = new Node(7);
		n.left.left = new Node(1);
		n.left.right = new Node(8);
		n.right.left = new Node(6);
		n.right.right = new Node(15);
		verticalOrder(n,0);
		
		//Now traversing the treemap and printing the values.
		
		System.out.println("The vertical view of the tree is ");
		 Iterator itr = m.entrySet().iterator();
		
		while(itr.hasNext()){
			
			 Map.Entry<Integer,Integer> entry = (Entry<Integer,Integer>) itr.next();
			 System.out.print(entry.getValue() + " ");
		}

	}

	
	
	public static void verticalOrder(Node n,int x){
		
		if(n==null){
			
			return;
		}
		
		if(m.containsKey(x)){
			
			al = m.get(x);
			al.add(n.data);
			m.put(x,al);
		}
		else {
		al = new ArrayList<Integer>();
		al.add(n.data);
		m.put(x,al);
		
		}
		
		verticalOrder(n.left,x-1);
		verticalOrder(n.right,x+1);
		
	}
}
