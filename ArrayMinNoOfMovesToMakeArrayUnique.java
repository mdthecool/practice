import java.util.Arrays;

/*
 * 
 * 
 * 
 * 
 */
public class ArrayMinNoOfMovesToMakeArrayUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,2,1,2,1,7};
		minMoves(arr);
	}

	
	public static void minMoves(int[] arr){
		
		//sort the array in nlog(n)
		//let's say we have a sorted array.
		int counter=0;
		Arrays.sort(arr);
		
		for(int i=0;i< arr.length-1;i++){
			
			if(arr[i]==arr[i+1]){
				
				
				arr[i+1]= arr[i+1]+1;
				counter++;
				
				
			}
			
			if(arr[i]>arr[i+1]){
				
				
				counter = counter+(arr[i]-arr[i+1]+1);
				arr[i+1] = arr[i+1] + (arr[i]-arr[i+1] +1);
				
				
			}
			
			
		}
		
		System.out.println("The min no of moves is " + counter);
	}
}
