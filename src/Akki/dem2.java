package Akki;

public class dem2  extends demo1{
	public void m2()
	{
		System.out.println("displaying result subclass");
		super.m1();  //we can call method using super keyword
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		dem2 d=new dem2();
		d.m2();
		
	}

}
