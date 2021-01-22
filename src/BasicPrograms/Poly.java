package BasicPrograms;

public class Poly {
	public static void main(String[] args) {
		int num=125;
		int temp=num;
		int rev=0,rem;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev)
		{
			System.out.println("polyndrome");
		}
		else
		{
			System.out.println("not polyndrome");
		}
	}

}
