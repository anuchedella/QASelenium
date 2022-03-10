package strings;

public class StringReverse {

	public static void main(String[] args) {
		String str1 = "banana";
		String rev = "";

		int len = str1.length();
		for (int i = len - 1; i >= 0; i--) {
			System.out.println(rev);
			rev = rev + str1.charAt(i);
		}

		System.out.println("String before reversal : " + str1);
		System.out.println("String after reversal : " + rev);
	}

}
