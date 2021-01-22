package AdvanceJava;




class Checking2{
	
	
	Checking2  madhu(Checking2 x)
	{
			return x;
	}
	
}

public class Checking {
	
	public static void main(String[] args)
	{
		
		Checking2 c = new Checking2();
		Checking2 x = c.madhu(new Checking2());
		System.out.println(x);
	
	}
		
	
}
