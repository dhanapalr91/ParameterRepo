package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		ArrayList<String> str= new ArrayList<String>();
	    
	    //displaying the initial size
	    System.out.println("Size at the beginning "+str.size());
	    
	    //add elements
	    str.add("Hello");
	    str.add("Hi");
	    str.add("Namaste");
	    str.add("Bonjour");
	    str.add("Hi");
	    
	    //displaying the ArrayList
	    System.out.println(str);
	    
	    //displaying the size
	    System.out.println("Size after addition "+str.size());
	    
	    //remove element at index 0 
	    str.remove("Hi");
	    
	    //display the new ArrayList
	    System.out.println(str);

	}

}
