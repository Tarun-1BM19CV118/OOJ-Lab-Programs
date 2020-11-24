/*Create a package CIE which has two classes- Student and Internals. The
class Student has members like usn, name, sem. The class Internals(derived class of 
student) has an array that stores the internal marks scored in five courses of the 
current semester of the student. Create another package SEE which has the class
External which is a derived class of Student. This class has an array that
stores the SEE marks scored in five courses of the current semester of the
student. Import the two packages in a file that declares the final marks of n
students in all five courses.*/

import CIE.*;
import SEE.*;
import java.util.Scanner;
class finalmarks
{
	public static void main(String[] args)
	{
		int m,k;
		Scanner xx=new Scanner(System.in);
		System.out.println("Enter the number of students");
		m=xx.nextInt();
		CIE.Internals i[]=new CIE.Internals[m];
		SEE.Externals e[]=new SEE.Externals[m];
		for(k=0;k<m;k++)
		{
			i[k] = new CIE.Internals();
			e[k] = new SEE.Externals();
			System.out.println("ENTER DETAILS OF STUDENT "+(k+1));
			e[k].Student();
			i[k].Internals();
			e[k].Externals();
		}

		  for(k=0;k<m;k++)
		  {
			for(int l=0;l<5;l++)
		  	System.out.println("Total marks of Student "+(k+1)+" in Subject "+(l+1)+" = "+(i[k].marks[l] + e[k].see[l]));
		  }
	
	}
}
