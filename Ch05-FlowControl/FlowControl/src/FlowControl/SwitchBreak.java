package FlowControl;

public class SwitchBreak {

	public static void main(String[] args) {
		int n=3;
		
		switch(n)
		{      
		case 1 :
			System.out.println("Simple Java");
		case 2 :
			System.out.println("Funny Java");
		case 3 :
			System.out.println("Fantastic Java");
		default :
			System.out.println("The best programming language");
		}
		
		System.out.println("Do you like coffee?");
		
		// break의 사용
		
		switch(n)
		{      
		case 1 :
			System.out.println("Simple Java");
			break;
		case 2 :
			System.out.println("Funny Java");
			break;
		case 3 :
			System.out.println("Fantastic Java");
			break;
		default :
			System.out.println("The best programming language");
		}
		
		System.out.println("Do you like coffee?");
		
		// 라벨을 여러개 사용하는 예
		
		switch(n)
		{      
		case 1 : case 2 : case 3 :
			System.out.println("Simple Java");
			break;
		case 4 : case 5 :
			System.out.println("Funny Java");
			break;
		default :
			System.out.println("The best programming language");
		}
		
		System.out.println("Do you like coffee?");
	}

}
