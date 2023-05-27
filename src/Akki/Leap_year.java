package Akki;

public class Leap_year {
	public static void main(String[] args) {
		//the year which divisible by 4 and 400 but not divisible by
		// 100 is called Leap year
		
		
		int i=2016;
		
	 // 1st condition  2nd condition
		//             1 AND 1=1    
		if(i%400==0||(i%4==0&&i%100!=0))   // != means not equal to
		{ 
			System.out.println("Leap year");
			
		}
		else
		{
			System.out.println("Not Leap year");
		}
	}

}
