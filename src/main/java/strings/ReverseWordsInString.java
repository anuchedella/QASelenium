package strings;

public class ReverseWordsInString {

	public static void main(String[] args) {
		reverse("Welcome to Java");
		reverse("This is an easy Java Program");

	}

	public static void reverse(String str) {
		String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	}

}
