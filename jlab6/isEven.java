public class isEven
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	24/2/26
/* This program takes an integer as its argument and returns true if the argument
 is an even number otherwise it returns false*/
 
// Error:	 
// Why:	
{
	public static boolean isEven(int num)
		{
			return num % 2 == 0;
		}
	
	public static void main(String[] args)
		{
			System.out.println("is 10 even?: " + isEven(10));
			System.out.println("is 5 even?: " + isEven(5));
		}
}