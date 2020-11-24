package CIE;
import java.util.Scanner; 
public class Student
{
	public String usn;
	public String name;
	public int sem;
	Scanner xx=new Scanner(System.in);
	public void Student()
	{
		System.out.println("Enter Student's USN : ");
		usn=xx.next();
		System.out.println("Enter Student's NAME : ");
		name=xx.next();
		System.out.println("Enter Student's SEMESTER : ");
		sem=xx.nextInt();
	}
}
