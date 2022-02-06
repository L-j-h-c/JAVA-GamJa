package ConstantOperator;

public class PrefixPostfix {

	public static void main(String[] args) {
		int num1 = 7, num2;
		num2 = (num1--) +5;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		System.out.println(2 << 1);
		System.out.println(2 << 2);
		System.out.println(2 << 3);
		System.out.println(2 << 4);
		
		System.out.println(8 >> 1);
		System.out.println(8 >> 2);
		System.out.println(8 >> 3);
		System.out.println(-8 >>> 1);
	}

}
