/*Given an array of integers, write a function that places even numbers at even and odd numbers at odd places.
 * 
 * Solution - 
 */
public class ArrayEvenOddPlaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr ={10, 9, 7, 18, 13, 19, 4, 20, 21, 14};
		segregate(arr);
	}
	
	
	public static void segregate(int[] arr){
	
		
		//have variable i for even index and j for odd index.
		int i=0,j=1; int flag_odd =0, flag_even =0;
		while(i< arr.length && j<arr.length){
			
			if(arr[i]%2 !=0){
				
				//element to be replaced.
				flag_even =1;
			}
			
			if(arr[j]%2 == 0){
				
				//element to be replaced.
				flag_odd =1;
				
			}
			
			if(flag_even ==1 && flag_odd ==1){
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
				flag_even=0;
				flag_odd =0;
			}
			else if (flag_even ==0 && flag_odd==1){
				
				i = i+2;
			}
			
			else if (flag_odd ==0 && flag_even ==1){
				j=j+2;
			}
			
			else if(flag_odd ==0 && flag_even ==0){
			
				i=i+2;
				j=j+2;
			}
		}
		
		
		for(i=0;i<arr.length;i++){
			
			System.out.print(arr[i] + " ");
			
		}
	}

}
