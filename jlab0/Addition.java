class Addition
//Angelic Kyle Ashley Batan - C00317625
// Class B
// A Simple program that adds two numbers entered from the keyboard
// 23/9/25
{  
      public static void main(String args[])
        {
  	int number1;
	int number2;
	int answer;

	System.out.print("Enter the first number ->  ");
        	number1 = EasyIn.getInt();
        	System.out.print("Enter the second number ->  ");
        	number2 = EasyIn.getInt();
        	answer = number1 + number2;
        	System.out.println("The sum of the two numbers is " + answer) ;
        }
}