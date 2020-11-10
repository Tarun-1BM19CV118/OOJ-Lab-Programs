import java.util.*;
import java.util.Scanner;
class quadeqn
{
 public static void main(String ss[]){
   float a,b,c;
   float x1,x2,D;
   Scanner xx = new Scanner(System.in);
   System.out.println("Enter the value of a,b and c");
   a=xx.nextInt();
   b=xx.nextInt();
   c=xx.nextInt();
   D=((b*b)-(4*a*c));
   if(D==0)
   {
     x1=(-b/(2*a));
     x2=x1;
     System.out.println("Roots are real and equal \nThe roots of the equation are : "+x1+" and "+x2);
   }
   else if(D>0)
   {
     x1=(float)((-b) + Math.sqrt(D)) / (2 * a);
	 x2=(float)((-b) - Math.sqrt(D)) / (2 * a);
	 System.out.println("Roots are real and distinct \nThe roots of the equation are : "+x1+" and "+x2);
   }
   else
   System.out.println("There are no real solutions");
 }
}
