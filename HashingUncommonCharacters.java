import java.util.HashMap;
import java.util.HashSet;

public class HashingUncommonCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "characters";
		String str2 = "alphabets";
		unCommonCharacters(str1,str2);
	}
	
	
	
	public static void unCommonCharacters(String str1,String str2){
		
		HashSet<Character> m1 = new HashSet<Character>();
		HashSet<Character> m2 = new HashSet<Character>();
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		for(int i =0;i< str1.length();i++){
			
			if(!m1.contains(ch1[i])){
				
				m1.add(ch1[i]);
			}
		}
		
         for(int i =0;i< str2.length();i++){
			
			if(!m2.contains(ch2[i])){
				
				m2.add(ch2[i]);
			}
		}
         
         HashSet<Character> temp1 = new HashSet<Character>(m1);
 		HashSet<Character> temp2 = new HashSet<Character>(m2);
 		System.out.println("m1-"+ m1);
 		System.out.println("m2-" + m2);
 		
 		temp1.removeAll(m2);
 		temp2.removeAll(m1);
 		System.out.print(temp1);
 		System.out.print(temp2);
         
	}

}
