import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTopic {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("apple");
		a1.add("banana");
		a1.add("mango");
		a1.add("watermelon");
		//System.out.println(a1);
		a1.add("banana");
		//System.out.println(a1);
		Iterator<String> it = a1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
