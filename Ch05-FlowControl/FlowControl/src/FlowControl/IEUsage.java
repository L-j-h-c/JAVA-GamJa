package FlowControl;

public class IEUsage {

	public static void main(String[] args) {
		int num = 120;
		
		if(num<0)
		{
			System.out.println("0 미만");
		}
		else
		{
			if(num<100)
			{
				System.out.println("0이상 100 미만");
			}
			else
			{
				System.out.println("100 이상");
			}
		}
		
		// 하나의 문장으로 이루어진 선언문 중괄호 생
		if(num<0)
			System.out.println("0 미만");
		else
		{
			if(num<100)
				System.out.println("0이상 100 미만");
			else
				System.out.println("100 이상");
		}
		
		// if else도 하나의 문장이기에 중괄호 생
		if(num<0)
			System.out.println("0 미만");
		else
			if(num<100)
				System.out.println("0이상 100 미만");
			else
				System.out.println("100 이상");
		
		if(num<0)
			System.out.println("0 미만");
		else if(num<100)
				System.out.println("0이상 100 미만");
		else
				System.out.println("100 이상");
	}

}
