package Constructor;
//user defined multiple constructor call--->Constructor overloding

public class Multiple_constructor {
	int num1;
	int num2;
	String name;
	
	Multiple_constructor()   //user defined constructor with zero parameter call
	{
		num1=10;
		num2=20;
	}
	Multiple_constructor(int a,int b) //user defined constructor with parameter call
	{
		num1=a;
		num2=b;		
	}
	Multiple_constructor(String stdName) //user defined constructor with string parameter call
	{
		name=stdName;
	}
	public void add() 
	{
		System.out.println(num1+num2);
	}
	public void multi() 
	{
		System.out.println(num1*num2);
		
	}
	public void name() 
	{
		System.out.println(name);
	}
	public static void main(String[] args) {
		Multiple_constructor s1=new Multiple_constructor();
		s1.add();
		Multiple_constructor s2=new Multiple_constructor(6,6);
		s2.multi();
		Multiple_constructor s3=new Multiple_constructor("Aakanksha");
		s3.name();
		
	}
	

}
