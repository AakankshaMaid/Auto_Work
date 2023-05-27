package Constructor;

public class User_definend_constructor1 {
	int num1;   //step1:variable declaration
	int num2;
	
	User_definend_constructor1()  //user defined cunstructor--->use-1.give the value in declaration num
	{                                                          //   2.copy whole data from the class
		 num1=10;  //step2:variable initialization
		 num2=20;
	}
	
	public void add()
	{
		System.out.println(num1+num2);  //step3: variable use
	}
	public void sub()
	{
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args) {
		User_definend_constructor1 xyz=new User_definend_constructor1();
		xyz.add();
		xyz.sub();
		User_definend_constructor2 abc=new User_definend_constructor2();
		abc.sub();                     //user defined cunstroctor call from diff class
				
		
	}
	
	
	

}
