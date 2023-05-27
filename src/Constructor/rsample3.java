package Constructor;

public class rsample3 {
        int num1;
        int num2;
        String name;
        
        rsample3 ()
        {
        	num1=10;
        	num2=20;
        }
        rsample3(int a, int b)
        {
        	num1=a;
        	num2=b;
        }
        rsample3(String s1)
        {
        	name=s1;   //s1="rushi"---->name="rushi";
        }
        rsample3(int a, int b , String s1)
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
        public void numname()
        {
        	System.out.println(num1+" "+num2+" "+name);
        	
        }
        public static void main(String[] args) {
        	rsample2 r1 = new rsample2 ();
        	r1.add();
        	rsample2 r5 = new rsample2 ();
        	r5.sub();
        	rsample2 r2 = new rsample2 (20,10);
        	r2.sub();
        	
        	rsample2 r3 = new rsample2 ("rushi");
        	r3.name();
        	rsample2 r4 = new rsample2 (6,6,"rrrr");
        	r4.numname();
		}
        
}
