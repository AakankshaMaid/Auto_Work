package Constructor;

public class rsample8 {
              int num1;
              char grade;
              float percentage;
              String name ;
              
              rsample8 (int a,char b)
              {
            	  num1=a;
            	  grade=b;
              }
              rsample8 (float a,String b)
              {
            	  percentage =a;
            	  name =b;
            	  
              }
              rsample8(int a)
              {
            	  num1=a;
              }
              rsample8 (char a)
              {
            	  grade=a;
              }
              rsample8(float a)
              {
            	  percentage=a;
              }
              rsample8(String a)
              {
            	  name=a;
              }
              rsample8 (int b,float c, char d, String a)
              {
            	  num1=b;
            	  
            	  percentage=c;
            	  grade=d;
            	  name=a;
              }
              public void num1 ()
              {
            	  System.out.println(num1);
              }
              public static void main (String[]args)
              {
            	  rsample8 r1=new rsample8(8);
            	  r1.num1();
              }













}
