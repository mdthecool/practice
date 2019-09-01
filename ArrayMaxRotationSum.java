/*Given an array of integers find the max rotation sum.
 * 
 * Solution = Calculate the sum of array elements. Calculate the product sum of original.
 * 
 * For subsequent = product sum = orginal_product_sum - sum + first one + last *n-1
 * 
 * 
 * 
 */
public class ArrayMaxRotationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {8,1,3,5,2};
		productSum(arr);
	}

	
	public static void productSum(int[] arr){
		
		int sum =0;
		int product_sum =0;
		int max_sum =0;
		for(int i=0;i<arr.length;i++){
			
			sum = sum + arr[i];
			product_sum = product_sum + i*arr[i];
		}
		
		max_sum = product_sum;
		System.out.println(product_sum);
		
		for(int i=0;i<arr.length-1;i++){
			//System.out.println(product_sum);
			//System.out.println(sum);
			product_sum = product_sum -sum + arr[i] + (arr[i]*(arr.length-1));
			System.out.println(product_sum);
			if(max_sum < product_sum){
				max_sum = product_sum;
			}
		}
		
		System.out.println("max sum is " + max_sum);
	}
	
}
