import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* 
 * 
 * 
 * 
 * 
 */
public class ComparatorExample {

	int runs;
	int age;
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ComparatorExample> al = new ArrayList<ComparatorExample>();
		al.add(new ComparatorExample("Ganguly",11300,46));
		al.add(new ComparatorExample("Sehwag",8500,42));
		al.add(new ComparatorExample("Kohli",10500,30));
		al.add(new ComparatorExample("Dhoni",10200,37));
		System.out.println(" ");
		print(al);
		Collections.sort(al, new sortByRuns());
		System.out.println(" ");
		print(al);
		
	}
	
	
	ComparatorExample(String name, int runs, int age){
		
		this.name = name;
		this.runs = runs;
		this.age = age;
	}


	public ComparatorExample() {
		// TODO Auto-generated constructor stub
	}

    /*
	@Override
	public int compare(ComparatorExample c1,ComparatorExample c2) {
		// TODO Auto-generated method stub
		
		return c1.age-c2.age;
	}
	*/
	public static void print(ArrayList<ComparatorExample> al){
		
		Iterator<ComparatorExample> itr = al.iterator();
		while(itr.hasNext()){
			
			ComparatorExample c = itr.next();
			System.out.println(c.name + " " + c.runs + " " + c.age);
		}
	}

}



class sortByAge implements Comparator<ComparatorExample>{

	@Override
	public int compare(ComparatorExample o1, ComparatorExample o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}
	
	
}


class sortByRuns implements Comparator<ComparatorExample>{

	@Override
	public int compare(ComparatorExample o1, ComparatorExample o2) {
		// TODO Auto-generated method stub
		return o1.runs-o2.runs;
	}
	
	
}





