package method;

public class sample5 {
	public static void main(String[] args) {
		System.out.println("rushi");
		sample5 xyz = new sample5();   //non static regular method call from same class
		xyz.m3();    
		xyz.m4();
		sample3 pqr = new sample3();    //non static regular method call from different class
		pqr.m1();
		pqr.m2();	
		
	}
	public void m3()
	{
		System.out.println("hello");
	}
	public void m4()
	{
		System.out.println("akki");
	}

}
