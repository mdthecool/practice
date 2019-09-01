
public class Implementstrstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "aaa";
		String str2 = "aa";
		int index = strstr(str1,str2);
		System.out.println("The index is " + index);
	}

	
	public static int strstr(String str1, String str2){
	
		int i=0,j=0;
		int index=-1;
		if(str2 == null || str2.equals("")){
			
			return 0;
		}
        
        if(str1 == null || str1.equals("")){
            return -1;
        }
        	
		else {
			
			while(i < str1.length() && j < str2.length()){
				
				if(str1.charAt(i) == str2.charAt(j)){
					if(index ==-1){
						index =i;
					}
					i++;
					j++;
				}
				
				else {
				if(index !=-1){
                    i = index+1;
                }
                    else {
                        i++;
                    }
					j=0;
					index =-1;
				}
			}
			
			if(j==str2.length()){
				return index;
				
			}
			else return -1;
		}
	}
}
