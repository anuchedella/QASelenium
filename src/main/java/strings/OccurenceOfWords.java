package strings;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWords {

	public static void main(String[] args) {
        String str = "Alice is girl and Bob is boy both are my kids";
        Map<String, Integer> hashMap = new HashMap();
 
        String[] words = str.split(" ");
 
        for (String word : words) {
 
            Integer integer = hashMap.get(word);
            if (integer == null)
                hashMap.put(word, 1);
 
            else {
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}
