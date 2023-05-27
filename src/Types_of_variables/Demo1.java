package Types_of_variables;

public class Demo1 {
	int num=20;
	
	public static void main(String[] args) {
		Demo1 xyz=new Demo1();
		System.out.println(xyz.num);
		
		m1();
		xyz.m2();
		
	}
	public static void m1()
	{
		Demo1 xyz=new Demo1();
		System.out.println(xyz.num);
		System.out.println("name");
	}
	public void m2()
	{
		System.out.println(num);
	}

}
