import java.nio.charset.Charset;
import java.util.Stack;

public class ParanthesisChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "[()]";
		paranthesisChecker(str);
	}
	
	public static void paranthesisChecker(String str){
		
		char[] ch = str.toCharArray();
		Stack s = new Stack();
		
		for(int i =0;i< ch.length;i++){
			
			if(ch[i] == '[' || ch[i] == '{' || ch[i] == '('){
				
				s.push(ch[i]);
			}
			
			else if (ch[i] == ']') {
				
				if((char)s.pop() != '[')
				{
					
					System.out.println("Invalid parenthesis");
					return;
				}
			}
				else if (ch[i] == '}'){
					if((char)s.pop() != '{'){
						
						System.out.println("Invalid parenthesis");
						return;
					}
				}
				
					
				else if (ch[i] == ')'){
					if((char)s.pop() != '('){
						
						System.out.println("Invalid parenthesis");
						return;
					}
				}
				
				}
		
		   if(!s.isEmpty()){
			   System.out.println("Invalid Parenthesis");
		   }
		   else {
			   System.out.println("Valid Parenthesis");
		   }
			}
		
	}


