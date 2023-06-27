package $$Practice$$;

public class demo {
	static int a=50;
	
	public static void m1()
	{
		
		System.out.println(a);
	}
	public void m2()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		m1();
		demo d=new demo();
		d.m2();
	}
}
