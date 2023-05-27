package Types_of_variables;

public class Global_nonStatic1_variable {
	
	int num=10;    //non static global variable
	
	public static void main(String[] args) 
	{
		//non static global variable call from same class
//for static method = step1: creat object--->className objectName=new className();
//                    step2: objectName.variableName
		
		//className        objectName   new   className
		Global_nonStatic1_variable XYZ = new Global_nonStatic1_variable();
		
		//               objectName.variableName
		System.out.println(XYZ.num);
	}
	public static void m1()
	{
		Global_nonStatic1_variable XYZ=new Global_nonStatic1_variable();
		System.out.println(XYZ.num);
	}
	public void m2()
	{
		System.out.println(num); //non static global variable call in non static method
		                              //----->direct call variable name
	}
	
	

}
