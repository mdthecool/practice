
public class LongestCommonSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch1 = {'a','b','c','d','a','f'};
		char[] ch2 = {'a','c','b','c','f'};
		longestCommonSubsequence(ch1,ch2);
	}
	
	public static void longestCommonSubsequence(char[] ch1, char[] ch2){
		
		int[][] arr = new int[ch1.length][ch2.length];
		
		for(int i =0;i< ch1.length;i++){
			
			for(int j=0;j< ch2.length;j++){
				
				if(i==0 || j==0){
					
					arr[i][j]=0;
					
				}
				
				else if(arr[i] == arr[j]){
					
					arr[i][j] = arr[i-1][j-1]+1;
					
				}
				
				else if (arr[i] != arr[j]){
					
					arr[i][j] = Math.max(arr[i][j-1],arr[i-1][j]);
				}
			}
			
			
		}
		
		System.out.println("Longest common subsequence is " + arr[ch1.length-1][ch2.length-1]);
	}

}
