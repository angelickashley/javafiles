class jlab12

//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	23/9/25
/* This program is to calculate the average miles per hour
 and the miles per gallon*/


// Error: line 25
// Why: d was not capitalised in Double and forgot ()

{
	public static void main (String args[])
	
	{
			double distance;
			double timeHours;
			double gallonPetrol;
			double avgMiles;
			double milesGallon;
			
			System.out.print("Enter the distance travelled in miles: ");				//	Input
			distance = EasyIn.getDouble();
			System.out.print("Enter the amount of time spent on the trip in hours: ");
			timeHours = EasyIn.getDouble();
			System.out.print("Enter the amount of gallons of petrol used: ");
			gallonPetrol = EasyIn.getDouble();
			
			avgMiles = distance/timeHours;			// calculations or process
			gallonPetrol = distance/gallonPetrol;
			
			System.out.println("The average miles per hour is " + avgMiles);		//	Output
			System.out.println("The miles per gallon is " + gallonPetrol);
	}
	
}