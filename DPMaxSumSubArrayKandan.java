/*Given an array , find the max sum sub array (Kande's problem)
 * 
 * Solution = arr[i] = max(arr[i-1],arr[i])
 * 
 * 
 * 
 */
public class DPMaxSumSubArrayKandan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		maxSumSubArray(arr);
	}

	
	public static void maxSumSubArray(int[] arr){
		
		int curr_max = arr[0];
		int start =0;
		int end=0;
		for(int i=1;i<arr.length;i++){
			
			int max = Math.max(arr[i],arr[i-1]+arr[i]);
			if(max > curr_max && max == (arr[i-1]+ arr[i])){
				curr_max = max;
				end =i;
				
			}
			else if(max>curr_max && max == arr[i]){
				
				start =i;
				end =i;
				curr_max =max;
			}
			
			arr[i] = max;
			
			
		}
		
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println("Max subArray sum is " + curr_max);
		System.out.println("Sart index is " + start);
		System.out.println("End index is " + end);
	}
}
