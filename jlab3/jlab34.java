class jlab34
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	7/11/25
/* This program will a program that will
  find the largest, smallest and average value in a collection of N numbers*/
 
// Error: 
// Why:	

{
	public static void main(String[] args)
	{
		int index;
		int noOfIteration;
		double number;
		double highestNum;
		double lowestNum;
		double sum;
		double average;
		
		lowestNum = 0;
		highestNum = 0;
		sum = 0;
		
		System.out.print("How many numbers would you like to input?: ");
		noOfIteration = EasyIn.getInt();
		
		for (index = 1; index <= noOfIteration; index++)
			{
				System.out.print("Enter number: ");
				number = EasyIn.getDouble();
				sum += number;	//	sum = sum + number;
				
				if (index == 1)	//	change highest and lowest number for first input
					{
						highestNum = number;
						lowestNum = number;
					}
				if (number > highestNum)
					{
						highestNum = number;
					}
				if (number < lowestNum)
					{
						lowestNum = number;
					}
			}
		System.out.println("The highest number is: " + highestNum);
		System.out.println("The lowest number is: " + lowestNum);
		average = sum/noOfIteration;
		System.out.println("The average is " + average);
	}
}