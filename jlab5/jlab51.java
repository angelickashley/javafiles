class jlab51
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	30/01/26
/* This program count the number of words in a string (a-z/A-Z) seperated by spaces*/
 
// Error:	 
// Why:	

{
	public static void main(String[] args)
		{
			String sentence;
			int space;
			boolean validChar;
			String currentWord;
			char character;
			int count;
			int index;
									
			System.out.print("Enter a string of words: ");
			sentence = EasyIn.getString();
			space = sentence.indexOf(' ');
			
			character = ' ';
			index = 0;
			
			currentWord = sentence.substring(0, space);
			sentence = sentence.substring(space+1);
			
			while (sentence.length()>0)
				{
					sentence.indexOf(' ');
					validChar = true;
					count = 0;
					if (space!=-1)
						{
							currentWord = sentence.substring(0, space);
							sentence = sentence.substring(space+1);
						}
						
					else
						{
							currentWord = sentence;
							sentence = " ";
						}
					
					while (character < currentWord.length() && validChar)
						{
							character = currentWord.charAt(count);
							if (!(character >= 'A' && character <='Z') || character >= 'a' && character <='z')
								{
									validChar = false;
								}
							index++;
						}
					if (validChar && currentWord.length() > 0)
						{
							count++;
							System.out.println(currentWord + " is a word");
						}
					System.out.println("The amount of valid words are: " + count);
				}

			}
}