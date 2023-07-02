package Akki;

import java.util.Scanner;

public class Accept_Input_From_User
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter String Input: ");
		String s1=scan.next();  //this method for string
		System.out.println(s1.toUpperCase());
		
		System.out.println("Enter Num1:");
		System.out.println("Enter Num2:");
		int num=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(num+num2);
		
	}

}
