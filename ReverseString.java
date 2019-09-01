
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "my name is khan";
		reverseString(str);
	}

	
	
	public static void reverseString(String str){
		
		char temp;
		char[] ch = str.toCharArray();
		for(int i=0;i<= (str.length())/2;i++){
			
			
			temp = ch[i];
			ch[i] = ch[str.length()-1-i];
			ch[str.length()-1-i] = temp;
			
			
		}
		
		str = String.valueOf(ch);
		//System.out.println(str);
		int start =0;
		for(int i=0;i< ch.length;i++){
			
			if(ch[i] == ' '){
			
				int count =0;
				//System.out.println("i=" + i);
				//System.out.println("start=" + start);
				
				for(int j=start; j < (start+i)/2;j++){
					
					count++;
					temp = ch[j];
					ch[j] = ch[i-count];
					ch[i-count] = temp;
				}
				str = String.valueOf(ch);
				//System.out.println(str);
				start = i+1;
			}
		
		}
		
		int count =0;
		int i= str.length();
		for(int j=start; j < (start+i)/2;j++){
			
			count++;
			temp = ch[j];
			ch[j] = ch[i-count];
			ch[i-count] = temp;
		}
		str = String.valueOf(ch);
		System.out.println(str);
		
		
	}
	
	
	public static void reverse(String str, int start, int end){
		
		
	}
}
