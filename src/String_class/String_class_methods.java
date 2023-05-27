package String_class;

public class String_class_methods 
{
	public static void main(String[] args) {
		
		String s1="velocity";
		String s2="";
		String s3="abcd";
		String s4="ABCD";
		String s5="my name is abc";
		String s6="abcabcab";
			
		System.out.println(s1.length()); //8
		//use to major length of string---->length()
		System.out.println(s1.isEmpty()); //false
		//use to identify whether string is empty or not--->isEmpty()
		System.out.println(s2.isEmpty()); //true     
		System.out.println(s3.equals(s4));  //false                 
		//use to compair two strings.it is case sensitive---->equals()
		System.out.println(s3.equalsIgnoreCase(s4));//true         
		//use to comair strings but not case sensitive---->equalsIngnorCase()
		System.out.println(s5.contains("is")); //true               
		//use to check single word is present in sentece or paragraph--->contains()
		System.out.println(s1.toUpperCase());  //VELOCITY          
		//use to change the string in uppercase---->toUpperCase()
		System.out.println(s4.toLowerCase());  //abcd               
		//use to change string in lowercase---->toLowerCase()
		System.out.println(s1.charAt(4));   //c                      
		//use to identify inserting index no.single character in string--->charAt()
		System.out.println(s6.indexOf('a'));  //0                   
		//use to find using single char in string index no.of that char--->indexOf()
		System.out.println(s6.lastIndexOf('a')); //6               
		//use to find last index no.in string---->lastIndexOf()
		System.out.println(s5.startsWith("my"));  //true           
		//use to find the starting string in sentance---->startsWith()
		System.out.println(s5.endsWith("abc")); //true              
		//use to find the end string in the sentance---->endsWith()
		System.out.println(s1.substring(4));  //city                
		//use to print the middle string char incerting index no.---->substring()
		System.out.println(s1.substring(1, 6)); //eloci             
		//use to print the middle string char---->substring()
		System.out.println(s3.concat(s4));  //abcdABCD              
		//use to combain two strings---->concat()
		System.out.println(s5.replace("abc", "xyz"));  //abc-->xyz  
		//use to replace the string characters--->replace()
	}

}
