import java.util.HashSet;
import java.util.Set;

public class StringQuestionSirionLabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(convert("111"));
		System.out.println(convert("126"));
		//System.out.println(convert("12"));

	}

	
	public static void convert_(String input, String sofar, Set<String> words) {
		if (input.length() == 0) {
			words.add(sofar);
			return;
		}
		convert_(input.substring(1), sofar + (char)(Integer.parseInt(Character.toString(input.charAt(0))) + 'a' - 1), words);
		if (input.length() >= 2) {
			int num = Integer.parseInt(input.substring(0, 2));
			if (num <= 26) {
				convert_(input.substring(2), sofar + (char)(num + 'a' - 1), words);
			}
		}
	}
	
	public static Set<String> convert(String input) {
		Set<String> words = new HashSet<>();
		convert_(input, "", words);
		return words;
	}
	
	
}
