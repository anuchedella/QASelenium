package strings;

import java.util.HashMap;

public class OccurenceOfChar {

	public static void main(String[] args) {
		String str = "ANURADHASUDHEER";
		HashMap<Character, Integer> hMap = new HashMap();
		for (int i = 0; i <= str.length() - 1; i++) {
			if (hMap.containsKey(str.charAt(i))) {
				int count = hMap.get(str.charAt(i));
				hMap.put(str.charAt(i), ++count);
			} else {
				hMap.put(str.charAt(i), 1);
			}
		}
		System.out.println(hMap);
	}
}
