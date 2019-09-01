
public class StringCamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c = camel("thisIsCamelCase");
		System.out.println("The number of words are " + c);
	}
	
	
	public static int camel(String str){
		
		if(str.length()==0){
			
			return 0;
		}
		
		int count =0;
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)<= 90 && str.charAt(i) >= 65){
				
				count++;
			}
		}
		
		return count+1;
	}

}
