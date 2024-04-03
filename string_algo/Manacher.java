package string_algo;

import java.util.Arrays;
import java.util.Scanner;


//To find the longest palindromic substring
public class Manacher{

	private static Scanner input; 
	private String _string;
	
		
	static {
		input = new Scanner(System.in);
	}
	
	//CONSTRUCTOR
	public Manacher(String _string) {
		_string = input.next();
		this._string = _string;
	}

	public String getString() {
		return _string;
	}
	
	
	//LOGIC BUILDING CODE
	public void do_find_the_longest_palendrome_with_manacher_algorithm(String _string) {
	
		int string_length = _string.length();
		
		int new_string_length = 2*string_length + 3;
		
		char[] new_string = new char[new_string_length];
		
		new_string[0] = '@';
		new_string[new_string_length - 1] = '$';
		
		int index = 1;
		for(char character : _string.toCharArray()) {
			//STRING:	ABABABABAB
			new_string[index++] = '#';
			new_string[index++] = character;		
		}
		new_string[index] = '#';


		int[] LPS = new int[new_string_length];			//LongestPalendromicSubstring
		Arrays.fill(LPS, 0);
		
		
		int center = 0, maxRight = 0;
		
		for(int i = 1; i < new_string_length - 1; i++) {
			int mirror = center - (i - center);
			
			if(i < maxRight) {
				LPS[i] = Math.min((maxRight - i), (LPS[2 * center - i]));
			}
				
			//Compare: LHS == RHS
			while(new_string[i - LPS[i] - 1] == new_string[i + LPS[i] + 1]) {				
				LPS[i]++;
			}
			if( (i + LPS[i])  > maxRight ) {
				center = i;
				maxRight = i + LPS[i];
			}			
		}
		
		
		//Getting the results: MAX-LENGTH and SUB-STRING
		int maxLength = 0, maxIndex = 0;
		for(int i = 0; i < new_string_length - 1; i++) {
			if(LPS[i] > maxLength) {	
				maxLength = LPS[i];
				maxIndex = i;				
			}			
		}
		
		System.out.println(maxLength + " ");
		
		int startIndex = maxIndex - maxLength + 1;
		int actualIndex = ( startIndex - 2 ) / 2;
		System.out.println(_string.substring(actualIndex, actualIndex + maxLength));
	}
	

	//DRIVER CODE
	public static void main(String[] args) {
		String _string = null;	//ABABABABAB	//AB-FGHGF-IJKLMNMLKJI-MN-PONMOOIOOMNOP-FEWLWEF-HIJ
		ManacherAlgorithm obj = new ManacherAlgorithm(_string);
		obj.do_find_the_longest_palendrome_with_manacher_algorithm(obj.getString());
	}
}
