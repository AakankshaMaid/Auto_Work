package Types_of_variables;

public class Global_nonStatic2_variable {
	public static void main(String[] args)
	{
		//non static global variable call from diff class
		// step1:creat diff class object
		//step2:objectName.variableName
		
		Global_nonStatic1_variable XYZ=new Global_nonStatic1_variable();
		
		System.out.println(XYZ.num);
		
	}

}
