class jlab2c2
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	24/10/25
/* This program computes a dog's age in dog years */
 
// Error: 
// Why:	

{
	public static void main(String[] args)
	{
		double age;
		double firstYears;
		double totalAge;
		
		System.out.print("Enter your dog's age: ");
		age = EasyIn.getDouble();
		
		if (age == 2)
			{
				System.out.println("Your dog is 10.5 years old in dog years");
			}
		
		else if(age<0)
			{
				System.out.println("Please enter a valid input");
			}
			
		else
			{
				firstYears = age - 2;
				totalAge = 10.5 + (firstYears*4);
				System.out.println("Your dog's age is " + totalAge + " years old in dog years");
			}
	}
}