class Multiply

//Angelic Kyle Ashley Batan - C00317625
// Class B
// A Simple program that multiplies three numbers entered from the keyboard
// 23/9/25

{
	public static void main(String args[])
	{
		int number1;
		int number2;
		int number3;
		int answer;
		
		System.out.print("Enter the first number -> ");
		number1 = EasyIn.getInt();
		System.out.print("Enter the second number -> ");
		number2 = EasyIn.getInt();
		System.out.print("Enter the third number -> ");
		number3 = EasyIn.getInt();
		answer = number1*number2*number3;
		System.out.println("The product of the three numbers is " + answer);	
	}
}