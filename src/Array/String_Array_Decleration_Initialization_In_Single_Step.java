package Array;
import java.util.Arrays;
public class String_Array_Decleration_Initialization_In_Single_Step 
{
	public static void main(String[] args)
	{
		 String ar[]= {"rahul","priya","akki","rohan","kartik"};
		
		System.out.println(ar.length);
		System.out.println(ar[0]);
		System.out.println(ar[2]);
		
		Arrays.sort(ar);
		
		System.out.println("---print acending order string array----");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("---print decending order string array---");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
	

}
}
