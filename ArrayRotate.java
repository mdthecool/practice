/*Given an array, roate it k places
 * Eg -123456 k=2
 * 
 * 345612
 * 
 * Solution - Divide the array into 2 parts, reverse the two parts then reverse the whole array.
 * 
 * 216543 -> 345612
 * 
 * 
 * 
 */
public class ArrayRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6};
		rotate(arr,2);
	}

	
	public static void rotate(int[] arr,int k){
		
		
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		reverse(arr,0,arr.length-1);
		print(arr);
		
	}
	
	
	public static void reverse(int [] arr, int start,int end){
		
		
		while(start<end){
			
			int temp = arr[start];
			arr[start] =  arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
	}
	
	public static void print(int [] arr){
		
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i]+ " ");
		}
	}
	
}
