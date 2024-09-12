import java.util.Scanner;
class maths{
    void area(double r){
        System.out.println("the area of a circle is "+(3.14*r*r));
    } void area(int a,int b){
        System.out.println("the area of a rectangle is "+(a*b));
    }void area(double x,double y){
        System.out.println("the area of triangle is "+(0.5*x*y));
    }
}
public class Methodoverloading1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of r");
       double r=sc.nextDouble();
		System.out.println("enter the value of a and b");
       int  a=sc.nextInt();
	   int  b=sc.nextInt();
		System.out.println("enter the value of x and y");
       double x=sc.nextDouble();
	   double y=sc.nextDouble();
		maths h=new maths();
		h.area(r);
		h.area(a,b);
		h.area(x,y);
    }
}
