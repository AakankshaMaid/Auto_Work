package Abstract_councrete_class;
// concrete class 
//sub class
public class sample2 extends sample1

{
	public void m3()
	{
		System.out.println("hii");   //abstract method completed in concrete class
	}
	public void m4()
	{
		System.out.println("hello");  //abstract method completed in concrete class

	}
//	public void m1()  //method decleration
//	{
//		System.out.println("method m1 complete in abstract class");  //method defination
//	}
//	public void m2()
//	{
//		System.out.println("method m2 complete in abstract class");
//	}
	
	public static void main(String[] args) {
		sample2 s2=new sample2();
		s2.m1();
		s2.m2();
		s2.m3();
		s2.m4();
	}


}
