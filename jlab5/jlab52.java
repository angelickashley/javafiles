class jlab52
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	3/2/26
/* This program outputs the words input by the user in reverse order ("This word is 3 chars"  becomes "chars 3 is word This")*/
 
// Error:	 
// Why:	
{
        public static void main(String[] args)
        	{
        		String sentence;
        		String currentWord;
        		char character;
        		boolean isValidWord;
        		int charIndex;
        		int space;
        		String reversedResult = ""; // Stores final reversed valid words
        		
        		System.out.print("Enter a string of words: ");
        		sentence = EasyIn.getString();
        		while (sentence.length() > 0)
        			{
        				space = sentence.indexOf(' ');
        				isValidWord = true;  // Handle word extraction (with consecutive space check)
        				if (space != -1)
        					{  // Skip empty "words" from consecutive spaces
        						if (space == 0)
        							{
        								sentence = sentence.substring(space + 1);
        								continue; // Recheck string after removing leading space
        							}
                                      currentWord = sentence.substring(0, space);
                                      sentence = sentence.substring(space + 1);
                            }
                        else
                        	{
                        		currentWord = sentence;
                        		sentence = "";   //No more spaces remain
                        	}
                           // Validate word (only A-Z/a-z allowed)
                        charIndex = 0;
                        while (charIndex < currentWord.length())
                        	{
                        		character = currentWord.charAt(charIndex);
                        		if (!((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')))
                        			{
                        				isValidWord = false;
                        				break;   // to stop checking invalid word early
                        			}
                        		charIndex++;
                        	}
                           // Add valid word to reversed result (prepend to build reverse order)
                           if (isValidWord && currentWord.length() > 0)
                           	{
                           		if (reversedResult.length() > 0)
                           			{
                           				reversedResult = currentWord + " " + reversedResult;
                           			}
                           		else
                           			{
                           				reversedResult = currentWord;
                           			}
                           	}
                        }
                // Print final reversed valid words
                System.out.println("Reversed valid words: " + reversedResult);
            }
}
