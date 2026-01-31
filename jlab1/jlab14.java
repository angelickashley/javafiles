class jlab14


//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	23/9/25
/* This program is to calculate the sum, prodect and average after
 each number is inputted*/


// Error: 
// Why:


{
	
	public static void main (String args[])
	{
		
		int num1;
		int num2;
		int num3;
		float sum;
		float product;
		float avg;
		
		System.out.print("Enter the first number: ");		// first iteration
		num1 = EasyIn.getInt();
		sum = num1;
		product = num1;
		avg = sum;
		System.out.println("The sum is " + sum);
		System.out.println("The product is " + product);
		System.out.println("The average is " + avg);
		

		System.out.print("Enter the second number: ");		// second iteration
		num2 = EasyIn.getInt();
		sum = num1 + num2;
		product = num1 * num2;
		avg = sum/2;
		System.out.println("The sum is " + sum);
		System.out.println("The product is " + product);
		System.out.println("The average is " + avg);
		

		System.out.print("Enter the third number: ");		// third or last iteration
		num3 = EasyIn.getInt();
		sum = num1 + num2 + num3;
		product = num1 * num2 * num3;
		avg = sum/3;
		System.out.println("The sum is " + sum);
		System.out.println("The product is " + product);
		System.out.println("The average is " + avg);
		
	}
}