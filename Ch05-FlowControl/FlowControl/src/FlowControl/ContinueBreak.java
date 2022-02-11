package FlowControl;

public class ContinueBreak {

	public static void main(String[] args) {
		int num1 = 1;
		boolean search = false;

		while (num1 < 100) {
			if (num1 % 5 == 0 && num1 % 7 == 0) {
				search = true;
				break;
			}
			num1++;
		}

		if (search)
			System.out.println("찾는 정수 : " + num1);
		else
			System.out.println("찾지 못했습니다.");

		
		// 100까지 5와 7의 공배수 갯수 찾기
		int num = 0;
		int count = 0;

		while (num++ < 100) {
			if (num % 5 != 0 || num % 7 != 0)
				continue;

			count++;
			System.out.println(num);
		}
		
		System.out.println("count : " + count);
		
		// 무한루프의 사용
		int i = 1;
		
		while(true)
		{
			if(i%6==0 && i%14==0)
				break;
			i++;
		}
		System.out.println(i);
	}
}
