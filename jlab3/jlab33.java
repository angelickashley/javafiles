class jlab33
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	4/11/25
/* This program will read a list of integer values which will find and display
the index of the first occurrence and the last occurrence of the number 12. 
Your program should print the Index values of 0 (zero) if the number 12 is not found.
The index is the sequence number of the data item 12.
For example if the 8th data item is the only 12,
the index value 8 should be displayed for the first and last occurrence*/
 
// Error: 
// Why:	

{
	public static void main(String[] args)
	{
		int currentNumber;
		int noOfValues;
		int index;
		int lastOccurence = 0;
		int firstOccurence = 0;
		int count = 0;
		
		System.out.print("Enter the number of values: ");
		noOfValues = EasyIn.getInt();
		
		for(index = 1; index <= noOfValues; index++)	// index = initial value, index <= noOfValues = conditional expression, index++ increment/decrement operator
			{
				System.out.print("Enter number " + index + " : ");
				currentNumber = EasyIn.getInt();
				
				if (currentNumber == 12)
					{
						count ++;	// counts the number of the occurence of the number 12
						// count = count + 1;
						if(firstOccurence == 0)	//	first only occurs once
							{
								firstOccurence = index;
							}
						
						lastOccurence = index;
					}
			}
		System.out.println("First Occurence is at position " + firstOccurence);
		System.out.println("Last Occurence is at position " + lastOccurence);
		System.out.println("The number 12 has been entered " + count + " times");
		}		
}	
