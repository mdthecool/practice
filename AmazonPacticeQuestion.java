
public class AmazonPacticeQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 perm(3,3);
	}
	
	
	
	public static String perm(int a, int b){
		
		String str = "";
		if(a>b){
		  while(a>0 && b>0){
		  if(a>1){
		  str = str+"aa";
		  str = str + "b";
		  a = a-2;
		  b=b-1;
		  }
		  else {
			  
			  str = str+"a";
			  str = str+"b";
			  a = a-1;
			  b = b-1;
		  }
		  }	
		}
		
		else {
			
			while(a>0 && b >0){
				
				if(b>1){
					
					str = str+"bb";
					str = str +"a";
					b = b-2;
					a = a-1;
					
				}
				
				else {
					
					str = str + "b";
					str = str + "a";
					a = a-1;
					b = b-1;
				}
			}
		}
		
		while(a>0){
			
			str = str + "a";
			a = a-1;
		}
		
		while(b>0){
			
			str = str + "b";
			b=b-1;
		}
		System.out.println("The string is " + str);
		return str;
	}

}
