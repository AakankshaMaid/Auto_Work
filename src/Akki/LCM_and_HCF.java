package Akki;

public class LCM_and_HCF {
	public static void main(String[] args) {
//GCD or HCF=highest common factor is the greatest number which divides each of the two or more number
//eg. HCF of 12 and 36 is 12 becoz 12 is highest common factor which divides both 12 and 36
//LCM= Least Common Multiple i.e the last common multiple of two no.is the smallest number that is multiple of both numbers		
//eg.		
		int a=36;
		int b=48;
		
	int lcm;
		int gcd=0;
		
		for(int i=1;i<=48;i++)
		{
			if(a%i==0&&b%i==0)
			{
				 gcd=i;		//or HCF
			}	
		}
		System.out.println("HCF or GCD of "+a+" and "+b+" is "+gcd);
		
		lcm=a*b/gcd;
		System.out.println("LCM is "+lcm);
	}

}
