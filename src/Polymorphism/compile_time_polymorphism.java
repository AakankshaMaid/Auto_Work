package Polymorphism;
//method overloading 

public class compile_time_polymorphism 
{
	public void addition(int a,int b)
	{
		System.out.println(a+b);
	}
	public void addtion(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public void addition (int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}
	
	public static void main(String[] args)
	{
		compile_time_polymorphism s1=new compile_time_polymorphism();
		s1.addition(10, 20);
		s1.addtion(5, 6, 7);
		s1.addition(40, 10, 50, 30);
	}

}        //many method with same method and same method name with different data type is method overloading
