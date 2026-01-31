class jlab2b3
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	26/9/25
/* This program tells the user the lowest number outputted*/
 
// Error: 
// Why:	

{
	public static void main (String args[])
	
	{
		int num1;
		int num2;
		int num3;
		int low;
		
		System.out.print("Enter your first number: ");
		num1 = EasyIn.getInt();
		System.out.print("Enter your second number: ");
		num2 = EasyIn.getInt();
		System.out.print("Enter your third number: ");
		num3 = EasyIn.getInt();
		
		low = num1;
		
		if (num2 < low)
			{
				low = num2;
			}
		
		else if (num3 < low)
			{
				low = num3;
			}
		
		else
			{
				low = num1;
			}
		
		System.out.println("The smallest number is " + low);
	}
}