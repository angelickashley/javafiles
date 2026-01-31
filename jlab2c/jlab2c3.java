class jlab2c3
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	17/10/25
/* This program asks for
 input electricity units used and calculate total
  electricity bill according to this criteria:
-	For first 50 units 0.50/unit
-	For next 100 units  0.75/unit
-	For next 100 units 1.20/unit
-	For unit above 250 1.50/unit
-	An additional surcharge of 20% is added to the bill
 */
 
// Error: 
// Why:	

{
	public static void main(String[] args)
	{
		double units;
		final double FIRST50 = 0.50;
		final double ANSWERFIRST50 = 25;
		final double NEXT100 = 0.75;
		final double ANSWERNEXT100 = 75;
		final double NEXT_NEXT100 = 1.20;
		final double ANSWERNEXT_NEXT100 = 120;
		final double ABOVE250 = 1.50;
		double total;
		final double SURCHARGE = 0.20;
		
		
		System.out.print("Enter the electricity units used: ");
		units = EasyIn.getDouble();
		
		if (units <= 50)
			{
				total = units*FIRST50;
			}
		
		else if (units >=51 && units <= 150)
			{
				units-=50;
				total = ANSWERFIRST50 + (units*NEXT100);
				System.out.println("Your total is " + total);
			}
		
		else if (units >=151 && units <= 250)
			{
				units-=150;
				total = ANSWERFIRST50 + ANSWERNEXT100 + (units*NEXT_NEXT100);
				System.out.println("Your total is " + total);
			}
			
		else
			{
				units-=250;
				total = ANSWERFIRST50 + ANSWERNEXT100 +  ANSWERNEXT_NEXT100 + (units*ABOVE250);
				System.out.println("Your total is " + total);
			}
			
		total = total + (total*SURCHARGE);
		System.out.println("Your total bill is " + total);
	}
		
	
}