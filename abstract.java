/*Develop a Java program to create an abstract class named Shape that contains two integers 
and an empty method named printArea( ). Provide three classes named Rectangle, Triangle and
Circle such that each one of the classes extends the class Shape. Each one of the classes 
containonly the method printArea( ) that prints the area of the given shape.*/

import java.util.Scanner;
abstract class Shape
{
	Double a,b;
	abstract void printArea();
} 
class Rectangle extends Shape
{
	Double x,y;
	Rectangle(Double a,Double b)
	{x=a;y=b;}
	void printArea()
	{
		System.out.println("Area of the Rectangle = "+ (x*y));
	}
}
class Triangle extends Shape
{
	Double x,y;
	Triangle(Double a,Double b)
	{x=a;y=b;}
	void printArea()
	{
		System.out.println("Area of the Triangle = "+ (0.5*x*y));
	}	
}
class Circle extends Shape
{
	Double r;
	Circle(Double a)
	{r=a;}
	void printArea()
	{
		System.out.println("Area of the Circle = "+ (3.14*r*r));
	}	
}
class abstractarea{
	public static void main(String[] args)
	{
		Scanner xx=new Scanner(System.in);
		Double w,x,y,z,p;
		System.out.println("Enter length and width of rectangle");
		w=xx.nextDouble();
		x=xx.nextDouble();
		Rectangle R= new Rectangle(w,x);
		R.printArea();
		System.out.println("Enter height and base of triangle");
		y=xx.nextDouble();
		z=xx.nextDouble();
		Triangle t = new Triangle(y,z);
		t.printArea();
		System.out.println("Enter the radius of circle");
		p=xx.nextDouble();
		Circle c = new Circle(p);
		c.printArea();
	}	
}

