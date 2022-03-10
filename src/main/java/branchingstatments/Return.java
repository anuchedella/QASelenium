package branchingstatments;

public class Return {

	public static void main(String[] args) {
		Return r = new Return();
		r.sum(200, 300);
	}

	public int sum(int a, int b) {
		int c;
		c = a + b;
		return c;
	}

	public int mul(int a, int b) {
		int d;
		d = a * b;
		return d;
	}

}
