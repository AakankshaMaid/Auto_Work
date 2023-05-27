package Use_of_static_nonstatic;

public class Emp {
	
	String empName;             //non static global variable declaration
	int empID;                 //non static global variable declaration
	static String empCEOname;  //static global variable declaration
	
	public void empInfo()   //non static regular method
	{
		System.out.println(empName+": "+empID+": "+empCEOname);
	}

}
//use of non static variable declearation is that to stored diff info every time--->create new memory space for new info
//static variable is use to stoard same information--->create only one memory space and assign valune in same space i.e o/p is same