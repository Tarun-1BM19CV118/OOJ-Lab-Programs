/* 8. Write a program that demonstrates handling of exceptions in inheritance tree. 
Create a base class called "Father" and derived class called "Son" which extends 
the base class. In Father class, implement a constructor which takes the age and 
throws the exception Wrong Age( ) when the input age=father’s age. */


import java.util.*;
class WrongAge extends Exception
{
	public String toString()
	{
		return "Exception - INVALID AGE ";
	}
}
class Father
{
	int father_age;
	Father(int a) throws WrongAge
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Father's age :");
		father_age=sc.nextInt();
		if(father_age<=a)
		{
			throw new WrongAge();
		}
		else
		{
			System.out.println("VALID AGE");
			System.out.println("Father's age = "+father_age);
			System.out.println("Son's age = "+a);
		}
	}
}
class Son extends Father
{
	int son_age;
	Son(int a) throws WrongAge
	{
		super(a);
		son_age=a;
	}
}
class Main
{
	public static void main(String Args[])
	{
		System.out.println("Enter son'age :");
		try
		{
			Son s1=new Son(new Scanner(System.in).nextInt());
		}
		catch(WrongAge e)
		{
			System.out.println(e);
		}
	}
}
