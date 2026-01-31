class jlab21
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	26/9/25
/* This program will output whether the number was greater than zero, 
 *less than zero or equal to zero*/
 
 // Error: 
// Why:

{
	public static void main (String args[])
	{
		int number;
		
		System.out.print("Enter number: ");
		number = EasyIn.getInt();
		
		if (number>0)
		{
			System.out.println("This number is greater than zero");
		}
		if (number==0)
		{
			System.out.println("This number is equal to zero");
		}
		if (number<0)
		{
			System.out.println("This number is less than zero");
		}
	}
}	