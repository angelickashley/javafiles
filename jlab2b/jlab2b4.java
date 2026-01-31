class jlab2b4
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	26/9/25
/* This program arranges the numbers inputted in ascending order*/
 
// Error: 
// Why:	

{
	public static void main(String args[])
	{
		int num1;
		int num2;
		int num3;
		int lowest;
		int middle;
		int highest;
		
		System.out.print("Enter the first number: ");
		num1 = EasyIn.getInt();
		System.out.print("Enter the second number: ");
		num2 = EasyIn.getInt();
		System.out.print("Enter the third number: ");
		num3 = EasyIn.getInt();
		
		if (num1<num2 & num1<num3)
			{
				lowest = num1;
				if (num2<num3)
					{
						middle = num2;
						highest = num3;
						System.out.println("The numbers in ascending order is: " + lowest + " " + middle + " " + highest);
					}
				else
					{
						middle = num3;
						highest = num2;
						System.out.println("The numbers in ascending order is: " + lowest + " " + middle + " " + highest);
					}
				
			}
		
		else if (num2<num1 & num2<num3)
		{
			lowest = num2;
			if (num1<num3)
				{
					middle = num1;
					highest = num3;
					System.out.println("The numbers in ascending order is: " + lowest + " " + middle + " " + highest);
				}
				else
				{
					middle = num3;
					highest = num1;
					System.out.println("The numbers in ascending order is: " + lowest + " " + middle + " " + highest);
				}
			}
			
		else
			{
				lowest = num3;
					if (num1<num2)
					{
						middle = num1;
						highest = num3;
						System.out.println("The numbers in ascending order is: " + lowest + " " + middle + " " + highest);
					}
				else
					{
						middle = num3;
						highest = num1;
						System.out.println("The numbers in ascending order is: " + lowest + " " + middle + " " + highest);
					}
			}
	}
}