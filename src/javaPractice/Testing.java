package javaPractice;

interface cost
{
	void kg(int kg);
	void total(double total);
	
}

abstract class AbstarctFish implements cost
{
	public void total(double total)
	{
		System.out.println("this is total fish amount:"+total);
	}
}

class FishMeat extends AbstarctFish
{
	 public void kg(int kg) {
		int bill =50*kg;
		total( bill);
	}
}

class Meat extends AbstarctFish
{
	public void kg(int kg) {
		int meatbill=500*kg;
		total(meatbill);
	}
}




public class Testing
{
	public static void main(String[] args ) {
		FishMeat f = new FishMeat();
		f.kg(5);
		Meat m = new Meat();
		m.kg(6);
				
	}
}
















