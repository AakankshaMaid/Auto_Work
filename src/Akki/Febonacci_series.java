package Akki;

public class Febonacci_series {
	public static void main(String[] args) {
		//0,1,2,3,4,5
		//0,1,1,2,3,5,8,13...
		   int a=0;int b=1;
		   int c;
			 
		   for(int i=0;i<=5;i++)
		   {    
			   c=a+b;
			   System.out.println(c);
			   a=b;
			   b=c;
		   }
	}
	}


