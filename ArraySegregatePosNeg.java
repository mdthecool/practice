/*Given a list of integers, segregate the negative and the positive
 * 
 * Solution = Variant of the national dutch flag problem.
 * 
 * 
 * 
 */
public class ArraySegregatePosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,-3,4,5,-6,7};
		segregate(arr);
	}

	
	public static void segregate(int[] arr){
		
		int i=0;
		int j=0;
		
		while(j<arr.length){
			
			if(arr[j] < 0){
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}
			
			else {
				
				j++;
			}
		}
		
		System.out.println("The segregate array is ");
		for(int k=0;k<arr.length;k++){
			
			System.out.print(arr[k] + " ");
		}
	}
}

