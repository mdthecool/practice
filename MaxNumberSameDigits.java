/*Given a number, find the max number that you can form using the same digit.
 * 
 * Solution - O(n) - use a bucket array of size 10. Store the frequency of each digit in the bucket array.
 * Then traverse the array from right and add.Convert the string to integer.
 * 
 * 
 * 
 * 
 */
public class MaxNumberSameDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		greatestInteger(1203465);
	}

	
	public static void greatestInteger(int num){
		
		int[] temp = new int[10];
		
		String str =String.valueOf(num);
		for(int i=0;i< str.length();i++){
			
			temp[str.charAt(i)-'0']++;
		}
		
		String s = new String();
		for(int i=temp.length-1;i>=0;i--){
			
			while(temp[i]!=0){
				s = s+String.valueOf(i);
				temp[i]--;
				
			}
		}
		
		System.out.println(s);
	}
}
