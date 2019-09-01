/*Given a string, find the maximum palindromic subsequence.
 * Solution - Check Vivekananda's video on this. Nicely explained.
 * 
 * 
 * 
 */
public class LongestPalindromicSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "abcbca";
		palindromicSubsequence(str);
		
	}
	
	public static void palindromicSubsequence(String str){
		
		int[][] arr = new int[str.length()][str.length()];
		
		//filling the diagonal with 1 and rest with 0.
		
		for(int i=0;i<str.length();i++){
			
			for(int j=0;j<str.length();j++){
				
				if(i==j){
					
					arr[i][j]=1;
				}
				
				else {
					
					arr[i][j]=0;
				}
			}
		}
		
		//Now filling the upper half of the array.
		
		int count=1;int i;int j;
		while(count < str.length()){
			j=count;i=0;
			
			while(j<str.length()){
				
				if(str.charAt(i) == str.charAt(j)){
					
					arr[i][j] = arr[i+1][j-1] + 2;
				}
				
				else {
					
					arr[i][j] = Math.max(arr[i][j-1],arr[i+1][j]);
				}
				j++;i++;
			}
			count++;
		}
		
		//printing the matrix
		
		for(i=0;i<str.length();i++){
			
			System.out.println();
			for(j=0;j<str.length();j++){
			
				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("Length of the longest palindromic subsequence is " + arr[0][str.length()-1]);
	}

}
