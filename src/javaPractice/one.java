package javaPractice;

interface Price
{
	void Liter(int Liter);
	void amount(double amount);
}

abstract class abstractDiesel implements Price
{
	public void amount(double amount )
	{
		System.out.println("this is total diesel & petrol amount:"+amount);
	}
}
class petrol extends abstractDiesel
{ 
	public void Liter(int Liter)
	{
		int total = 3*Liter;
		amount(total);
	}
	
}
class Diesel extends abstractDiesel
{
	public void Liter(int Liter)
	{
		int total = 7*Liter;
		amount(total);
		
	}
}

public class one {
	public static void main(String[] args )
	{
		Diesel d = new Diesel();
		d.Liter(81);
		petrol p = new petrol();
		p.Liter(75);
		
	}
	
}
