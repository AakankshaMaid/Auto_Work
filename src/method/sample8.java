package method;

public class sample8 {
	public static void main(String[] args) {
		m1("Aakanksha",10,'A',87.80f);   //static regular method call from same class
		
		System.out.println("another student is: ");
		
		sample8 xyz=new sample8();    //n
		xyz.m2("Vidhi", 6, 'A', 77.42f);
		
	}
	
	public static void m1(String stdname,int std,char div,float marks) 
	// static regular method with parameters  String,int,char,float
	{
		System.out.println(stdname+"\n"+std+"\n"+div+"\n"+marks);  // "\n" is for vertical view
	}
	
	public void m2(String stdname,int std,char div,float marks)
	// non static regular method with parameters  String,int,char,float

	{
		System.out.println(stdname+"\n"+std+"\n"+div+"\n"+marks);
	}

}
