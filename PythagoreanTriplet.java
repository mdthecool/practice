import java.util.HashSet;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]  arr = {1,2,3,4,5};
		pythagoreanTriplet(arr);
	}

	
	
	public static void pythagoreanTriplet(int[] arr){
		
		HashSet<Integer> m = new HashSet<Integer>();
		
		for(int i =0;i< arr.length;i++){
			
		m.add(arr[i]*arr[i]);
		}
		
		for(int i =0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				
				if(m.contains((arr[i]*arr[i]) + (arr[j]*arr[j]))){
				System.out.println("Pythagorean triplet exists");
				System.out.print((arr[i]*arr[i]) + "," + (arr[j]*arr[j]) + "," + ((arr[i]*arr[i]) + (arr[j]*arr[j])));
				}
				}
		}
	}
}
