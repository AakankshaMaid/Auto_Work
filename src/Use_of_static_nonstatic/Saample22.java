package Use_of_static_nonstatic;

public class Saample22 {
	public static void main(String[] args) {
		Sample2 s=new Sample2();
		s.std=10;
		s.stdname="Akki";
		s.teacher="Soni";
		
		Sample2 s2=new Sample2();
		s2.std=11;
		s2.stdname="Rahul";
		s2.teacher="Ganesh";
		
		Sample2 s3=new Sample2();
		s3.std=12;
		s3.stdname="Gaurav";
		s3.teacher="Pawan";
		
		s.m1();
		s2.m1();
		s3.m1();
		


	}

}
