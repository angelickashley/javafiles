class jlab2b2
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	26/9/25
/* This program calculates a credit card interest*/
 
// Error: 
// Why:	

{
	public static void main(String args[])
	
	{
		double money;
		
		System.out.print("Enter the amount of money in your credit card: ");
		money = EasyIn.getInt();
		
		if (money <= 500)
			{
				money = money*0.12;
				System.out.println("Your total interest amount is " + money);
			}
		
		else
			{
				money = money*0.18;
				System.out.println("Your total interest amount is " + money);
			}
	}
}