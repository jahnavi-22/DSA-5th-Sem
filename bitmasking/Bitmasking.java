package bitmasking;

public class Bitmasking {

	public Bitmasking() {
		// TODO Auto-generated constructor stub
	}
	
	public static int getBit(int num, int position) {
		int mask = 1 << position;
		return (num & mask) != 0? 1 : 0;
	}
	
	public static int setBit(int num, int position) {
		int mask = 1 << position;
		return (num | mask);
	}
	
	public static boolean checkBit(int num, int position) {
		int mask = 1 << position;
		return (num & mask) != 0;
	}
	
	public static int clearBit(int num, int position) {
		int mask = -(1 << position);
		return (num & mask);
	}
	
	public static boolean powerOfTwo(int num) {
		return (num != 0) &&((num & (num-1))) == 0;
	}
	
	public int toggleBit(int num, int position) {
		return (num ^ (1<<(position-1)));
	}
	
	public void countZeroesOnes(int num) {
		int count0=0;
		int count1=0;
		while(num>0) {
			if((num & 1) == 1) {
				count1++;
			}else {
				count0++;
			}
			num=num>>1;
		}
		System.out.println("Number of zeroes: " + count0);
		System.out.println("number of ones: " + count1);
	}
	
	public int binaryToDecimal(String binaryStr) {
		return Integer.parseInt(binaryStr, 2);
	}
	
	public int decimalToBinary(int decimal) {
		String str = Integer.toBinaryString(decimal);
		int binary = Integer.parseInt(str);
		return binary;
	}

	public static void main(String[] args) {
		int num1 = 12;																//binary:1100
		int fourthBit = getBit(num1, 3);											//getting the fourth bit
		System.out.println("Value of the fourth bit: " + fourthBit);				//output: 1(fourth bit is set)
		
		
		int num2 = 12;																//binary:1010
		int numSet = setBit(num2,2);												//setting the third bit
		System.out.println("Number after setting the 3rd bit: " + numSet);	//output:14 (binary:1110)
		
		int num3 = 10;
		boolean numCheck = checkBit(num3, 2);
		System.out.println("3rd bit is: " + numCheck);
		
		int num4 = 12;
		int numClear = clearBit(num4, 2);
		System.out.println("After bit has been set to 0: " + numClear);
	}

}
