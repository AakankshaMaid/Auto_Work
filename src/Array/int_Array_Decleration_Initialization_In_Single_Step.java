package Array;
import java.util.Arrays;
public class int_Array_Decleration_Initialization_In_Single_Step
{
	public static void main(String[] args)
	{
		int ar[]= {10,40,60,30,20,50};
		
		System.out.println(ar.length);  //6
		
		System.out.println(ar[2]);   //60
		
		System.out.println("----print orignal info---");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		Arrays.sort(ar);
		System.out.println("----print accending order array---");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("----print decending order array---");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
	}
}
	
	


