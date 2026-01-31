class Temperature
//Angelic Kyle Ashley Batan - C00317625
// Class B
// 23/9/25
/* This program will allow user convert a temperature in Fahrenheit to Centigrade*/
//
{
	public static void main(String args[])
		{
			int fahrenheit;
			int centigrade;
	
			System.out.print("Enter your temperature in Fahrenheit -> ");
			fahrenheit = EasyIn.getInt();
			centigrade = (fahrenheit-32)*5/9;
			System.out.println("The temperature " + fahrenheit + " is " + centigrade + " in centigrade");
		}
}