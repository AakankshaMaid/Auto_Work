package Constructor;   //example: user defined constructor with parameter

public class User_defined_constr_with_parameter {
	//step1: declaration of variable
	int num1;          
	int num2;
	//step2: initialization using constructor 
	User_defined_constr_with_parameter( int a,int b) //user defined constructor with 2 int parameter(local variable decleard)
	{                                                //use= 1) TO initialize global variable
		                                             //     2) copy all the member of class into object
		num1=a;
		num2=b;
	} 
	//step3:use variable
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void sub()
	{
		System.out.println(num1-num2);
	}
	public static void main(String[] args) {
		User_defined_constr_with_parameter xyz=new User_defined_constr_with_parameter(45,35);
		xyz.add();
		xyz.sub();
		User_defined_constr_with_parameter abc=new User_defined_constr_with_parameter(80,70);
		abc.add();
		abc.sub();	
		System.out.println("-------------------");
		//user defined constructor with parameter call from diff class
	    User_defined_constr_with_parameter2 pqr=new  User_defined_constr_with_parameter2(10,20);
	    pqr.add();
	    
	}

}
