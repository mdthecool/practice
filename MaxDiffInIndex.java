/*Given an array arr[], find the maximum j – i such that arr[j] > arr[i].
 * 
 * Solution - Create 
 * 
 */
public class MaxDiffInIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {6, 5, 4, 3, 2, 1};
		maxDiffInIndex(arr);
	}
	
	
	public static void maxDiffInIndex(int[] arr){
		
		int [] l = new int[arr.length];
		int [] r = new int[arr.length];
		int min= Integer.MAX_VALUE,max= Integer.MIN_VALUE;
		
		for(int i=0;i< arr.length;i++){
			
			if(arr[i] < min){
				l[i] = arr[i];
				min = arr[i];
			}
			
			else {
				l[i] = min;
			}
		}
		
		/*
		for(int i=0;i< arr.length;i++){
			System.out.print(l[i] + " ");
		}
		*/
		for(int i = arr.length-1;i>=0;i--){
			
			
			if(arr[i] > max){
				max = arr[i];
				r[i] = max;
				
			}
			
			else {
				
				r[i] = max;
			}
		}
		
		/*
		for(int i=0;i< arr.length;i++){
			System.out.print(r[i] + " ");
		}
		*/
		//Now traversing the arrays from left to right.
		int j =0,i=0, max_diff =-1;
		while(i<arr.length && j<arr.length){
			
			if(l[i] < r[j]){
				
				
				if(max_diff < (j-i)){
				max_diff = j-i;
			}
				j++;
			}
			
			else {
				
				i++;
			}
			
		}
		
		System.out.println("Max difference is " + max_diff);
	}

}
