/*Given two strings str1 and str2. Find the minimum no of edits (update, remove, insert) required to convert 
 * one string to another.
 * 
 * Solution - Dp. Create 2d matrix with null* added to both rows and columns.
 * 
 * 
 * 
 * 
 */
public class DPEditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch1 = {'a','b'};
		char[] ch2 = {'a','d'};
		editDistance(ch1,ch2);
		
	}

	
	public static void editDistance(char[] ch1,char[] ch2){
		
		int[][] arr = new int[ch1.length+1][ch2.length+1];
		
		//filling the first row
		for(int j=0;j<ch2.length+1;j++){
			
			arr[0][j] = j;
		}
		
		//filling the first column
         for(int i=0;i<ch1.length+1;i++){
			
			arr[i][0] = i;
		}
		
         //Now fill the rest.
         
         for(int i=0;i<ch1.length;i++){
        	 
        	 for(int j=0;j<ch2.length;j++){
        		 
        		 if(ch1[i] == ch2[j]){
        			 
        			 arr[i+1][j+1] = arr[i][j];
        		 }
        		 
        		 else {
        			 
        			 int min = Math.min(arr[i][j],arr[i][j+1]);
        			 min = Math.min(min,arr[i+1][j]);
        			 arr[i+1][j+1]=min +1;
        		 }
        	 }
         }
         
         System.out.println("The array is ");
         for(int i=0;i< arr.length;i++){
        	 
        	 System.out.println("");
        	 for(int j=0;j<arr.length;j++){
        		 
        		 System.out.print(arr[i][j]);
        	 }
         }
         System.out.println(" ");
         System.out.println("No of edits needed = " + arr[ch1.length][ch2.length]);
	}
}
