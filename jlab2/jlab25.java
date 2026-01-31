class jlab25
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	26/9/25
/* This program will determine if the first inputted number 
 is divisible to the second inputted number*/
 
// Error: 
// Why:	

{
	public static void main(String args[])
	
	{
		int num1;
		int num2;
		int num3;
		
		System.out.print("Enter the first number: ");
		num1 = EasyIn.getInt();
		System.out.print("Enter the second number: ");
		num2 = EasyIn.getInt();
		System.out.print("Enter the third number: ");
		num3 = EasyIn.getInt();
		
		if (num1%num2 == 0 && num1%num3 == 0)
			{
				System.out.println(num1 + " is divisible by " + num2 + " and " + num3);
			}
			
		else if (num1%num2 == 0)
			{
				System.out.println(num1 + " is divisible by " + num2 + " but not by " + num3);
			}
			
		else if (num1%num3 == 0)
			{
				System.out.println(num1 + " is divisible by " + num3 + " but not by " + num2);
			}
		else
			{
				System.out.println(num1 + " is not divisible by any of the numbers");
			}
	}
}