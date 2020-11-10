/*Create a class Book which contains four members: name, author, price,num_pages. 
Include a constructor to set the values for the members. Include
methods to set and get the details of the objects. Include a toString( ) method
that could display the complete details of the book. Develop a Java program to
create n book objects.
*/
import java.util.Scanner;
class Book
{
	String name;
	String author;
	float price;
	int num_pages;
	Scanner ss = new Scanner(System.in);
	Book()
	{
		name = "";
		author = "";
		price = 0.0f;
		num_pages = 0;
	}
	void accept()
	{
		System.out.println("Enter the book NAME :");
		name = ss.next();
		System.out.println("Enter the AUTHOR of the book :");
		author = ss.next();
		System.out.println("Enter the PRICE of the book :");
		price = ss.nextFloat();
		System.out.println("Enter the NUMBER OF PAGES in the book :");
		num_pages = ss.nextInt();
	}
	public String toString()
	{
		return(name+"\t\t"+author+"\t\tRs."+price+"\t\t"+num_pages);
	}
}
class Booksmain
{
	public static void main(String[] args)
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("\nEnter the number of books :");
		int n = ss.nextInt();
		Book b[] = new Book[n]; 
		for(int i = 0; i < n; i++)
		{
			b[i] = new Book();
			System.out.println("\nENTER THE DETAILS OF BOOK "+(i+1)+"\n");
			b[i].accept();
			System.out.println("\n\n");
		}
		System.out.println("<---------------DETAILS OF ALL BOOKS--------------->\n");
		System.out.println("\nNAME\t\tAUTHOR\t\tPRICE\t\tNUMBER OF PAGES\n");
		for(int i = 0; i < n; i++)
		{
			System.out.println(b[i]);
		} 
	}
}
