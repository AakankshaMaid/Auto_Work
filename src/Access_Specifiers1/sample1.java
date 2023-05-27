package Access_Specifiers1;

public class sample1 {
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
		sample1 s1=new sample1();
		s1.m1();
		num1=a;
		num2=b;
		System.out.println(a+b);
	}
	public void m3(int a,int b,int c)
	{
		sample1 s2=new sample1();
		s2.m2(10,20);
		num1=a;
		num2=b;
		num3=c;
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		sample1 s3=new sample1();
		s3.m3(10,20,30);
	}
	

}
