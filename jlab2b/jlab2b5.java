class jlab2b5
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	10/10/25
/* This program arranges the numbers inputted in ascending order*/
 
// Error: 
// Why:	

{
	public static void main(String args[])
	{
		int month;
		
		System.out.print("Enter the number of the month: ");
		month = EasyIn.getInt();
		
		if (month == 1)
			{
				System.out.println("January");
			}
		else if (month == 2)
			{
				System.out.println("February");
			}
		else if (month == 3)
			{
				System.out.println("March");
			}
		else if (month == 4)
			{
				System.out.println("April");
			}
		else if (month == 5)
			{
				System.out.println("May");
			}
		else if (month == 6)
			{
				System.out.println("June");
			}
		else if (month == 7)
			{
				System.out.println("July");
			}
		else if (month == 8)
			{
				System.out.println("August");
			}
		else if (month == 9)
			{
				System.out.println("September");
			}
		else if (month == 10)
			{
				System.out.println("October");
			}
		else if (month == 11)
			{
				System.out.println("November");
			}
		else if (month == 12)
			{
				System.out.println("December");
			}
		else
			{
				System.out.println("Please enter a valid input");
			}
	}
}