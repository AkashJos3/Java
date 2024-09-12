

import java.util.Scanner;

class Employee{
	String name;
	int age;
	String address;
	long phonenumber;
	double salary;
	Employee(String name1,int age1, String address1,long phonenumber1,double salary1)
	{
		name=name1;
		age=age1;
		address=address1;
		phonenumber=phonenumber1;
		salary=salary1;
	}
	void printEmployee() {
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("Address "+address);
		System.out.println("Phone number: "+phonenumber);
	}
	void printsalary() {
		System.out.println("Salary "+salary);
	}
	
}
class Officer extends Employee{
	String specification;
	Officer(String name1, int age1, String address1, long phonenumber1, double salary1,String specification1) {
		super(name1, age1, address1, phonenumber1, salary1);
		specification=specification1;
	}
	void printSpecification() {
		System.out.println("Specification= "+specification);
	}
}
class Manager extends Officer{
String department;
	Manager(String name1, int age1, String address1, long phonenumber1, double salary1, String department1) {
		super(name1,age1,address1,phonenumber1,salary1,department1);
		department=department1;
		
	}
	void printdepartment() {
		System.out.println("Department= "+department);
	}
}
public class Inheritance {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int age;
	String name,address,specification,department;
	double salary;
	long phonenumber;
	System.out.println("enter the details of Officer ");
	System.out.println("Enter the name ");
	name= sc.nextLine();
	System.out.println("Enter the age ");
	age= sc.nextInt();
	System.out.println("Enter the Address ");
	address=sc.next();
	System.out.println("enter the phone number ");
	phonenumber=sc.nextInt();
	System.out.println("enter the salary ");
	salary =sc.nextDouble();
	System.out.println("enter the specification ");
	specification=sc.next(); 
	Officer o=new Officer(name,age,address,phonenumber,salary,specification);
	
	System.out.println("enter the details of Manager ");
	System.out.println("Enter the name ");
	name= sc.next();
	System.out.println("Enter the age ");
	age= sc.nextInt();
	System.out.println("Enter the Address ");
	address=sc.next();
	System.out.println("enter the phone number ");
	phonenumber=sc.nextInt();
	System.out.println("enter the salary ");
	salary =sc.nextDouble();
	System.out.println("enter the Department ");
	department=sc.next();
	Manager m= new Manager(name,age,address,phonenumber,salary,department);
	
	System.out.println("Details of Officer ");
	o.printEmployee();
	o.printsalary();
	o.printSpecification();
	
	System.out.println("Details of Manager ");
	m.printEmployee();
	m.printsalary();
	m.printSpecification();
}
}