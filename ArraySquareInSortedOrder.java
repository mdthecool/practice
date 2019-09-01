/*Given a sorted array of positive and negative integers, find the squared array in sorted order.
 * 
 * Solution - Take two pointers left and right and find squares and merge into new array. The resultant array 
 * will be in decreasing order. Reverse the new array
 * 
 * 
 */
public class ArraySquareInSortedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-5,-4,-3,-2,1,3,7,8};
		sorted(arr);
	}
	
	public static void sorted(int[] arr){
		
		int[] temp = new int[arr.length];
		
		int i=0;
		int j=arr.length-1;
		int k =0;
		
		while(i<=j){
			
			int left = arr[i]*arr[i];
			int right = arr[j]*arr[j];
			
			
			if(left > right){
				
				temp[k] = left;
				k++;
				i++;
			}
			
			else {
				
				temp[k] = right;
				j--;
				k++;
			}
			
				
			
		}
		
		for(k=temp.length-1;k>=0;k--){
			
			System.out.print(temp[k] + " ");
		}
	}

}
