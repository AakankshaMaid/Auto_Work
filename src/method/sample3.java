package method;

public class sample3 {
  public static void main(String[] args) {      
	System.out.println("Sanjh");
	
	sample3 xyz = new sample3();    //1.classname objectName = new classname();  
	xyz.m1();                       //2.objectName.methodname();                 
	xyz.m2();
	                                 //step1=creat object
	                                 //step2=call method
	
 }
  
  public void m1()    //user defined non static method
  {
	  System.out.println("Aakanksha");
  }
  public void m2()
  {
	  System.out.println("Rahi");
	  
  }

}
