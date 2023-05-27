package Interface_implementation_class;
// sub class
//implements class
public class sample2 implements sample1
{
	public void m1()
	{
		System.out.println("m1 method complete in implements class");
	}
	
	public void m2()
	{
		System.out.println("m2 method complete in inplements class");
	}
	
	
	public static void main(String[] args) 
	{
		sample2 s2=new sample2();
		s2.m1();
		s2.m1();
	}

}
