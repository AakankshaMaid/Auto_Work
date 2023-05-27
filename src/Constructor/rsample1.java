package Constructor;

public class rsample1 {
       int num1;
       int num2;
       String name;
       
       rsample1()
       {
    	   num1=10;
    	   num2=20;
       }
       rsample1(int a,int b)
       {
    	   num1=a;
    	   num2=b;
       }
       rsample1(String Sname)
       {
    	   name=Sname;
       }
       public void add ()
       {
    	   System.out.println(num1+num2);
       }
       public void sub ()
       {
    	  System.out.println(num1-num2); 
       }
       public void sname()
       {
    	   System.out.println(name);
       }
       public static void main(String[] args) {
		rsample1 r1 = new rsample1 ();
		r1.add();
		rsample1 r2 = new rsample1 (20,20);
		r2.sub();
		rsample1 r3 = new rsample1 ("rushi");
		r3.sname();
	}
}
