/*Develop a Java program to create a class Bank that maintains two kinds of account for its
customers, one called savings account and the other current account. The savings account
provides compound interest and withdrawal facilities but no cheque book facility. The current
account provides cheque book facility but no interest. Current account holders should also
maintain a minimum balance and if the balance falls below this level, a service charge is
imposed. Create a class Account that stores customer name, account number and type of
account. From this derive the classes Curr-acct and Sav-acct to make them more specific to
their requirements. Include the necessary methods in order to achieve the following tasks: •
Accept deposit from customer and update the balance. • Display the balance. • Compute and
deposit interest • Permit withdrawal and update the balance • Check for the minimum balance,
impose penalty if necessary and update the balance*/     
// taken mimbal=1000Rs,pentalty=100Rs 
import java.util.*;
import java.util.Scanner;
class Account
{
	String cuname;
	int accnum;
	Double deposite,balance=500.00;
	Scanner xx=new Scanner(System.in);
	void Accept()
	{   System.out.println("Enter customer name and account number ");
	    cuname =xx.nextLine();
		accnum=xx.nextInt();
		System.out.println("Enter the money to be deposited");
		deposite=xx.nextDouble();
		balance=deposite+balance;
	}
	void Display()
	{
		System.out.println("CUSTOMER NAME = "+ cuname);
		System.out.println("ACCOUNT NUMBER = "+ accnum);
		System.out.println("Balance ="+balance);
	}
	
}
class CurrAcc extends Account
{
	void check()
	{
		if(balance<1000)
		{
			System.out.println("The account do not have the minimun balance so 100Rs penalty is taken");
		    balance=balance-100;
			System.out.println("The balance amount = " + balance);
		}
	}
}
class SavAcc extends Account
{
	
	void comInt()
	{
		Double Cint;
		System.out.println("5% of interset is given ");
		Cint = (0.5*balance);
		balance=Cint+balance;
		System.out.println("Balance= "+balance);
	}
	void withdrawal()
	{   Double witam;
		System.out.println("Enter the amount which needs to be withdrawal");
	    witam=xx.nextDouble();
        balance=balance - witam;
		System.out.println("The balance amount = "+balance);
	}
}

class bank
{
	public static void main(String[] args)
	{   int a;
	    int b;
	    Scanner xx=new Scanner(System.in);
		CurrAcc c1  = new CurrAcc();
		SavAcc s1 = new SavAcc();
        System.out.println("1.Current Account \n2.Saving Account");
        a=xx.nextInt();
        if(a==1)
		{	A
            System.out.println("This account provides cheque book facility but not interest");	
            c1.Accept();
            c1.Display();
            c1.check();
		}			
        else
		{
			System.out.println("This account provides compound interest and withdrawal facilities but no cheque book facility");
		    s1.Accept();
            s1.Display();
            s1.comInt();
			System.out.println("Do you want to withdraw \n1.Withdrawal \n2.balance");
		    b=xx.nextInt();
			if(b==1)
            s1.withdrawal();
            else
            s1.Display();	
		}		
	}
}
