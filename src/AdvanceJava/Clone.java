package AdvanceJava;

 class Clone implemnts  {
	  String s  ="madhu";
	  public static void main(String[] args) throws CloneNotSupportedException
	  {
		  Clone c = new Clone();
		  System.out.println(c);
		  System.out.println(c.s);
		  Object ob = c.clone();
		  Clone c1 = (Clone) ob;
		  c1.s="deep";
		  System.out.println(c.s);
		  System.out.println(c1.s);
		 
		  
		  
	  }
}
