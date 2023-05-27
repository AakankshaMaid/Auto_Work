package Access_Specifiers1;

public class Default_access_specifier 
{
   int a;
   
   Default_access_specifier()
   {
	   a=50;
   }
   
   void m1()
   {
	   System.out.println(a);
   }
   
   public static void main(String[] args) 
   {
	   Default_access_specifier s1=new Default_access_specifier();
	   s1.m1();
	   
}
}
//default access specifier scope is within the package only
