package method;

public class sample6 {
	public static void main(String[] args) {
		m1(15,30);    //static method call from same class with parameters
		m1(10,20);
		m1(15,15);
		sample6 xyz=new sample6();   //non static method call from same class with parameters
		xyz.m2(15,17);
		xyz.m2(12,11);
		xyz.m2(55,65);	
	}
	
	                 
	public static void m1(int num1,int num2)  //static regular method with parameters
	                  //declaration of variable
	{
		System.out.println(num1+num2);
		                   //logic
	}
	public void m2(int num1,int num2)    //non static regular method with parameter
	{
		System.out.println(num1+num2);
		
	}
	
}
