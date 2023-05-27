package this_super_keyword;
//this keyword use
public class sample1 
{
	int num1=20;  //global variable
	
	public void m1()
	{
		int num1=60;   //local variable
		System.out.println(num1);
		System.out.println(this.num1);   //global and local variable name same that time use this keyword
	}
	public static void main(String[] args)
	{
		sample1 s1=new sample1();
		s1.m1();
		
		
	}

}
// to access global variable from same class with same variable name use this keyword
