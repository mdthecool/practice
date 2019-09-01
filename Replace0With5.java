/*Given a number, replace all the 0s with 5s
 * Solution - 
 * 
 * 
 * 
 */
public class Replace0With5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1020;
		replace(a);
		replace1(a);
	}

	
	public static void replace(int a){
		
		String str = String.valueOf(a);
		str = str.replaceAll("0","5");
		
		
		a = Integer.parseInt(str);
		System.out.println("The new Integer is " + a);
		
		
		
		
	}
	
	
	public static void replace1(int n){
		
	int temp =0; int x =0;
	
	while(n!=0){
		
		if(n%10 ==0){
			
			temp = (int) (temp + (5*Math.pow(10,x)));
		}
		
		else {
			
			temp = temp + (int)Math.pow(10,x)*(n%10);
		}
		
		n = n/10;
		x =x+1;
	
	}
	
	System.out.println(temp);
	}
}
