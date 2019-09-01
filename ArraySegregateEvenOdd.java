/*Given an array of integers segregate the even and the odd elements in o(n) time.
 * Solution = The solution is pretty similar to the national dutch problem.
 * In the following solution, even numbers will come before odd.
 * 
 * 
 */
public class ArraySegregateEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7};
		segregate(arr);

	}

	
	public static void segregate(int[] arr){
		
		int i=0;
		int j=0;
		while(j<arr.length){
			
			if(arr[j]%2 ==0){
				
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
				i++;
			}
			
			else {
				
				j++;
			}
		}
		
		System.out.println("The segregated array is ");
		for(int k=0;k<arr.length;k++){
			
			System.out.print(arr[k] + " ");
		}
	}
}
