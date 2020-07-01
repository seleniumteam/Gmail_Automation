package learning.selenium;

import java.util.ArrayList;

public class ListArray {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("The");
		al.add("imp");
		al.add("one");
		al.add("one");
		al.add("one");
		
		System.out.println(al);
		
	    for (String string : al) {
	    	
	    	System.out.println(string);
			
		}
	    
	    System.out.println(al.get(4));
	    
	}

}
