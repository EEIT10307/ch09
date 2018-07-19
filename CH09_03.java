package ch09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CH09_03 {
	  public static void main(String[] args) {
		
		  
		  ArrayList<Double> ad = new ArrayList<>() ; 
		  
		  ad.add((double)98) ; 
		  ad.add(12.345) ; 
		  ad.add(97.85) ; 
		  ad.add((double) 12) ; 
		  
		  Collections.sort(ad);	  
		  
		  Iterator <Double> x = ad.iterator() ; 
		  
		  while(x.hasNext()) {
			  double y = x.next() ; 
			  System.out.print(y+" ");
		  }
		  
		  
		  
	}
	
	

}
