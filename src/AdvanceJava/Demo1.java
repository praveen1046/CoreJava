package AdvanceJava;

public class Demo1 {

	void one()
	{
		System.out.println("one");
	}
	int Two(int  m)
	{
	
		return m;
		
		
	}
}
class Demo2
{
	void three(int a)
	{
		System.out.println("three");
	}
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		
		Demo1 d1 = new Demo1();
		d1.Two(2);
	 
		int  m =  d1.Two (2);
		System.out.println(m);
		
	}
}
