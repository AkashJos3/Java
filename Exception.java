package javalab;
import java.util.Scanner;
public class Exception
    {
      public static void  main (String[]args)
      {
    	  int choice;
    	  int ch=3;
    	  do {
      Scanner scanner = new Scanner(System.in);
      System.out.println("choose an operator");
      System.out.println("1.Arithemetic operation");
      System.out.println("2.Array Access ");
      System.out.println("3.Exit");
      choice=scanner.nextInt();
      
      switch (choice)
       {
      case 1:
    	  try {
    		  System.out.println("Enter the Numerator: ");
    		  int numerator = scanner.nextInt();
    		  System.out.println("Enter denominator: ");
    		  int denominator = scanner.nextInt();
    		  int result =numerator/denominator ;
    		  System.out.println("Result: " + result);
    	      }
    	  catch (ArithmeticException e) 
    	  { 
    		  System.out.println("Caught an exception: " + e.getMessage()); 
    	  }
    	  break;
      case 2:
      int[]number= {1,2,3};
       try
       {
    	   System.out.println("Enter array index to access");
    	   int index=scanner.nextInt();
    	   System.out.println("Element at index " + index + ": " + number[index]);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
    	   System.out.println("Caught an exception: " + e.getMessage());
       }
       break;
      case 3:
    	  System.out.println("Exiting");
    	  break;
      default:
          System.out.println("Invalid choice. Please select 1 or 2.");
          break;
  } 
      }
     while (ch!=0);
    	  //scanner.close();
      }
    }
