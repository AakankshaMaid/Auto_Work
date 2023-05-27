package Exception_Handling;



public class Exception_throws_manually {
	public static void main(String[] args) {
		Exception_throws_manually d=new Exception_throws_manually();	
		d.m1();
	
	}

	public void m1()
	{
		String name=null;
		
		if(name==null)
		{
			throw(new ArithmeticException("Aakanksha"));
		}
	}
	public void m2()
	{
		try
		{
			m1();
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
		}
	

}
}