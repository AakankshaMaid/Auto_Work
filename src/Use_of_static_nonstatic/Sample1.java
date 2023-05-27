package Use_of_static_nonstatic;

public class Sample1 {
	int std;
	String name;
	static String principle;
	
	public  void info()
	{    
		System.out.println(std+": "+name+": "+principle);
	}
	
	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		s1.std=10;
		s1.name="Akki";
		s1.principle="Abc";
		
		Sample1 s2=new Sample1();
		s2.std=11;
		s2.name="Rohan";
		s2.principle="xyz";
		
		s1.info();
		s2.info();
		
		
	}

}
