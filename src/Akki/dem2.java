package Akki;

public class dem2  {
	
	{
		System.out.println("nonstatic block running");
	}
	 public static void main(String[] args) 
	 {
		 
		 
		System.out.println("main method running");
		dem2 d=new dem2();
	}
	 static
	 {
		 System.out.println("static block is running");
	 }
	
	
}
