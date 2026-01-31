class jlab32
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	4/11/25
/* This program will find the sum of a collection of data values.
The program will terminate when a zero value is read */
 
// Error: constant loop
// Why:	did not know how to break the loop

{
	public static void main(String[] args)
	{
		int sum = 0;
		int input;
		
		System.out.print("Enter a number you want to add to the first number(Press 0 to terminate the program): ");
		input = EasyIn.getInt();
		
		while (true)	//creates an infinite loop until broken
			{
				System.out.print("Enter a number you want to add to the first number(Press 0 to terminate the program): ");
				input = EasyIn.getInt();
				
				if (input == 0)		//condition to break the loop if input is equal to 0
					{
						break;		//exit the loop if condition is met
					}
				sum += input;		//add all inputs
			}
		System.out.println("Your total is " + sum);
	}
}