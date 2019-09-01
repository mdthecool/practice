/*Given an array , print all subsets of the array.
 * {a,b} = {a},{b},{a,b},{}
 * 
 * Solution - Total subsets is 2^n. Where n is the total no of elements. 
 * 00 - {}
 * 01 - {a}
 * 10 - {b}
 * 11 - {ab} 
 * 
 * 
 * 
 */
public class ArrayPrintAllSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch = {'a','b','c'};
		subsets(ch);
	}

	
	public static void subsets(char[] ch){
		
		int n = ch.length;
		for(int i=0;i<Math.pow(2,n);i++){
			
			System.out.print("{");
			for(int j=0;j<n;j++){
				
				if((i & (1<<j)) > 0){
					
					System.out.print(ch[j]);
				}
			}
			System.out.print("}");
			System.out.println(" ");
		}
	}
}
