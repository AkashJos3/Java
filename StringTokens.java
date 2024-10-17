package javalab;
import java.util.StringTokenizer;
import java.util.Scanner;
public class StringTokens 
{
    public static void main(String[]args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the numbers with one space gap: ");
    	String s=sc.nextLine();
    	int sum=0;
        System.out.println("Integers are: ");
    	StringTokenizer st=new StringTokenizer(s);
    	while(st.hasMoreTokens())
    	{
    		String plus=st.nextToken();
    		int n=Integer.parseInt(plus);
    		System.out.println(n);
    		sum=sum+n;
    		sc.close();
    	}
    	System.out.println("sum of all Integers are"+sum);
    }
}
