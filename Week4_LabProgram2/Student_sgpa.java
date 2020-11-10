/*Develop a Java program to create a class Student with members usn, name, an array
credits and an array marks. Include methods to accept and display details and a method to
calculate SGPA of a student.*/
import java.util.*;
import java.util.Scanner;
class Student
{
	String usn;
	String name;
    int credits[] ;
	int marks[];
	int gpa[];
	int i,n;
    void accept()
	{
		Scanner xx = new Scanner(System.in);
		System.out.println("Enter the number of subjects");
		n=xx.nextInt();
		credits= new int[n];
		marks = new int[n];
		gpa= new int[n];
		System.out.println("ENTER STUDENT DETAILS \n");
		System.out.println("Enter student USN");
		usn=xx.next();
		System.out.println("Enter student name");
		name=xx.next();
		System.out.println("Enter student marks in "+n+" subjects");
		for(i=0;i<n;i++)
		{
			System.out.println("Enter credits of subject "+ (i+1));
			credits[i]=xx.nextInt();
			System.out.println("Enter marks of subject "+ (i+1));
			marks[i]=xx.nextInt();
		}
	}	
	void display()
	{
		System.out.println("\nSTUDENT NAME = "+ name);
		System.out.println("\nUSN = "+usn+"\n");
		for(i=0;i<n;i++)
		System.out.println("credits for subject "+(i+1)+" = "+credits[i]+"\t"+"marks in subject "+(i+1)+" = "+marks[i]+ "\t" + "gpa = "+gpa[i]);
	}
	void calcsgpa()
	{
		int totalcredits=0;
		int totalmarks=0;
	    float sgpa;
		for(i=0;i<n;i++)
		totalcredits=totalcredits+credits[i];
	    for(i=0;i<n;i++)
		{
			if(marks[i]>=90&&marks[i]<=100)
				gpa[i]=10;
			else if(marks[i]>=80&&marks[i]<90)
				gpa[i]=9;
			else if(marks[i]>=70&&marks[i]<80)
				gpa[i]=8;
			else if(marks[i]>=60&&marks[i]<70)
				gpa[i]=7;
			else if(marks[i]>=50&&marks[i]<60)
				gpa[i]=5;
			else if(marks[i]>=40&&marks[i]<50)
				gpa[i]=4;
			else
			    gpa[i]=0;
		}
        for(i=0;i<n;i++)
		{
			totalmarks=totalmarks+(credits[i]*gpa[i]);
		}			
		sgpa=(float)totalmarks/totalcredits;
		System.out.println("\n\nSGPA = "+sgpa);
	}
}
class main
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.accept();
		s1.calcsgpa();
		s1.display();
	}
}
