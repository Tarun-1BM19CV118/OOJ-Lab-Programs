/* 7. Write a program to demonstrate generics with multiple object parameters. */

class TwoGen<A , B> 
{
	A ob1;
    B ob2;
	TwoGen(A o1 , B o2) 
	{
		ob1 = o1;
		ob2 = o2;
	}
	
	void showTypes() 
	{
		System.out.println("Type of A is " +ob1.getClass().getName());
		System.out.println("Type of B is " +ob2.getClass().getName());
	}
	A getob1() 
	{
		return ob1;
	}
	B getob2() 
	{
		return ob2;
	}
}
class Generics 
{
	public static void main(String args[])
	{
		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(15, "Generics");
		tgObj.showTypes();
		int x = tgObj.getob1();
		System.out.println("value: " + x);
		String str = tgObj.getob2();
		System.out.println("value: " + str);
	}
}
