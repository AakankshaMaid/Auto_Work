package Constructor;

public class rsample5 {
            int num1;
            int num2;
            String name;
            
            rsample5()
            {
            	num1=10;
            	num2=20;
            }
            rsample5(int a,int b)
            {
            	num1=a;
            	num2=b;
            }
            rsample5(String s1)
            {
            	name=s1;
            }
            rsample5 (int a, int b , String s1)
            {
            	num1=a;
            	num2=b;
            	name=s1;
            }
            rsample5(int a,String s1)
            {
            	num1=a;
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
            public void numname2()
            {
            	System.out.println(num1+" "+name);
            }
            public static void main(String[] args) {
            	rsample5 r1 = new rsample5 ();
            	r1.add();
            	rsample5 r2 = new rsample5 (100,100);
            	r2.add();
            	rsample5 r3 = new rsample5 ("rushi");
            	r3.name();
            	rsample5 r4= new rsample5(10,20,"rushi");
            	r4.numname();
            	rsample5 r5 = new rsample5 (10,"rrrrr");
            	r5.numname2();
			}
















}
