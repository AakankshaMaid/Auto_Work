package Polymorphism;
//sub class  method overriding 
public class Runtime_polymorphism2 extends Runtime_polymorphism
{
	public void m3()
	{
		System.out.println("bike");
	}
	public void m1()
	{
		System.out.println("2BHK");    //method overriding
	}
	public void m2()
	{
		System.out.println("kia car");  //method overriding 
	}
	
	public static void main(String[] args) 
	{
		Runtime_polymorphism2 s1=new Runtime_polymorphism2();
		s1.m1();
		s1.m2();
		s1.m3();
	}

}
