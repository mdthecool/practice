
public class Implementatoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = atoi(" -0012a42");
		System.out.println(a);
		
		
	}

	
	public static int atoi(String str){
		
		str = str.trim();
		if(str ==null || str.length()==0){
			
			System.out.println("Empty String");
			return 0;
		}
		
		double result = 0;
		
		int i;
		if(str.startsWith("-") || str.startsWith("+")){
			i=1;
		}
		else {
			i=0;
		}
		while (i<str.length()){
			
			if(str.charAt(i) < '0' || str.charAt(i) > '9'){
				
				break;
				
				
			}
			else {
			
			result = result*10 + str.charAt(i) -'0';
			}
			i++;
			
		}
		
		if(str.charAt(0) == '-'){
			result = -result;
		}
		if(result > Integer.MAX_VALUE){
			System.out.println("Returning max value");
		}
		
		else if (result < Integer.MIN_VALUE){
			System.out.println("Returning min value");
			return Integer.MIN_VALUE;
		}
		return (int)result;
		
	}
}
