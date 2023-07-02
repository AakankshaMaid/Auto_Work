package Akki;

import java.util.HashSet;
import java.util.Map;

public class Reverse_Only_char_num_Fix 
{
	 public static void main(String[]args) 
	 {
		 //op=dcba12zyx34rqp
          String s1="abcd12xyz34pqr";
          String s2=s1.substring(0,4);
          String s3=s1.substring(4,6);
          String s4=s1.substring(6,9);
          String s5=s1.substring(9,11);
          String s6=s1.substring(11,14);
          String rev1="";
          String rev2="";
          String rev3="";
          for(int i=s2.length()-1;i>=0;i--)
          {
        	  rev1=rev1+s2.charAt(i);
        	  
          } 
          for(int j=s4.length()-1;j>=0;j--)
          {
        	  rev2=rev2+s4.charAt(j);
        	  
          }
          for(int k=s6.length()-1;k>=0;k--)
          {
        	  rev3=rev3+s6.charAt(k);
        	  
          }        
        String s=rev1.concat(s3).concat(rev2).concat(s5).concat(rev3);
        System.out.println(s);
        
        
          
	  }

}
