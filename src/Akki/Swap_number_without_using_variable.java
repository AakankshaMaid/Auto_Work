package Akki;

public class Swap_number_without_using_variable {
	public static void main(String[] args) {
		int a=20;
		int b=40; 
		System.out.println("Befor swaping"+" a="+a+" "+"b="+b);
			a=a+b; //60
			b=a-b; //60-40=20
			a=a-b;  //60-20=40
		System.out.println("After swaping"+" a="+a+" "+"b="+b);
	}

}
