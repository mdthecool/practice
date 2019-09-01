/*Given an array of integer where each element represents the digit. Find the next smaller palindromic number
 * Eg 23578 -> 23632
 * 
 * 
 * 
 */
public class ArrayNextSmallerPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,5,9,6};
		palindrome(arr);
	}

	public static void palindrome(int[] arr){
		
		//check if the number is even
		int left = arr.length/2;
		if(arr.length%2 ==0){
		
			
			int[] temp_arr = reverse(left,arr);
			int[] rep_arr = replaceRight(temp_arr,arr);
			boolean b = isGreater(rep_arr,arr);
			if(b==true){
				
				System.out.println("The next greater palindrome is ");
				print(rep_arr);
			}
			
			else {
				
				int [] inc_arr = increaseByOne(arr);
				temp_arr = reverse(left,inc_arr);
				rep_arr = replaceRight(temp_arr,inc_arr);
				System.out.println("The next greater palindrome is ");
				print(rep_arr);
				
				
			}
			
		}
		
		else {
			
			
			//increase the middle element by one and then reverse.
			/*
			int [] inc_arr = increaseByOne(arr);
			int[] temp_arr = reverse(left,inc_arr);
			int[] rep_arr = replaceRight(temp_arr,inc_arr);
			System.out.println("The next greater palindrome is ");
			print(rep_arr);
			*/
		}
	}
	
	
	public static int[] reverse(int left,int[] arr){
		
		int[] temp_arr = new int[arr.length/2];
		int j=0;
		for(int i=left-1;i>=0;i--){
			
			temp_arr[j] = arr[i];
			j++;
		}
		
		
		return temp_arr;
	}
	
	public static int[] replaceRight(int[] temp_arr,int[] arr){
		
		int[] rep_arr = new int[arr.length];
		for(int i=0;i<arr.length/2;i++){
			
			rep_arr[i] = arr[i];
		}
		
		for(int i=0;i<temp_arr.length;i++){
			
			rep_arr[arr.length/2+i] = temp_arr[i]; 
		}
		
		/*for(int i=0;i<arr.length;i++){
			
			System.out.print(rep_arr[i] + " ");
		}
		*/
		return rep_arr;
		
	}
	
	public static boolean isGreater(int[] rev_arr, int[] arr){
		
		
		for(int i=0;i< rev_arr.length;i++){
			
			
			if(rev_arr[i] < arr[i]){
				
				return false;
			
			}
		}
		
		return true;
		
	}
	
	public static int[] increaseByOne(int[] arr){
		
		int[] inc_arr = new int [arr.length];
		
		if(inc_arr[arr.length/2]+1==10){
			
			//change all previous.
			inc_arr[(arr.length/2)-1] = 0;
			
			for(int i=arr.length-2;i>=0;i--){
				
				inc_arr[i] = arr[i]+1;
			}
		}
		
		else {
			
            inc_arr[(arr.length/2)-1] = arr[(arr.length/2)-1]+1;
			
			for(int i=(arr.length/2)-2;i>=0;i--){
				
				inc_arr[i] = arr[i];
			}
		}
		
		//add the rest as it is
		for(int i=arr.length/2;i<arr.length;i++){
			
			inc_arr[i] = arr[i];
		}
		
		return inc_arr;
	}
	
	public static void print(int[] rep_arr){
		
		for(int i=0;i< rep_arr.length;i++){
		
			System.out.print(rep_arr[i] + " ");
			
		}
	}
}
