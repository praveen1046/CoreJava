package AdvanceJava;

public class New {
	public static void main(String[] args)
	{
		try
		{
			Class c = Class.forName("ClassMadhu");
			System.out.println(c);
		}
		catch(ClassNotFoundException ex){
			ex.printStackTrace();
			
		}
		
	}


}
