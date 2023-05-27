package Control_Statements;

public class Nasted_if_2 {
	public static void main(String[] args) {
		int shopping_amount=560;
		int shopping_amount1=1500;
		
		    //560>500
		if(shopping_amount>500)    //outer if
		{
			System.out.println("No additional dilivery charges");
			    //1500>1000
			if(shopping_amount1>1000)  //inner if or nasted if
			{
				System.out.println("congrats!! You Win 10% discount!!");
			}
			else
			{
				System.out.println("No discount");
			}	
		}
		else
			System.out.println("Pay additional 50rs dilevary charges");
	}

}
