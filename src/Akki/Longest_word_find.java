package Akki;

public class Longest_word_find {
	public static void main(String[] args) {
		String s1=" My name is Aakanksha";
		//                             0   1   2   3
		String [] s2=s1.split(" "); // m y name is Aakanksha
		String longestWord="";
		
		for(String w:s2)
		{
			if(w.length()>longestWord.length())
			{
				longestWord=w;
			}
		
		}
		System.out.println(longestWord);
		
		
	}

}
