/*Given an array, separate all the negative from the positive with o(1) space and o(n square solution) such
 * that ordering remains same.
 * 
 * 
 */
public class ArraySeparateNegativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {12,11,-13,-5,6,-7,5,-3,-6};
		separate(arr);
	}
	
	
	public static void separate(int[] arr){
		
		int k=0;
		for(int i=0;i< arr.length;i++){
			
			if(arr[i] <0){
				
				k = shift(arr,k,i);
			}
		}
		
		print(arr);
	}	
	
	public static int shift(int[] arr,int start,int end){
		
		int temp = arr[end];
		for(int i=end;i>start;i--){
			
			arr[i] = arr[i-1];
		}
		
		arr[start] = temp;
		return start+1;
	}
	
	public static void print(int[] arr){
		
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i] + " ");
		}
	}
}
