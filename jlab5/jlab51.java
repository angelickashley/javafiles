class jlab51
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	30/01/26
/* This program count the number of words in a string (a-z/A-Z) seperated by spaces*/
 
// Error:	 
// Why:	

class Jlab51 {
     public static void main(String[] args) {
         String sentence;
         int space;
         String currentWord;
         char character;
         int count = 0;
         boolean isValidWord;
         int charIndex;
         System.out.print("Enter a string of words: ");
         sentence = EasyIn.getString();
         // Process while there's text to handle
         while (sentence.length() > 0) {
             space = sentence.indexOf(' ');
             isValidWord = true;
             charIndex = 0;
             // Handle consecutive spaces without continue
             if (space == 0) {
                 sentence = sentence.substring(1);
             } else {
                 // Extract current word correctly
                 if (space != -1) {
                     currentWord = sentence.substring(0, space);
                     sentence = sentence.substring(space + 1);
                 } else {
                     currentWord = sentence;
                     sentence = "";
                 }
                 // Check all characters without break
                 while (charIndex < currentWord.length() && isValidWord) {
                     character = currentWord.charAt(charIndex);
                     if (!((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z'))) {
                         isValidWord = false;
                     }
                     charIndex++;
                 }
                 // Count and print valid words
                 if (isValidWord && currentWord.length() > 0) {
                     count++;
                     System.out.println(currentWord + " is a word");
                 }
             }
         }
         System.out.println("The amount of valid words are: " + count);
     }
 }
