public class isAlpha
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	24/2/26
/* This program isAlpha() that takes a character
 * as its argument and returns true if the character
 * is alphabetic i.e. in the range A-Z, a-z, otherwise it returns false.*/
 
// Error:	 
// Why:	
{
	public static boolean isAlpha(char alpha)
		{
			return alpha >= 'a' && alpha <= 'z' || alpha >= 'A' && alpha <= 'Z';
		}
	
	public static void main(String[] args)
		{
			System.out.println("is ! part of the alphabet?: " + isAlpha('!'));
			System.out.println("is A part of the alphabet?: " + isAlpha('A'));
		}
}