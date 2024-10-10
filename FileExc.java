package javalab;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.io.File;
public class FileExc

{
  public static void main(String []args)
  {
	  try
	  {
		  Scanner sc = new Scanner(System.in);
		  File f1= new File("Register2.txt");
		  f1.createNewFile();
		  System.out.println("FILE CREATED");
		  
		  
		  FileWriter fout = new FileWriter("Register2.txt");
		  System.out.println("Enter KEAM rank Number: ");
		  int n = sc.nextInt();
		  fout.write(n+"\n");
		  fout.close();
		  
		  FileReader obj3 = new FileReader("Register2.txt");
		  BufferedReader br = new BufferedReader(obj3);
		  String line;
		  System.out.println("Contents of file are");
		  while((line = br.readLine())!=null)
		  {
			  System.out.println(line);
		  }
		  br.close();
		 // obj2.close();
		  //obj3.close();
	  }
	  catch(IOException e)
	  {
		  System.out.println("Exception occured"+e.getMessage());
	  }
  }
 }


