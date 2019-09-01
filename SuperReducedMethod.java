import java.util.Stack;

public class SuperReducedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		superReduced("aabbdd");
	}

	
	
	public static String superReduced(String str){
		
		Stack<Character> s = new Stack<Character>();
		
		for(int i=0;i<str.length();i++){
			
			if(s.isEmpty()){
				
				s.push(str.charAt(i));
			}
			else {
				
				if(s.peek()==str.charAt(i)){
					
					s.pop();
				}
				
				else {
					s.push(str.charAt(i));
				}
			}
		}
		
		
		
		str = "";
		if(s.size()==0){
			System.out.println("Empty String");
			return "Empty String";
			
		}
		for(int i=0;i<s.size();i++){
			
			str = str + s.get(i);
			
		}
		System.out.println("The reduced string is " + String.valueOf(str));
		return String.valueOf(str);
		
	}
}
