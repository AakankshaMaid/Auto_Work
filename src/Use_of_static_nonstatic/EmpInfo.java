package Use_of_static_nonstatic;

public class EmpInfo {
	public static void main(String[] args) {
		//step1: create object
		
		Emp e1=new Emp();   //object creation in main method to call non static regular method from diff class
		e1.empName="Rahul";  //here we create an object and initialize variable becoz in Emp class we r not proivide any info
		e1.empID=101;
		e1.empCEOname="ABC";
		
		Emp e2=new Emp();        //second object created for assign second emp info
		e2.empName="Aarti";
		e2.empID=102;
		e2.empCEOname="ABC";
		
		Emp e3=new Emp();       //third object created for assign third emp info
		e3.empName="Vaibhav";
		e3.empID=103;
		e3.empCEOname="XYZ";
		
		//// step2: call the method--->objectName.methodname
		e1.empInfo();        
		e2.empInfo();
		e3.empInfo();

 
	}

}
