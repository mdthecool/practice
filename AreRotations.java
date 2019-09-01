
public class AreRotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "ABCD";
		String str2 = "DABC";
		areRotations(str1,str2);
	}

	/*Program to check whether strings are rotations of each other or not.
	 * Take the concatenation of str1 with itself and check whether it contains str2
	 * 
	 * 
	 */
	
	public static void areRotations(String str1, String str2){
		
		if(str1.length()!=str2.length()){
			
			System.out.println("str2 is not a rotation of str1");
		}
		str1 = str1 + str1;
		if(str1.contains(str2)){
			
			System.out.println("str2 is a rotation of str1");
		}
		
		else {
			
			System.out.println("str2 is not a rotation of str1");
		}
	}
}
