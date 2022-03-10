package repetetivestatements;

public class MultiplicationTable {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i <= 10; i++) {

			System.out.println(n + " * " + i + " = " + (n * i));
		}
		int k = 11;
		int j = 1;
		while(j<=10)
		{
			System.out.println(k +" * "+j+" = "+(k * j));
			j++;
		}
	}

}
