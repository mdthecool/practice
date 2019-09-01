/*Given a string, find all the permutations of it.
 * 
 * 
 * 
 */
public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abc";
		permutations(str,0,str.length()-1);
	}

	
	public static void permutations(String str,int l,int r){
		
		if(l==r){
			System.out.println(str);
		}
		else {
			
			for(int i=l;i<str.length();i++){
				
				str = swap(str,l,i);
			    permutations(str,l+1,r);
			    str = swap(str,l,i);
			}
		}
	}
	
	public static String swap(String str,int i, int j){
		
		char[] ch = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}
}
