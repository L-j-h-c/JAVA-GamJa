package MethodScope;

public class MethodParams {

	public static void main(String[] args) {
		double myHeight = 175.9;
		hiEveryone(12, 12.5);
		hiEveryone(13, myHeight);
		byEveryone();
		
		int result = adder(4, 5);
		System.out.println("4와 5의 합 : " + result);
		System.out.println("3.5의 제곱 : " + square(3.5));
	}
	
	public static void hiEveryone(int age, double height)
	{
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("저의 키는 " + height+ "cm 입니다.");
	}
	
	public static void byEveryone()
	{
		System.out.println("다음에 뵙겠습니다.");
	}
	
	// 값을 반환하는 메소드
	
	public static int adder(int num1, int num2)
	{
		int addResult = num1 + num2;
		return addResult;
	}
	
	public static double square(double num)
	{
		return num*num;
	}
}
