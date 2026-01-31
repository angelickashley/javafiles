class jlab31
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	24/10/25
/* This program keeps presenting the user with
  options until the user enters the value 7 to exit */
 
// Error: 
// Why:	

{
	public static void main (String[] args)
	{
		int choice;	
		
		System.out.println("Conversion Table: ");
		System.out.println("1. Farenheight to Celcius:	(F-32)*5/9");
		System.out.println("2. Celcius to Farenheight:	C*9/5+32");
		System.out.println("3. Inches to Centimetres:	in*2.54");
		System.out.println("4. Centimetres to Inches:	cm*0.3937");
		System.out.println("5. Pounds to Kilograms:	lb*0.453592");
		System.out.println("6. Kilograms to Pounds:	kg*2.20462");
		
		System.out.print("Please enter the number of the conversion you'd like to use:	");
		choice = EasyIn.getInt();
		
		while (choice != 7)
			{
				System.out.println("Conversion Table: ");
				System.out.println("1. Farenheight to Celcius:	(F-32)*5/9");
				System.out.println("2. Celcius to Farenheight:	C*9/5+32");
				System.out.println("3. Inches to Centimetres:	in*2.54");
				System.out.println("4. Centimetres to Inches:	cm*0.3937");
				System.out.println("5. Pounds to Kilograms:	lb*0.453592");
				System.out.println("6. Kilograms to Pounds:	kg*2.20462");
				
				System.out.print("Please enter the number of the conversion you'd like to use:	");
				choice = EasyIn.getInt();
			}
		}
	}