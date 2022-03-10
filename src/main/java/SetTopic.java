import java.util.Iterator;
import java.util.TreeSet;

public class SetTopic {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("hari");
		ts.add("krishna");
		ts.add("murali");
		ts.add("mohan");
		System.out.println(ts);
		ts.add("hari");
		ts.add("krishna");
		System.out.println(ts);
		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
