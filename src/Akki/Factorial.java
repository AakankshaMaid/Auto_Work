package Akki;

public class Factorial {
	public static void main(String[] args) {
		int num=5;
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;  //1, 1*2=2, 3*2=6,4*6=24; 
		}
		System.out.println(fact);
		
	}

}
