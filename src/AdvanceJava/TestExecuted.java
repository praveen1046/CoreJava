package AdvanceJava;


interface Testing{
	
	void test();

}



class Test2 implements Testing{
	
	public void test() {
		System.out.println("This method");
	}
	
}

class Test3 implements Testing{
	
	static Test3 t = null;
	
	private Test3() {
				
	}
	
	public static Test3 getObject() {
		
		if(t==null)
			return t = new Test3();
		else
			return t;
		
	}
	
	public void test() {
		System.out.println("This is TEst3");
	}
}


public class TestExecuted{
	
	
	public static void main(String[] ar) {
		System.out.println("klhf");
		
		
		Testing t = Test3.getObject();
		
		t.test();
		
	}
	
}

