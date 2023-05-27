package Constructor;

public class rsample4 {
       int num1;
       int num2;
       String name;
       
       rsample4 ()
       {
    	   num1=10;
    	   num2=20;
       }
       rsample4(int a , int b)
       {
    	   num1=a;
    	   num2=b;
       }
       rsample4(String s1)
       {
    	   name=s1;
       }
       rsample4(int a,int b,String s1)
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
    	   System.out.println(num1-num2);
       }
       public void name ()
       {
    	   System.out.println(name);
       }
       public void numname ()
       {
    	   System.out.println(num1+" "+num2+" "+name);
       }
       public static void main(String[] args) {
    	   rsample2 r1 = new rsample2 ();
    	   r1.add();
    	   rsample2 r2 = new rsample2 (100,50);
    	   r2.sub();
    	   rsample2 r3 = new rsample2 ("rushi");
	       r3.name();
	       rsample2 r4 = new rsample2 (10,10,"rrrrr");
	       r4.numname();
	       
       }








}
