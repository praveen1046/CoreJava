package javaPractice;

interface Bill
{
		void amount(int amount);
		void total(double total);

}


 abstract  class AbstarctBalance implements Bill{
	 public  void total(double total) {
		System.out.println("the total balanceis:"+total);
	}
}

 class Demo1 extends AbstarctBalance
{
	 public void amount(int amount)
	{
		
		int  total=4*amount;
		
		total(total);
		
		
	}
}
 
 class Demo
 {
	 public static void main(String[] args) {
		 Demo1 d = new Demo1();
		 d.amount(12);
		 
	 }
	 
 }

