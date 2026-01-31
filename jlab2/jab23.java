class jlab23
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	26/9/25
/* This program will determine if the number is odd or even*/
 
// Error: 
// Why:	

{
	public static void main(String args[])
	{
		int number;
		
		System.out.print("Enter a number: ");
		number = EasyIn.getInt();
		
		
		if (number%2 == 0)		// % is division
			{
				System.out.println("The number " + number + " is even");
			}
		else
			{
				System.out.println("The number " + number + " is odd");
			}
		
	}
}