package Array;

public class String_Array 
{
	public static void main(String[] args) 
	{
	//step1: Array decleration 
	//dataType objectName Array = new dataType[length] 
	String ar []=new String[5];  // 5 is length
	
	//step2: Array initialization
	ar[0]="rahul";
	ar[1]="ganesh";
	ar[2]="mahesh";
	ar[3]="suresh";
	ar[4]="ramesh";
	
	//step3: Arry usage
	System.out.println(ar.length); //for find the length--->5
	
	System.out.println(ar[1]);
	System.out.println(ar[4]);
	System.out.println("--------------------");
	
	for(int i=0;i<=ar.length-1;i++)  //use for loop for print all strings array
	{
		System.out.println(ar[i]);
	}
	
	
	}
}
