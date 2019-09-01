/*Given an array of integer, where each element represents the no of chocolates in the box.
 * You need to distribute these chocolote boxes to k children such that diff between the max and min is least.
 * 
 * Solution - Sort the array. Make min = arr[0]. Max as arr[k-1]. Diff = max-min
 * then min = arr[1] max = arr[k]. Calculate diff again ....keep incrementing by 1 and get the least diff
 * 
 * 
 * 
 * 
 * 
 */
public class ArrayChocolateDistributionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,4,1,9,56,7,9,12};
		distribute(arr,5);
	}

	
	
	public static void distribute(int[] arr, int k){
		
		arr = sort(arr);
		for(int i=0;i< arr.length;i++){
			
			System.out.print(arr[i] + " ");
		}
		int diff = Integer.MAX_VALUE;
		int j=0;
		int i=k-1;
		while(i<arr.length){
			
			if(arr[i]-arr[j] < diff){
				
				diff = arr[i]-arr[j];
			}
			
			j++;
			i++;
			
		}
		
		System.out.println("The min diff is " + diff);
	}
	
	
	public static int[] sort(int[] arr){
		
		int temp;
		for(int i=0;i< arr.length;i++){
			
			for(int j=0;j<arr.length-1-i;j++){
				
				if(arr[j+1] < arr[j]){
				
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		return arr;
	}
}
