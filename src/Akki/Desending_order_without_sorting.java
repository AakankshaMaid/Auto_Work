package Akki;

public class Desending_order_without_sorting {
	public static void main(String[] args) {
		
		int temp;
		
		int ar[]= {11,22,33,2,4,5,7};
		//          0<=6
		for(int i=0;i<=ar.length-1;i++)
		{   //    j=0+1=1 1<=6
			for(int j=i+1;j<=ar.length-1;j++)
			{    // 0<1
				if(ar[i]<ar[j])
				{
					temp=ar[i]; //0
					ar[i]=ar[j]; //1
					ar[j]=temp;  //
				}
			}
			System.out.println(ar[i]);
		}
	}

}
