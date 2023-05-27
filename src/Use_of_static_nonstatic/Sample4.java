package Use_of_static_nonstatic;

public class Sample4 
{
 int avg;
 String look;
 int price;
 static String company;
 
 public void m1()
 {
	 System.out.println("Bike avg: "+avg+"\n"+"Bike look: "+look+"\n"+"Bike price: "+price+"\n"+"Company name: "+company);
 }
 public static void m2(int avg,String look,int price)
 {  
	 Sample4 d=new Sample4 ();
	 
	 System.out.println("Bike avg: "+d.avg+"\n"+"Bike look: "+d.look+"\n"+"Bike price: "+d.price+"\n"+"Company name: "+company);
 }
 
 public static void main(String[] args) {
	Sample4 s1=new Sample4 ();
	s1.avg=40;
	s1.look="Red";
	s1.price=45000;
	s1.company="Yamaha";
	
	Sample4 s2=new Sample4 ();
	s2.avg=60;
	s2.look="Black";
	s2.price=150000;
	s2.company="Honda";
	
	s1.m1();
	System.out.println("----------------");
	s2.m1();
	System.out.println("-------------");
	
	m2(55,"Blue",50000);
	
}
}
