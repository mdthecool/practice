/*Given two sorted arrays. Return two sorted arrays such that the smaller elements are present in arr1 
 * 
 * 
 */
public class ArraysMergeTwoSortedArraysInO1Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {1,5,9,10,15,20};
		int arr2[] = {2,3,8,13};
		merge(arr1,arr2);
	}

	
	public static void merge(int[] arr1, int[] arr2){
		
		int i = arr1.length-1;
		int j= arr2.length-1;
		
		while(j>=0 && i>=0){
			
			if(arr1[i] > arr2[j]){
				
				//replace
				int temp = arr2[j];
				arr2[j] = arr1[i];
				arr1[i] = temp;
				j--;
				i--;
				
			}
			
			else {
				
				j--;
			}
			
		}
		
		System.out.println("The first array is ");
		for(int k=0;k < arr1.length;k++){
			
			System.out.print(arr1[k] + " ");
		}
		System.out.println("");
		System.out.println("The second array is ");
        for(int k=0;k < arr2.length;k++){
			
			System.out.print(arr2[k] + " ");
		}
	}
}
