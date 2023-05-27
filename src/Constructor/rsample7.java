package Constructor;

public class rsample7 {
      int num1;
      int num2;
      char grade;
      
      rsample7()
      {
    	  num1=10;
    	  num2=10;
      }
      rsample7(int a, int b)
      {
    	  num1=a;
    	  num2=b;
      }
      rsample7(char c1)
      {
    	  grade=c1;
      }
      public void add ()
      {
    	  System.out.println(num1+num2);
      }
      public void multi()
      {
    	  System.out.println(num1*num2);
      }
      public void grade ()
      {
    	System.out.println(grade);  
      }
      public static void main(String[] args) {
		rsample7 r1 = new rsample7 ();
		r1.add();
		rsample7 r2 = new rsample7 (100,100);
		r2.add();
		rsample7 r3 = new rsample7 (100,100);
		r3.multi();
		rsample7 r4 = new rsample7 ('A');
		r4.grade();
	}
}
