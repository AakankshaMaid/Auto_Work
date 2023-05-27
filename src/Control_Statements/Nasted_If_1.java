package Control_Statements;

public class Nasted_If_1 {
	public static void main(String[] args) {
		int PEM=350;
		int MEM=750;
		
		if(PEM>300)  //outer if
		{
			System.out.println("Eligible for main exam:PEM>300");
			
			if(MEM>700)  //inner if or nasted if
			{
				System.out.println("congrats you are pass!!");
			}
			else
			{
				System.out.println("Rejected from mains exam: MEM<700");
			}
			
		}
		else
		{
			System.out.println("You are regected");
		}
	}
	

}
