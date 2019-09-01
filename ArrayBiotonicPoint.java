/*given an array of integers, find the biotonic point. A point where all the numbers before it are in
 * increasing order, and all the numbers after it are in decreasing order.
 * 
 * 
 * 
 */
public class ArrayBiotonicPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {6, 7, 8, 11, 9, 5, 2, 1};
		biotonicPoint(arr);
		int[] arr1 = {-3, -2, 4, 6, 10, 8, 7, 1};
		biotonicPoint(arr1);
		
	}

	
	public static void biotonicPoint(int[] arr){
		
		int low =0;
		int high = arr.length-1;
		int mid =0;
		
		while(low<=high){
			
			mid = (low+high)/2;
			
			if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
				System.out.println("The biotonic point is " + arr[mid]);
				return;
			}
			
			else if(arr[mid]< arr[mid+1] && arr[mid] > arr[mid-1]){
				low = mid+1;
				
			}
			
			else if(arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1]){
				high = mid-1;
				
			}
			
		}
		
		System.out.println("No biotonic element found in the array");
	}
}
