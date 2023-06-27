package Akki;

public class BLOCK {
	//non static block
	{
		System.out.println("running non static block");
	}
	public static void main(String[] args) {
		BLOCK b=new BLOCK();
		System.out.println("running main method");
	}
	 //static block
	static
	{
		System.out.println("running static block");
	}

}
