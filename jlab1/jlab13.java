class jlab13


//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	23/9/25
/* This program is to  display three numbers, and display, their sum, product and the average of the three.*/

// Error: 
//Why:


{
	
	public static void main (String args[])
	{
		
		int num1;
		int num2;
		int num3;
		float sum;
		float product;
		float avg;
		
		System.out.print("Enter the first number: ");		//	Inputs
		num1 = EasyIn.getInt();
		System.out.print("Enter the second number: ");
		num2 = EasyIn.getInt();
		System.out.print("Enter the third number: ");
		num3 = EasyIn.getInt();
		sum = num1 + num2 + num3;							//	Calculations
		product = num1 * num2 * num3;
		avg = sum/3;
		System.out.println("The sum is " + sum);			//	Outputs
		System.out.println("The product is " + product);
		System.out.println("The average is " + avg);
		
	}
}