package javalab;
import java.util.Scanner;
class Table
{
	void printTable(int n)
	{
	   synchronized(this)
	   {
		   for(int i =1;i<=10;i++)
		   {
			   System.out.println(n+ "*" + i + "=" );
		   }
	   }
	}
}
class mythread1 extends Thread
{
	Table t;
	int n;
	mythread1(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(n);
	}
}
 class mythread2 extends Thread
 {
	 Table t;
	 int n;
	 mythread2(Table t)
	 {
		 this.t =t;
	 }
	 public void run()
	 {
		 t.printTable(n);
	 }
 }


public class ThreadSync {
	public static void main(String args[])
	{
		Table t= new Table();
		Scanner sc =new Scanner(System.in);
		mythread1 t1 = new mythread1(t);
		mythread2 t2 = new mythread2(t);
		System.out.println("Enter the number");
		t1.n= sc.nextInt();
		System.out.println("Enter the second number");
		t2.n =sc.nextInt();
		
		t1.start();
		t2.start();
	}
	}

