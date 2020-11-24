package SEE;

import CIE.*;
import java.util.Scanner;
public class Externals extends CIE.Student
{
	Scanner xx=new Scanner(System.in);
	public Double see[]=new Double[5];
	int j;
	public void Externals()
	{
	for(j=0;j<5;j++)
	{
		System.out.println("Enter the Externals marks scored in subject "+(j+1));
		see[j]=xx.nextDouble();
		see[j]=see[j]/2;
	}
	}
}
