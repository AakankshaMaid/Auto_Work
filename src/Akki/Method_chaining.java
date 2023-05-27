package Akki;

public class Method_chaining {
	
		int num1;
		int num2;
		int num3;
		public void m1()
		{
			num1=50;
			num2=60;
			System.out.println(num1+num2);
		}
		public void m2(int a,int b)
		{
			Method_chaining s1=new Method_chaining();
			s1.m1();
			num1=a;
			num2=b;
			System.out.println(a+b);
		}
		public void m3(int a,int b,int c)
		{
			Method_chaining s2=new Method_chaining();
			s2.m2(10,20);
			num1=a;
			num2=b;
			num3=c;
			System.out.println(a+b+c);
		}
		public static void main(String[] args) {
			Method_chaining s3=new Method_chaining();
			s3.m3(10,20,30);
		}
		

	}



