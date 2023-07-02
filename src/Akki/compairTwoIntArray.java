package Akki;

import java.util.Arrays;

public class compairTwoIntArray 
{
	public static void main(String[] args) {
		 int num=371;
		 int ams=0;
		     for(int i=num;i>0;i=i/10)
		     {
		      int rem=i%10;
		       ams=ams+rem*rem*rem;
		     }
		    System.out.println(ams);
		    if(num==ams)
		    {
		      System.out.println("num is amstrom");
		    }
		    else
		    {
		     System.out.println("num is not amstrom ");
		    }
		  }
		    

	}
	


