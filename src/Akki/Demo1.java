package Akki;

import java.util.Scanner;

public class Demo1
{

	public static void main(String[]arg)
	  {
	    String str="my name is Aakanksha ";
	    String s1[]=str.split(" ");
	    for(int i=0;i<=s1.length-1;i++)
	    {
	       String s2=s1[i];
	     if(i%2!=0)
	    { String rev=  m1(s2);
	
	    System.out.print(" "+rev);
     	}
	     else
	     {
	    	 System.out.print(" "+s2);
	     }
	   }
	   
	    }
	    public static String m1(String s2)
	    {
	     String rev="";
	     for(int j=s2.length()-1;j>=0;j--)
	     {
	       rev=rev+s2.charAt(j);
	     }
	     return rev;
	  }

}
