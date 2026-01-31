class jlab2c1
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	17/10/25
/* This program reads an earthquake magnitude
 from the user and displays the appropriate descriptor on the screen*/
 
// Error: 
// Why:	

{
	public static void main(String[] args)
	{
		double magnitude;
		
		System.out.print("Enter the magnitude:	");
		magnitude = EasyIn.getDouble();
		
		if (magnitude >= 8.0)
			{
				System.out.println("Great");
			}
		
		else if (magnitude <= 7.9 && magnitude >=7.0)
			{
				System.out.println("Major");
			}
			
		else if (magnitude <=6.9 && magnitude >= 6.0)
			{
				System.out.println("Strong");
			}
			
		else if (magnitude <= 5.9 && magnitude >= 5.0)
			{
				System.out.println("Moderate");
			}
		else if (magnitude <= 4.9 && magnitude >= 4.0)
			{
				System.out.println("Light");
			}
		else if (magnitude <= 3.9 && magnitude >= 3.0)
			{
				System.out.println("Minor");
			}
		else
			{
				System.out.println("Micro");
			}
	}
}