/*Search for an element in the sorted rotated array.
 * Solution - Find the pivot element (the element which is less than the element to its next)
 * Do a binary search from low to pivot. If the element is not found, do a binary search on pivot to high.
 * 
 * 
 * 
 */
public class SearchInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5,6,7,8,9,10,1,2,3,4};
		
		//System.out.println("The pivot element is " + pivot);
		searchInRotatedArray(arr,11);
	}

	
	public static void searchInRotatedArray(int[] arr, int x){
		
		int pivot = findPivot(arr);
		System.out.println("Pivot index is " + pivot);
		// Now that we have got the pivot element. Search in the two sub sorted arrays.
		int index = binarySearch(arr,x,0,pivot);
		
		if(index ==-1){
			System.out.println("Element not found in 1st sorted array...searching in next");
			index = binarySearch(arr,x,pivot+1,arr.length-1);
			if(index ==-1){
				
				System.out.println("Element not found in 2nd sorted array too !");
			}
			
			else {
				
				System.out.println("Element found at location " + index);
			}
		}
		
		
		else {
				System.out.println("Element found at location " + index);
			}
		}
		
		
		
		
		
	
	
	
	public static int findPivot(int[] arr){
		
		int low =0;
		int high = arr.length-1;
		int mid=0;
		
		while(low<high){
			
			mid = (low+high)/2;
			if(arr[mid] > arr[mid+1]){
				return mid;
			}
			
			else if(arr[mid] > arr[low]){
				
				low = mid+1;
				
			}
			
			else if(arr[mid] < arr[high]){
				
				high = mid-1;
				
			}
		}
		
		System.out.println("Pivot element not found");
		return -1;
	}
	
	public static int binarySearch(int[] arr,int x,int low,int high){
		int mid =0;
		
		while(low<=high){
			
			mid = (low+high)/2;
			if(arr[mid]==x){
				return mid;
			}
			
			else if(x > arr[mid]){
				
				low = mid+1;
			}
			
			else {
				
				high = mid-1;
			}
			
		}
		
		return -1;
	}
}
