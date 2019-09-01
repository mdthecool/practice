/*Given a number, find the next greater number that you can form using the same digits.
 * Input: n = "534976"
Output: "536479"

 * Solution - Traverse the element from right. Find the digit that is greater than the digit next to it.
 * In the above example, 9 is greater than 4. So we need to replace 4 with the smallest number between 9,7,6.
 * Once the swap is done, we get 536974..Now sort the elements 9,7,4 in ascending order. We get 536479 and that's
 * the answer.
 * 
 * 
 * 
 * 
 */
public class NextGreaterNumberSameDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int digits[] = {4,3,2,1,0}; 
		nextGreaterNumber(digits);
	}

	
	
	public static void nextGreaterNumber(int[] ch){
		
		int min = Integer.MAX_VALUE;
		int flag = 0;
		int min_index = Integer.MAX_VALUE;
		int j;
		for(j=ch.length-1;j>0;j--){
			
			if(min_index > ch[j]){
				
				min = ch[j];
				min_index = j;
			}
			if(ch[j] > ch[j-1]){
				
		      //replace j-1 with element at min_index
			int temp = ch[j-1];
			ch[j-1] = ch[min_index];
			ch[min_index] = temp;
			flag =1;
			break;
			}
		}
		
		if(flag==0){
			
			System.out.println("Next Greater Number not possible");
			return;
		}
		
		
		
		//sort the element from j to end of the array.
		
		for(int i=j;i< ch.length;i++){
			
			for(int k=j;k< ch.length-1;k++){
				
				
				if(ch[k+1] < ch[k]){
					
					
					int temp = ch[k];
					ch[k] = ch[k+1];
					ch[k+1] = temp;
					
				}
			}
		}
		
		System.out.println("The next greater number is ");
		for(int i=0;i< ch.length;i++){
			System.out.print(ch[i]);
		}
	}
}
