class jlab24
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	26/9/25
/* This program will determine if the first inputted number 
 is divisible to the second inputted number*/
 
// Error: 
// Why:	

{
	public static void main (String args[])
	{
		int number1;
		int number2;
		
		System.out.print("Enter the first number: ");
		number1 = EasyIn.getInt();
		System.out.print("Enter the second number: ");
		number2 = EasyIn.getInt();
		
		if (number1%number2 == 0)
			{
				System.out.println(number1 + " is divisible to " + number2);
			}
		else
			{
				System.out.println(number1 + " is not divisible to " + number2);
			}
	}
}