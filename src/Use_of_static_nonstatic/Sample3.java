package Use_of_static_nonstatic;

public class Sample3 {
	int std;
	char div;
	String name;
	static String HM;
	
	public void m1()
	{
		System.out.println("statndard: "+std+"\n"+" division: "+div+"\n"+" name: "+name+"\n"+" HM: "+HM);
	}
	public static void main(String[] args) 
	{
		Sample3 s=new Sample3();
		s.std=10;
		s.div='A';
		s.name="Akii";
		s.HM="Bhise";
		
		Sample3 s1=new Sample3();
		s1.std=11;
		s1.div='B';
		s1.name="Rishi";
		s1.HM="Sharma";
		
		s.m1();
		System.out.println("----------------------");
		s1.m1();
	}

}
