package Control_Statements;

public class else_If_statement {
	public static void main(String[] args) {
		int marks=50;
		
		if(marks<30)
		{
			System.out.println("you are fail");
		}  
		         //50<=36    //50>=50
		else if(marks>=36 & marks<=50)   //set limit --->36 to 50
		{
			System.out.println("you scored an avrage marks");
		}
		else if(marks>=50 & marks<=70)
		{
			System.out.println("you are pass in 2nd class");
		}

	}

}
