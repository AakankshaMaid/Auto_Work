package String_class;

public class sample1 
{
	public static void main(String[] args) {
		
	
	//object creation of string without new keyword--->constant pool area
	
	String s1="abc";
	String s2="abc";
	String s3="abc1";
	
	//object creation of string using new keyword--->non-constant pool area
	
	String s4=new String("abc");
	String s5=new String("abc");
	String s6=new String("abc1");
	
	System.out.println(s1==s2);  //true
	System.out.println(s1==s3);  //false
	System.out.println(s4==s5);  //false
	System.out.println(s1==s6);  //false
	
	
	//== Compare location
	//.equals() method compare data and case
	}
}
