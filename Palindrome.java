import java.util.Scanner;
public class Palindrome 
{
 public static void main (String[]args)
 {
	 Scanner sc = new Scanner (System.in);
	 int i,len,flag=0;
	 System.out.println("Enter the string");
	 String str = sc.nextLine();
	 len=str.length();
	 for(i=0;i<len/2;i++);
	 { 
		 if (str.charAt(i)!=str.charAt(len-i-1))
		 {
			 flag=1;
		 }
     
	     if (flag==0)
	     {
	    	 System.out.println("It is a Palindrome");
	     }
	     else
	     {
	    	 System.out.println("It is not a palindrome");
	     }
	 }   
  }
}
