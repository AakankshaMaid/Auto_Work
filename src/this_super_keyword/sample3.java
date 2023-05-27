package this_super_keyword;
//sub class
public class sample3 extends sample2
{
 
 public void m2()
 {
	 int num1=80;  //local variable
	 
	 System.out.println(num1);
	 System.out.println(super.num1);  //super keyword use
 }
 
 public static void main(String[] args)
 {
	sample3 s3=new sample3();
	s3.m2();
}
}
