package Constructor;

public class Cunstructor_chaining {
	
	int num1;
	int num2;
	int num3;
	
	Cunstructor_chaining()
	{
		num1=10;
		num2=20;
		System.out.println(num1+num2);
	}
	Cunstructor_chaining(int a,int b)
	{
		this();   //using this keyword we are chaining the cunstructor
		num1=a;
		num2=b;
		System.out.println(num1-num2);
	}
	Cunstructor_chaining(int a,int b,int c)
	{
		this(20,30);  //we are overload this keyword for output
		num1=a;
		num2=b;
		num3=c;
		System.out.println(num1+num2+num3);
	}
	public static void main(String[] arg) {
		Cunstructor_chaining c1=new Cunstructor_chaining(40,50,60);
		
	}

}
