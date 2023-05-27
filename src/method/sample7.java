package method;

public class sample7 {
	public static void main(String[] args) {
		sample6.m1(10,10);   //static regular method call from diff class with parameters
		sample6.m1(5,5);
		
		sample6 xyz=new sample6();  //non static regular method call from diff class with parameters
		xyz.m2(5,5);
		xyz.m2(2,2);
		
		
	}
	

}
