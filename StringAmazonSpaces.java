/*Given a string, print all the combinations of spaces in it.
 * ABC -> A BC -> A B C -> AB C
 * 
 * Solution - do it via all subset way.
 * 
 * 
 * 
 */
public class StringAmazonSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ABC";
		combination(str);

	}
	
	public static void combination(String str){
		
		//char[] ch = str.toCharArray();
		int[]  arr = new int[str.length()-1];
		
		for(int i=0; i < Math.pow(2,str.length()-1);i++){
			
			
			for(int j=0;j<str.length()-1;j++){
				
				if((i & (1<<j)) >0){
					
					arr[j] =1;
				}
			}
			
			print(str,arr);
			System.out.println("");
			for(int k=0;k< arr.length;k++){
				
				arr[k] =0;
			}
		}
		
	}
	

	private static void print(String str, int[] arr) {
		// TODO Auto-generated method stub
		
		String temp = String.valueOf(str.charAt(0));
		for(int i=1;i<str.length();i++){
			
			if(arr[i-1]==1){
				 temp = temp + " " + str.charAt(i);
			}
			
			else {
				temp = temp + str.charAt(i);
			}
		}
		System.out.print(temp);
		
	}

	
}
