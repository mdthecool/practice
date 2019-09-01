/*https://www.hackerrank.com/challenges/richie-rich/problem
 * 
 * Solution - In the editorial section.
 * 
 * Traverse the string from front and back.if arr[i] and arr[string.length-1-i] are not same then replace the smaller
 * of the two with the bigger one. Do this till you reach the middle. With every change remember to decrement 
 * the count by 1.
 * 
 * 
 * 
 * 
 */
public class StringHighestValuePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		palindromeString("092282",3);
	}

	
	public static String palindromeString(String str,int k){
		
		boolean[] b = new boolean[str.length()/2];
		
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length/2;i++){
			
			if(ch[i]!=ch[(str.length()-1-i)]){
				
				if(k<=0){
				System.out.println("Not possible");
				return "-1";
				}
				
			else {
				b[i]= true;
				int max = Math.max(Integer.parseInt(String.valueOf(str.charAt(i))),Integer.parseInt(String.valueOf(str.charAt(str.length()-1-i))));
				ch[i] = (char)(max+'0');
				ch[str.length()-1-i] = (char)(max + '0');
				k=k-1;
			     }
			}
			
			
		}
		
		
		//Now check if k is left, if yes then we can optimize the number
		
			int i=0;
			while(i<ch.length/2 && k>=1){
				
				if(ch[i]!='9'){
					if(b[i]== true){
					ch[i]='9';
					ch[str.length()-1-i] = '9';
					k=k-1;
					}
					
					if(b[i]==false && k>=2){
						ch[i]='9';
						ch[str.length()-1-i] = '9';
						k=k-2;
					}
				}
				i++;
			}
		
		
		if(k!=0){
			
			//check for the middle element.
			if(str.length()%2!=0){
				
				ch[str.length()/2] = '9';
			}
		}
		
		System.out.println("The string is " + String.valueOf(ch));
		return String.valueOf(ch);
	}
}
