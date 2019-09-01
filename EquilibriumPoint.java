
public class EquilibriumPoint {

	
	
	public static void main(String[] args){
		
		int[] arr = {-7, 1, 5, 2, -4, 3, 0};
		equilibriumIndex(arr);
	}
	
	
	public static void equilibriumIndex(int[] arr){
		
		int sum =0;
		for(int i =0;i< arr.length;i++){
			
			sum = sum + arr[i];
			
		}
		
		System.out.println("The sum of the array is " + sum);
		
		//Now finding the equilibrium point
		int left_sum = 0;
		int right_sum = 0;
		
		for(int i=1;i<arr.length;i++){
			
			left_sum = left_sum + arr[i-1];
			right_sum = sum - left_sum - arr[i];
			
			if(left_sum== right_sum){
				
				System.out.println("The left sum is " + left_sum);
				System.out.println("The right sum is " + right_sum);
				System.out.println("The equilibrium index is " + i);
				return;
			}
		}
	}
}
