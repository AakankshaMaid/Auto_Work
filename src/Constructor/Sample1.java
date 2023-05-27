package Constructor;

public class Sample1 {
	static int num1;
	 int num2;
	
	Sample1()
	{
		num1=10;
		num2=20;
	}
	public static void m1()
	{
		Sample1 d1=new Sample1();
		System.out.println(num1+d1.num2);
	}
	public void m2() {
		System.out.println(num1-num2);
	}
	public static void main(String[] args) {
		m1();
		Sample1 s1=new Sample1();
		s1.m2();
	}

}
