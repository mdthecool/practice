/*Given an array of integers where each integer represents size of box. Find the best fit box for the 
 * given item k 
 * 
 * 
 * 
 */
public class ArrayBestFitBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60,70};
		bestFitBox(arr,50);

	}
	
	
	public static void bestFitBox(int[] arr, int k){
		
		
		int low=0;
		int high = arr.length-1;
		int mid;
		int best_fit = Integer.MAX_VALUE;
		while(low<=high){
			
			mid = (low+high)/2;
			
			if(arr[mid]==k){
				
				System.out.println("Best size box is " + arr[mid]);
				return;
			}
			
			else if (arr[mid] < k){
				
				low = mid+1;
			}
			
			else if(arr[mid] > k){
				
				if((arr[mid]-k) < best_fit){
					best_fit = arr[mid]-k;
				}
				
				high = mid-1;
			}
		}
		
		System.out.println("The best fit box is " + (best_fit+k));
	}

}
