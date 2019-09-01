import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*The class whose objects need to be sorted should implement the comparable interface and define the compareTo method.
 * The collections.sort() method will take the object of the class as list and sort according to the logic written 
 * in the compareTo method.
 * 
 * 
 * 
 * 
 */
public class ComparableExample implements Comparable<ComparableExample>{

	String name;
	int runs;
	int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ComparableExample> al = new ArrayList<ComparableExample>();
		al.add(new ComparableExample("Ganguly",11300,46));
		al.add(new ComparableExample("Sehwag",8500,42));
		al.add(new ComparableExample("Kohli",10500,30));
		al.add(new ComparableExample("Dhoni",10200,37));
		System.out.println(" ");
		System.out.println("List before sorting");
		print(al);
		System.out.println(" ");
		Collections.sort(al);
		System.out.println("List after sorting");
		print(al);
		

	}

	ComparableExample(String name, int runs, int age){
		
		this.name = name;
		this.runs = runs;
		this.age = age;
	}
	
	public String getName(){
		
		return this.name;
	}
	
	
	public int getRuns(){
		
		return this.runs;
	}
	
	public int getAge(){
		
		return this.age;
	}
	
	

	public int compareTo(ComparableExample o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
	
	public static void print(ArrayList<ComparableExample> al){
		
		Iterator<ComparableExample> itr = al.iterator();
		
		while(itr.hasNext())
		{
			ComparableExample e = itr.next();
			System.out.println(e.name + " " + e.runs + " " + e.age);
		}
	}
	
}

