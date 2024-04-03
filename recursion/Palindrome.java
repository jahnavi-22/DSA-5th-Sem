package recursion;

public class Palindrome {

	public Palindrome() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean setString(String str) {
		str = str.replaceAll("\\s", "").toLowerCase();
		return isPalindrome(str, 0, str.length()-1);
	}
	
//	public static boolean isPalindrome(String str, int start, int end) {
//		
//	}

	public static void main(String[] args) {
		String str = "Was it a car or a cat I saw";
		
		Palindrome obj = new Palindrome();
		

	}

}
