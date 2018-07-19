package ch09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CH09_02 {

	public static void main(String[] args) {

		String[] names = { "±i§g¶®", "¼ï¬ü³·", "¼B³·²ú", "¶À±l±l", "¼ï¬ü³·", "¶À¬üµØ", "¼B³·ÄR", "¶À±l±l", "¼ï¬ü³·", "¼ï¬ü³·" };
		HashSet<String> set = new HashSet<>();
		set.addAll(Arrays.asList(names));

		Iterator<String> it = set.iterator();

		while (it.hasNext()) {

			String x = it.next();

			System.out.println(x);

		}

	}

}
