package javaPractice;

interface Members
{
	void artist(int artist);
	void sideactres(int sideactres);
	
}
abstract class abstarctMovie implements Members
{
	 public void artist(int artist)
	{
		System.out.println("this is my movie artists:"+artist);
	}
}
class 	New extends abstarctMovie
{
	public void sideactres(int sideactres)
	{
		int artist=10*sideactres;
		artist(artist);
		
	}
}


public class Movie {
	public static void main(String[] args)
	{
		New n = new New();
		n.sideactres(10);
	}

}
