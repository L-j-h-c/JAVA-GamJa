package ConstantOperator;

public class ConstantOperator {

	public static void main(String[] args) {
		long num = 10000000000L;
		float num2 = 12.45F;
		
		System.out.println(num);
		System.out.println(num2);
		
		char ch1 = 'A';
		char ch2 = 'Z';
		
		int num3 = ch1;
		int num4 = (int)ch2;
		
		System.out.println("문자 A의 유니코드 값 : " + num3);
		System.out.println("문자 A의 유니코드 값 : " + num4);
	}

}
