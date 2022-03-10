package controlstatements;

public class BiggestNum {

	public static void main(String[] args) {
		int a = 1000;
		int b = 500;
		int c = 200;
		if ((a>b) && (a>c) )
		{
			System.out.println("A is big");
		} else if (b>c)
		{
			System.out.println("B is big");
		} else 
		{
			System.out.println("C is big");
		}
	}

}
