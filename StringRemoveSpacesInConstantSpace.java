
public class StringRemoveSpacesInConstantSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "My name is Siddharth";
		removeSpaces(str);
	}

	
	public static void removeSpaces(String str){
		
		int start =-1;
		int end =-1;
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			
			if(ch[i]== ' '){
				
				if(start ==-1){
					start=i;
				}
				
				else {
					
					end =i-1;
				}
				
			}
			
			if(start !=-1 && end !=-1){
				
				for(int k=start;k<ch.length-1;k++){
					
					ch[k] = ch[k+1];
				}
				
				start=end-1;
				end=-1;
			}
		}
		
		System.out.println("The string is " + String.valueOf(ch));
	}
}
