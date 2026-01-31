class jlab2b6
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	10/10/25
/* This program allows the user to input a number from 1-6
 to convert what is in the conversion table*/
 
// Error: 
// Why:	

{
	public static void main(String args[])
	{
		
		int choice;	
		double celcius;
		double farenheight;
		double centimetres;
		double inches;
		double kilograms;
		double pounds;
		
		System.out.println("Conversion Table: ");
		System.out.println("1. Farenheight to Celcius:	(F-32)*5/9");
		System.out.println("2. Celcius to Farenheight:	C*9/5+32");
		System.out.println("3. Inches to Centimetres:	in*2.54");
		System.out.println("4. Centimetres to Inches:	cm*0.3937");
		System.out.println("5. Pounds to Kilograms:	lb*0.453592");
		System.out.println("6. Kilograms to Pounds:	kg*2.20462");
		
		System.out.print("Please enter the number of the conversion you'd like to use:	");
		choice = EasyIn.getInt();
		
		switch (choice)
			{
				case 1:
				System.out.print("Enter the temperature in farenheight:	");
				farenheight = EasyIn.getDouble();
				celcius = (farenheight-32)*5/9;
				System.out.println(farenheight + " farenheight is " + celcius + " celcius");
				break;
				
				case 2:
				System.out.print("Enter the temperature in celcius:	");
				celcius = EasyIn.getDouble();
				farenheight = celcius*9/5+32;
				System.out.println(celcius + " celcius is " + farenheight+ " farenheight");
				break;
				
				case 3:
				System.out.print("Enter the length in inches:	");
				inches = EasyIn.getDouble();
				centimetres = inches*2.54;
				System.out.println(inches + " inches is " + centimetres + " centimetres");
				break;
				
				case 4:
				System.out.print("Enter the length in centimetres:	");
				centimetres = EasyIn.getDouble();
				inches = centimetres*0.3937;
				System.out.println(centimetres + " centimetres is " + inches + " inches");
				break;
				
				case 5:
				System.out.print("Enter the weight in pounds:	");
				pounds = EasyIn.getDouble();
				kilograms = pounds*0.453592;
				System.out.println(pounds + " lb is " + kilograms + " kilograms");
				break;
				
				case 6:
				System.out.print("Enter the weight in kilograms:	");
				kilograms = EasyIn.getDouble();
				pounds = kilograms*2.20462;
				System.out.println(kilograms + " kg is " + pounds + " pounds");
				break;
				
				default:
				System.out.println("Please enter a valid input");
				
			}
		
	}
	
}