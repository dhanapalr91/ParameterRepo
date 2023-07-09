package test;

import java.io.*;
import java.util.*;

// Class 1
// Helper class implementing Runnable interface

class MyThread1 implements Runnable {

	// run() method inside this class
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String s : Mt.str)
			System.out.println(s);
	}
}

// Class 3
// Main class
public class Mt {

	public static List<String> str;
	public static  List<String> synlist;

	public static void listMt() {
		str = new ArrayList<String>();
		// add elements
		str.add("Hello");
		str.add("Hi");
		str.add("Namaste");
		str.add("Bonjour");
		str.add("Java");
		str= Collections
                .synchronizedList(str);
	}
	public static void main(String[] args) {

		// Creating reference of Runnable to
		// our classes above in main() method
		Runnable obj1 = new MyThread1();
		Runnable obj2 = new MyThread1();

		// Creating reference of thread class
		// by passing object of Runnable in constructor of
		// Thread class
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		listMt();
		
		t1.start();
		t2.start();
		
	
	}
}
