import java.util.ArrayList;

public class AmazonDisjoinSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {1,12,42,70,36,-4,43,15};
		int[] b = {5,15,44,72,36,2,69,24};
		disjoinSets(a,b);
	}
	
	
	public static void disjoinSets(int[] a, int[] b){
		
		boolean flag =true;
		int count=0;
		for(int i=0;i<a.length;i++){
			
		
			if(flag == false){
				
				count = count+1;
			}
			
			else {
				
				flag = false;
			}
			
			for(int j=i+1;j< b.length;j++){
				
				if(a[i]<a[j] && a[j]<b[i]){
					
					
					
					//find the union of the set
					a[j] = a[i];
					b[j] = Math.max(b[i], b[j]);
					flag = true;
					
				    break;
				}
				
				if(a[i]< b[j] && b[j] < b[i]){
					
					
					//find the union
					
					a[j] = Math.min(a[i],a[j]);
					b[j] = b[i];
					flag = true;
					
					
					break;
				}
			}
		}
		
		System.out.println(count);
	}
	
	
	

}
