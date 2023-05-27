package this_super_keyword;
//sub class
public class demo2 extends demo1{
	public void m2()
	{
		System.out.println("running subclass method");
		
		super.m1();  //calling superclass method block statements using super keyword
		
		System.out.println(super.a); //calling superclass global variable
	}
	
	
	public static void main(String[] args) {
		demo2 d=new demo2();
		d.m2();
	}

}
