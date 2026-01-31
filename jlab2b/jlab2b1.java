class jlab2b1
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	26/9/25
/* This program calculates the insurance premium for the coming year*/
 
// Error: 
// Why:	

{
	public static void main(String args[])
	{
		double lastYear;		//last year's premium value
		double claimsMade;		//input of claims made
		double increase;		//5% increase of last year's premium
		double noClaims;		//formula if no claims made
		double yesClaims;		//formula for claims made
		
		System.out.print("Enter your last year's premium value: ");
		lastYear = EasyIn.getDouble();
		System.out.print("Enter the amount of claims made: ");
		claimsMade = EasyIn.getDouble();
		
		increase = lastYear*1.05;
		
		if (claimsMade == 0)
		{
			noClaims = increase*0.60;
			System.out.println("Your total is " + noClaims);	//40% discount
		}
		
		else
		{
			yesClaims = 1+(0.20*claimsMade);
			System.out.println("Your total is " + yesClaims);	//20% increase per claim
		}
	}
}