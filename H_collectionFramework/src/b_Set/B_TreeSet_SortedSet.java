package b_Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class B_TreeSet_SortedSet {

	public static void main(String[] args) {

		SortedSet set = new TreeSet();
		
		String from = "bar";
		String to = "d";
		
		set.add("ant");
		set.add("alias");
		set.add("batman");
		set.add("aha");
		set.add("cola");
		set.add("Cola");
		set.add("ddr");
		set.add("dance");
		set.add("deee");
		set.add("ever");
		set.add("giant");
		set.add("zoo");
		
		System.out.println(set); // Á¤·ÄµÈ set
		System.out.println(set.subSet(from, to));
		
	}

}
