class jlab15

//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	23/9/25
/* This program is to calculate the total amount
 of loan to be repaid*/


// Error: 
//Why:

{
	public static void main(String args[])
	
	{
		
		double loan;
		double interest;
		double years;
		double toPay;
		
		System.out.print("Enter your loan amount: ");		//	Inputs
		loan = EasyIn.getDouble();
		System.out.print("Enter your interest per annum: ");
		interest = EasyIn.getDouble();
		System.out.print("Enter the amount of years the loan is to be taken out: ");
		years = EasyIn.getDouble();
		
		
		toPay = loan + (loan * interest * years);		//	formula to calculate the amount to be paid
		System.out.println("The total amount to be repaid is " + toPay + " euro");		//	Output - total amount to be repaid
	}
}