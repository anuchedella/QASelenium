package constructors;

public class ParametarizeCon {

	public static void main(String[] args) {
		ParametarizeCon pc = new ParametarizeCon("constructor");
		
	}
	public ParametarizeCon(String method)
	{
		
		System.out.println("This is another method" +method);
	}
	public void method()
	{
		System.out.println("Second method");
	}

}
