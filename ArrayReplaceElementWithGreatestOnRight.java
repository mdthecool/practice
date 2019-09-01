/*Given an array of integers, replace every element with the next greatest element (greatest element on the right side) in the array. Since there is no element next to the last element, replace it with -1.
 * For example, if the array is {16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5, 5, 2, -1}.
 * 
 * Solution - Traverse from right and find the greatest so far. Replace the element with greatest so far and replace 
 * greatest so far if it is less than element.
 * 
 * 
 * 
 */
public class ArrayReplaceElementWithGreatestOnRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {16, 17, 4, 3, 5, 2};
		replace(arr);
	}

	
	public static void replace(int[] arr){
		
		int max_so_far = arr[arr.length-1];
		int temp;
		arr[arr.length-1] = -1;
		
		for(int i=arr.length-2; i >=0;i--){
			
			if(max_so_far < arr[i]){
				
				temp = max_so_far;
				max_so_far = arr[i];
				arr[i] = temp;
				
		}
			
			else{
				
				arr[i] = max_so_far;
			}
			
		}
		
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i] + ",");
		}
	}
}
