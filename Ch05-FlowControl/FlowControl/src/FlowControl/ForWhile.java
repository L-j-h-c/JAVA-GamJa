package FlowControl;

public class ForWhile {

	public static void main(String[] args) {
		int num = 0;
		
		while(num<5)
		{
			System.out.println("I like Java " + num);
			num++;
		}
		
		do
		{
			System.out.println("I love Java " + num);
			num++;
		}while(num<5);
		
		for(int num1=0; num1<5; num1++)
		{
			System.out.println("I made Java" + num1);
		}
		
		for(int i=0, j=7; i<j; i++, j--)
		{
			System.out.println("I ate Java" + i + j);
		}
	}

}
