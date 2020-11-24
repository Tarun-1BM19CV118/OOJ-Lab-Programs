package CIE;

import java.util.Scanner;
public class Internals extends Student
{
	public Double marks[]=new Double[5];
	int i;
	public void Internals()
	{
	for(i=0;i<5;i++)
	{
		System.out.println("Enter the Internals marks scored in subject "+(i+1));
		marks[i]=xx.nextDouble();
	}
	}
}
