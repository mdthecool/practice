/*Amazon question - Given two sorted arrays, merge them so that lesser elements appear in first array 
 * followed by the elements in the next array.
 * 
 * Solution - Take the last element in the second array and find the appropriate position of it in the first one.
 * After the first iteration the last element of the second array will the max. Similarly after the next iteration
 * the second last element of the second array will have the second largest.
 * After each iteration decrement the value of second array pointer by 1.
 * 
 * 
 */
public class ArrayMergeSortInO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 5, 9, 10, 15, 20};
		int[] arr2 = {2, 3, 8, 13};
		merge(arr1,arr2);
		print(arr1);
		print(arr2);

	}
	
	
	public static void merge(int[] arr1, int[] arr2){
		
		
		for(int i=arr2.length-1;i>=0;i--){
			
			for(int j=arr1.length-1;j>=0;j--){
				
				if(arr2[i] < arr1[j]){
					
					//we need to to do insertion sort.
					//pick the last and store in arr2. then do insertion sort for the rest
					int temp = arr1[arr1.length-1];
					int k = arr1.length-1;
					while(k-1>=0 && arr2[i] < arr1[k-1]){
						
						arr1[k] = arr1[k-1];
						k--;
					}
					arr1[k] = arr2[i];
					arr2[i] = temp;
				}
			}
		}
	}

	public static void print(int[] arr1){
		
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}
}
