class jlab3b3
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	4/11/25
/*Write a program that prints a multiplication table*/
 
// Error: 
// Why:	

{
	public static void main(String args[])
	{
		int num;
		
		num = 1;
		
		for(num = 1; num<= 12; num++)
			{
				System.out.printf("%4d", num*1);	//'%4d' format to occupy four spaces
				System.out.printf("%4d", num*2);
				System.out.printf("%4d", num*3);
				System.out.printf("%4d", num*4);
				System.out.printf("%4d", num*5);
				System.out.printf("%4d", num*6);
				System.out.printf("%4d", num*7);
				System.out.printf("%4d", num*8);
				System.out.printf("%4d", num*9);
				System.out.printf("%4d", num*10);
				System.out.printf("%4d", num*11);
				System.out.printf("%4d", num*12);
				System.out.println();
			}
	}
}