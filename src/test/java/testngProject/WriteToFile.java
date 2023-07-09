package testngProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {  
  public static void main(String[] args) {  
    try {  
      File file = new File("D://data.txt");
      FileWriter myWriter = new FileWriter(file);
      myWriter.write("Files \nhello");
      myWriter.write("Second \nhello");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
      
      long initialTime = System.currentTimeMillis();
      
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      
      
      Scanner sc = new Scanner(fr);
      while(sc.hasNext())
    	  System.out.println(sc.nextLine());
      
      while(br.ready())
    	  System.out.println(fr.read());
      
      while(br.ready())
    	  System.out.println(br.readLine());
      
      System.out.println("Time taken : "
              + (System.currentTimeMillis()
                 - initialTime));
      fr.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
} 
