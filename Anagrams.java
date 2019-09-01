import java.util.HashMap;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		areAnagrams("abcdef","fedcba");
	}

	
	
	public static void areAnagrams(String str1,String str2){
		
	  HashMap<Character,Integer> m = new HashMap<Character,Integer>();
	  
	  char[] ch = str1.toCharArray();
	  for(int i =0; i<ch.length;i++){
		  
		  if(m.containsKey(ch[i])){
			  
			  int value = m.get(ch[i]);
			  value++;
			  m.put(ch[i],value);
		  }
		  
		  else {
			  
			  m.put(ch[i],1);
		  }
	  }
	  
	  ch = str2.toCharArray();
      for(int i =0; i<ch.length;i++){
		  
		  if(m.containsKey(ch[i])){
			  
			  int value = m.get(ch[i]);
			  if(value ==1){
				  m.remove(ch[i]);
			  }
			  else {
				  
				  value--;
				  m.put(ch[i], value);
			  }
		  }
		  
		  else {
			  
			 System.out.println("The two strings are not anagrams");
			 return;
		  }
	}
      
      if(m.isEmpty()){
    	  
    	  System.out.println("The two strings are anagrams");
      }
      
      else {
    	  
    	  System.out.println("The two strings are not anagrams");
      }
	}
}
