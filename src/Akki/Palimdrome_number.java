package Akki;

public class Palimdrome_number {
	public static void main(String[] args) {
		int num=1234;
		
		int rev=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
		
		if(num==rev)
		{
			System.out.println("is palimdrom");
		}
		else
		{
			System.out.println("not palimdrom");
		}
	}
		public static void m1() {
		String s="ahhd";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<count(ch);i++)
		{
			int max=ch[0];
			System.out.println("Minimum occurring character: "+max);
	

		}
		}


	private static int count(char[] ch) {
		// TODO Auto-generated method stub
		return 0;
		
	}
}

