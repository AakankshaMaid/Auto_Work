package Akki;

public class Armstrong_Number {

	public static void main(String[] args) {
//An Armstrong number is one whose sum of digits raised to the power 
//three equals the number itself. 371, for example, is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.

		int num=371;
		int arm=0;
		
		for(int i=num;i>0;i=i/10) //3
		{
			int rem=i%10; //1 7  27
			arm=arm+rem*rem*rem; // 371
			
		}
		System.out.println(arm);
		
		if(num==arm)
		{
			System.out.println(num+" "+"Armstrong number");
		}
		else
		{
			System.out.println(num+" "+"is not armstrong number ");
		}
	}
}
