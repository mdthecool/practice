/*Given an array, find the least length supersequence.
 * Solution - The problem is similar to length of common subsequence. Only the first row and column change.
 * 
 * 
 * 
 */
public class DPLongestCommonSupersequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "AGGTAB";
		String str2 = "GXTXAYB";;
		superSequenceLength(str1,str2);
	}

	
	public static void superSequenceLength(String str1,String str2){
		
		int[][] dp = new int[str1.length()+1][str2.length()+1];
		
		for(int i=0;i<=str2.length();i++){
			dp[0][i]=i;
		}
		
		for(int i=0;i<=str1.length();i++){
			dp[i][0]=i;
		}
		
		for(int i=1;i<=str1.length();i++){
			for(int j=1;j<=str2.length();j++){
				
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					
					dp[i][j] = dp[i-1][j-1] +1;
					//System.out.println("Hello");
				}
				
				else{
					
					dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+1;
				}
				/*
				System.out.println("i is " +i);
				System.out.println("j is " + j);
				System.out.println(dp[i][j]);
				*/
			}
		}
		
		for(int i=0;i<=str1.length();i++){
			for(int j=0;j<=str2.length();j++){
				
				System.out.print(dp[i][j]+ " ");
			}
			
			System.out.println("");
		}
	}
}
