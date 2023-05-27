package Constructor;

public class rsample6 {
       int num1;
       int num2;
       String name;
       
       rsample6()
       {
    	   num1=10;
    	   num2=20;
    	   
       }
       rsample6(int a, int b)
       {
    	   num1=a;
    	   num2=b;
       }
       rsample6(String s1)
       {
    	   name=s1;
       }
       rsample6(int a, int b , String s1)
       {
    	   num1=a;
    	   num2=b;
    	   name=s1;
       }
       public void add ()
       {
    	   System.out.println(num1+num2);
       }
       public void sub ()
       {
    	   System . out.println(num1-num2); 
       }
       public void name ()
       {
    	   System.out.println(name);
       }
       public void numname()
       {
    	   System.out.println(num1+" "+num2+" "+name);
       }
       public static void main(String[] args) {
		rsample6 r1 = new rsample6 ();
		r1.add();
		rsample6 r2= new rsample6 (10,10);
		r2.sub();
		rsample6 r3 = new rsample6 ("rushi");
		r3.name();
		rsample6 r4 = new rsample6 (100,100,"rrrr");
		r4.numname();
	}











}
