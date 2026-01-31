class jlab22
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	26/9/25
/* This program will calculate the average marks of the user and indicate whether
 *it is a distinction, merit1, merit2, pass or fails*/
 
// Error: syntax error, displays wrong outputs
// Why:	layout on if statements is wrong and no semicolons after the if and else if statements

{
	public static void main(String args [])
	
	{
		double progMark;
		double mathsMark;
		double hardwareMark;
		double average;
		
		System.out.print("Enter your mark for Programming: ");
		progMark = EasyIn.getDouble();
		System.out.print("Enter your mark for Maths: ");
		mathsMark = EasyIn.getDouble();
		System.out.print("Enter your mark for Hardware: ");
		hardwareMark = EasyIn.getDouble();
		
		average = (progMark+mathsMark+hardwareMark)/3;
		
		if (average>=70)
			{			//	align properly 
				System.out.println("Your average " + average + " is a DISTINCTION");
			}
		else if (average>=63 & average<=69)		//	use else if after an if statement
			{
				System.out.println("Your average " + average + " is a MERIT1");
			}
		else if (average>=55 & average<=62)
			{
				System.out.println("Your average " + average + " is a MERIT2");
			}
		else if (average>=40 & average<=54)
			{
				System.out.println("Your average " + average + " is a PASS");
			}
		else
			{
				System.out.println("Your average " + average + " is a FAIL");
			}
	}
}