import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*Given an array of intervals with start time and end time. Merge the intervals and print the mutually
exclusive intervals
*/

class Interval implements Comparator<Interval>{
	
	int start;
	int end;
	
	Interval(int start,int end){
		this.start = start;
		this.end = end;
	}

	Interval(){
		
	}
	@Override
	public int compare(Interval o1, Interval o2) {
		// TODO Auto-generated method stub
		return o1.start-o2.start;
	}
}
public class ArrayMergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Interval> al = new ArrayList<Interval>();
    al.add(new Interval(2,3));
    al.add(new Interval(4,7));
    al.add(new Interval(5,6));
    
    Collections.sort(al,new Interval());
    System.out.println("The sorted list is " );
    print(al,al.size()-1);
    int i = mergeInterval(al);
    System.out.println("After merge the list is ");
    print(al,i);
	}

	
	public static int mergeInterval(ArrayList<Interval> al){
		
		int i=0;
		for(int j=1;j<al.size();j++){
			
			if(al.get(j).start <= al.get(i).end){
				//merge and store at index i.
				al.get(i).end = Math.max(al.get(i).end,al.get(j).end);
			}
			else {
				//intervals don't merge
				i++;
				al.set(i,al.get(j));
			}
		}
		
		
		return i;
	}
	
	public static void print(ArrayList<Interval> al,int i){
		
		for(int k=0;k<=i;k++){
			
			System.out.println(al.get(k).start + " " + al.get(k).end);
		}
	}
}
