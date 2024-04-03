package greedy;

import java.util.Arrays;

public class LargestNumber {

	public LargestNumber() {
		// TODO Auto-generated constructor stub
	}
	
	public static String findLargestNumber(int[] numbers) {
		String str_arr[] = new String[numbers.length];
		
		for(int i=0; i<numbers.length; i++) {
			str_arr[i] = String.valueOf(numbers[i]);
		}
		
		//sort the string array using the compareTo method as(2,12) -> 122.compareTo(212) - 212
		Arrays.sort(str_arr, (num_1,  num_2) -> (num_1 + num_2).compareTo(num_2 + num_1));
		
		//case when largest number is 0
		if(str_arr[0].equals("0")) {
			return "0";
		}
		
		//concatenate the sorted strings to form the largest number
		StringBuilder largestNumber = new StringBuilder();
		for(String num : str_arr) {
			largestNumber.append(num);
		}
		
		return largestNumber.toString();
	}

	public static void main(String[] args) {
		int numbers[] = {3, 2, 1, 5, 9};
		String largestNumber = findLargestNumber(numbers);
		System.out.println(largestNumber);
	}

}
