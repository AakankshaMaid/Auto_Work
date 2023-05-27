package Akki;

public class Prime_Number {
	public static void main(String[] args) {
		
	//2,3,5,7....
	int num=7;
	int count=0;
	           //4-1=3
	for(int i=2;i<=num-1;i++)
	{
		if(num%i==0)
		{
			count=count+1;
		}	
	}
	if(count>0)
	{
		System.out.println("not Prime number");
	}
	else
	{
		System.out.println("Prime number");
	}
	}
}
