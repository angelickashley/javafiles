class Taxes
/* This is a program that computes a Tax payer's tax payment for a year*/
//Angelic Kyle Ashley Batan - C00317625
// Class B
// A Simple program that calculates tax
// 23/9/25
{
		public static void main(String args[])
		{
			double gross;
			double children;
			double noTax;
			double taxIncome;
	
			System.out.print("Enter your gross income: ");
			gross = EasyIn.getInt();
			System.out.print("Enter your number of children: ");
			children = EasyIn. getInt();
			noTax = 5000 + (children*1000);/*This is the income that is not taxed*/
			taxIncome = (gross - noTax)*0.24;/* This is the income that is taxed*/
			System.out.println("Your total payment for the year is " + taxIncome);
		}
}