package ch09;

import java.util.Arrays;

public class CH09_04 {

	public static void main(String[] args) {
		String[] names = { "±i§g¶®", "¼ï¬ü³·", "¼B³·²ú", "¶À±l±l", "¼ï¬ü³·", "¶À¬üµØ", "¼B³·ÄR", "¶À±l±l", "¼ï¬ü³·", "¼ï¬ü³·" };
		
		Arrays.sort(names);

		for(int x = 0 ; x < names.length ; x++) {
			System.out.print(names[x]+" ");
			
		}
		
	}

}
