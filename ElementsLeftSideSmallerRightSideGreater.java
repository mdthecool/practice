import java.util.ArrayList;


public class ElementsLeftSideSmallerRightSideGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
		element(arr);
	}
	
	/*print the element such that all the elements to its left are smaller and to its right are greater.
	 * Algo - create two arrays
	 * Traverse the original array from left and store the max found till element.
	 * Traverse the original array from right and store the min found till element.
	 * Traverse the original array and find if any such element exists such that left < arr[i-1] < right[i+1]
	 * 
	 */
	public static void element(int[] arr){
		
		
		int[] left = new int[arr.length];
		int [] right = new int[arr.length] ;
		
		left[0] = arr[0];
		int max = arr[0];
		for(int i=1;i< arr.length;i++){
			
			if(arr[i] > max){
				max = arr[i];
				left[i] = max;
			}
			
			else {
			left[i] = max;
			}
		}
		
		right[arr.length-1] = arr[arr.length-1];
		int min = arr[arr.length-1];
		for(int i= arr.length-2;i>=0;i--){
			
			if(min > arr[i]){
				min = arr[i];
				right[i] = min;
			}
			
			else {
				
				right[i] =min;
			}
			
		}
		
		//Now traverse the original array 
		
		for(int i=1;i<arr.length-1;i++){
			
			if(left[i-1]<arr[i] && arr[i]< right[i+1]){
				
				System.out.println("The element is " + arr[i]);
			}
		}
		
		
	}

}
