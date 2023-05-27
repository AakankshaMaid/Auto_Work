package Akki;

public class Revers_Numbers {
	public static void main(String[] args) {
		int num=1234;
		int revnum=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int reminder=i%10;  //for finding last number
			revnum=revnum*10+reminder;  //reinitialize
		}
		
		System.out.println(revnum);
		
		
	}

}
