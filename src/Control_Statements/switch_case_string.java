package Control_Statements;

public class switch_case_string {
	public static void main(String[] args) {
		switch("CD")
		{
		case "CD":System.out.println("cash deposite");
		break;
		case "MD":System.out.println("money deposite");
		break;
		case "MW":System.out.println("money withdraw");
		break;
		default:System.out.println("your input is invalid");
		}
	}

}
