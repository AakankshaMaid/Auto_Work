package Constructor;

public class User_definend_constructor2 {
	int num3;   //step1:variable decleration
	int num4;
	
	User_definend_constructor2()  //user defined cunstroctor
	{
		 num3=50;    //step2:variable initialization using user defined cunstroctor
		 num4=30;
	}
	
	public void sub()
	{
		System.out.println(num3-num4);  //step3:variable use
	}

}
