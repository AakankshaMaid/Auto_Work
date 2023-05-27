package Akki;

public class Aesending_order_without_sorting {
	public static void main(String[] args) {
		
		int temp;
	int ar[]= {44,20,1,16,6,8,47};
		
		for(int i=0;i<ar.length;i++)
		{
			
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
				}
				
			}
			
			System.out.println(ar[i]);
		}
			
	}	
			
	

}
