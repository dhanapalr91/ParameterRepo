package testngProject;

import java.util.Scanner;

public class Swap {
	
	public static void main(String[] args) {
		
		String str = "Hello+-^Ja va+ -Programmer^ ^^-- ^^^ +!";  
		str = str.replaceAll("[-+^]*", " ");  
		//str=str.replaceAll("\\W", " ")    //we can also use this regular expression  
		System.out.println(str);  
		
		String html = "Th is is bold+-^";
		html = html.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println(html);

	}
}
