package Akki;

public class ReplaceAll_method {
	public static void main(String[] args) {
		// @%4&9*$cap#g@@mini
		//convert=@%4&9*$000#0@@0000
		
	String s1= "@%4&9*$cap#g@@mini";
		
	System.out.println(s1.replaceAll("[a-z]" ,"0"));//to replace char
	System.out.println(s1.replaceAll("[^a-z]", "0"));
	   
	}	

}
