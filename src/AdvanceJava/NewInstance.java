package AdvanceJava;

public class NewInstance {
	 static {
		 System.out.println("this is madhu royal");
	 }
	 {
		 System.out.println("this is poldasu ");
	 }
	 public static void main(String[] args) throws IllegalAccessException {
		 try
		 {
			 System.out.println("this is new iNSTANACE");
			 Class c = Class.forName("NewInstance");
			 Object ob = c.newInstance();
			 
			 
		 }
		 catch(ClassNotFoundException ex)
		 {
			 ex.printStackTrace();
		 }
		 catch(InstantiationException ep)
		 {
			 ep.printStackTrace();
		 }
	 }

}
