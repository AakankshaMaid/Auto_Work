package Types_of_variables;

public class Global_static1_variable {
	
	static int a=20;      //global static variable
	
	public static void main(String[] args) {
		System.out.println(a);       //global static variable call from same class
		                                 //          =variable name
	}
	public static void m1()
	{                   //variable name=a
		System.out.println(a);      
	}
	public void m2()
	{
		System.out.println(a);
	}

}
