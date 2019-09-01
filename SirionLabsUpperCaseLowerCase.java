import java.util.HashSet;

public class SirionLabsUpperCaseLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ab1c";
		allCombinations(str);
	}

	
	
	public static void allCombinations(String str){
		
		//find the length of the string.
		int n = str.length();
		String temp ="";
		HashSet<String> s = new HashSet<String>();
		int num = (int) Math.pow(2,n-1);
		
		char ch[] = str.toCharArray();
		
		for(int i=0;i<Math.pow(2,n);i++){
			temp = "";
			for(int j=0;j<n;j++){
				
				if((i & (num>>j)) > 0){
					//means that the bit is set.
					temp = temp+String.valueOf(ch[j]).toUpperCase();
				}
				
				else {
					temp = temp+String.valueOf(ch[j]);
					
				}
				
				
			}
			s.add(temp);
		}
		System.out.println("Total combinations " + s.size());
		System.out.println("Total combinations " + s);
		
	}
	
	
		
	
}
