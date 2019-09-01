/*Given an array, the task is to find sum of maximum sum alternating subsequence starting with first element. Here alternating sequence means first decreasing, then increasing, then decreasing, … 
 * For example 10, 5, 14, 3 is an alternating sequence
 * Input :  arr[] = {4, 3, 8, 5, 3, 8}  
Output :  28
Explanation:
The alternating subsequence (starting with first element) 
that has above maximum sum is {4, 3, 8, 5, 8}

Input : arr[] = {4, 8, 2, 5, 6, 8} 
Output :  14
The alternating subsequence (starting with first element) 
that has above maximum sum is {4, 2, 8}
 * 
 * 
 * 
 */
public class MaxSumAlternateSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {8,2,3,5,7,9,10};
		maxSum(arr);
	}
	
	
	public static void maxSum(int[] arr){
		
		int[] temp = new int[arr.length];
		for(int i=0;i<temp.length;i++){
			temp[i] = arr[i];
		}
		char[] ch =new char[arr.length];
		
		temp[0] = arr[0];
		ch[0] = 'd';
		
		//finding the first decreasing.
		int k;
		for(k=1;k<arr.length;k++){
			if(arr[k]<arr[0]){
				break;
			}
			else {
				ch[k] = '\0';
			}
		}
		
		ch[k] = 'i';
		temp[k] = arr[0]+arr[k];
		//now traverse forward.
		
		for(int i=k+1;i<arr.length;i++){
			
			for(int j=0;j<i;j++){
				
				
				if(ch[j] =='d'){
					
					if(arr[i]< arr[j]){
						if(temp[i] < arr[i]+ temp[j]){
							temp[i] = arr[i] + temp[j];
							ch[i] = 'i';
						}
					}
				}
				else if(ch[j] == 'i'){
					
					if(arr[i] > arr[j]){
						
						if(temp[i] < arr[i]+ temp[j]){
							temp[i] = arr[i] + temp[j];
							ch[i] = 'd';
						}
					}
						
					}
				}
			
			
			
			
		}
		
		System.out.println("The array is ");
		for(int i=0;i<arr.length;i++){
			
			System.out.print(temp[i] + " ");
		}
		
		System.out.println("");
		System.out.println("The array is ");
		for(int i=0;i<ch.length;i++){
			
			System.out.print(ch[i] + " ");
		}
	}

	
	
}
