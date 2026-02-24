public class alphaCount
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	24/2/26
/* This program takes a string as its argument and returns the number 
 *of alphabetic characters in that string*/
 
// Error:	 
// Why:	
{
	public static boolean isAlpha(char alpha)
		{
			return (alpha >= 'a' && alpha <= 'z') || (alpha >= 'A' && alpha <= 'Z');
		}
		
	public static int alphaCount(String alpha)
		{
			int count;
			count = 0;
			char currentChar;
			int i; //iterations
			for (i = 0; i < alpha.length(); i++)
			{
				currentChar = alpha.charAt(i);
				if (isAlpha(currentChar))
					{
						count++;// only increments for valid letters
					}
			}
			return count;
		}
	public static void main(String[] args)
		{
			String alpha;
			System.out.print("Enter a word: ");
			alpha = EasyIn.getString();
			System.out.println("The number of alphabetic characters is " + alphaCount(alpha));
			
		}
}