
public class MissingNumber {

	
	public static void main(String[] args){
		
		int [] arr = {1,2,3,4,5,7,8};
		missingNumber(arr);
		
	}
	
	
	public static void missingNumber(int[] arr){
		
		int array_sum =0;
		int sum =0;
		for(int i=0;i<arr.length;i++){
			
			array_sum = array_sum + arr[i];
		}
		
		
		sum = ((arr.length+1)*(arr.length+2))/2;
		
		System.out.println("Missing number is " + (sum - array_sum));
		
	}
}
