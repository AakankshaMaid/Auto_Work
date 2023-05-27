package method;

public class Sample1 {
	public static void main(String[] args) {     //main method --->pre-defined method
		String stdname="vaibhav";
		int std=6;
		char div='B';
		float marks=59.36f;
		
		System.out.println("name of student="+stdname);
		System.out.println("class="+std);
		System.out.println("division="+div);
		System.out.println("marks="+marks);
		m1();      //user defined method call in same calass---> [formula=mathodname();]
		
	}
	public static void m1()         //user defined method    (methodname=m1)
	{
		System.out.println("my name is Aakanksha");
		
	}

}
