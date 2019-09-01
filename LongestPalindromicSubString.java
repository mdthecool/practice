/*Given a string find the longest palindromic string.
 * Solution - Fill diagonals with 1 and rest with 0.
 * Fill the upper half. arr[i][j] =1 if arr[i+1][j-1} =1.
 * 
 * Also whenever you set 1, keep the index of i and j in some variable.
 * 
 * 
 * 
 */
public class LongestPalindromicSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcbca";
		longestPalindromicSubstring(str);

	}

	
	public static void longestPalindromicSubstring(String str){
		
		int[][] arr = new int[str.length()][str.length()];
		
		for(int i=0;i< arr.length;i++){
			
			for(int j=0;j<arr.length;j++){
				
				if(i==j){
					
					arr[i][j] =1;
				}
				else {
					
					arr[i][j]=0;
				}
			}
		}
		
		//filling the upper half.
		
		//check for two characters (Remember this step is not there in subsequence.
		
		for(int i=0;i< str.length()-1;i++){
			
			if(str.charAt(i)==str.charAt(i+1)){
				arr[i][i+1] =1;
			}
			else {
				
				arr[i][i+1] =0; 
			}
		}
		
		
		//Now start filling the rest.
		
		int count =2;int i;int j;
		while(count<str.length()){
			
			j=count; i=0;
			
			while(j<str.length()){
				
				if(str.charAt(i)== str.charAt(j)){
					
					arr[i][j] = arr[i+1][j-1];
				}
				
				j++;
				i++;
			}
			
			count++;
		}
		
		for(i=0;i< str.length();i++){
			
			System.out.println();
			for(j=0;j< str.length();j++){
				
				System.out.print(arr[i][j]);
			}
		}
		
	}
}
