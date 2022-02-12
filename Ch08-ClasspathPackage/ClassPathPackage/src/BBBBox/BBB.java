package BBBBox;
import AAABox.AAA;

public class BBB {
	public void printName()
	{
		System.out.println("BBB");
	}
}

class BBBBox {
	public static void main(String[] args)
	{
		AAA AAA1 = new AAA();
		AAA1.printName();
		
		AAABox.AAA AAA2 = new AAABox.AAA();
		AAA2.printName();
	}
}