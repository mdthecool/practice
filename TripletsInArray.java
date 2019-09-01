import java.util.HashSet;

public class TripletsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,3,4,5,6,7};
		triplets(arr);
	}
	
	
	public static void triplets(int[] arr){
		
		HashSet<Integer> s = new HashSet<Integer>();
		
		for(int i = 0;i<arr.length;i++){
			
			s.add(arr[i]);
		}
		
		for(int i=0 ;i<arr.length-1;i++){
			
			for(int j=i+1;j<arr.length;j++){
				
				if(s.contains(arr[i] + arr[j])){
					
					System.out.println("Found triplet " + arr[i] + "," + arr[j] + "," + (arr[i] + arr[j]));
				}
			}
		}
		
	}
	
	
	

}
