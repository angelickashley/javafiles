class jlab3b1
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	4/11/25
/*Write a simple cash register program using a while loop*/
 
// Error: logic error
// Why:	forgot the breaks
{
	public static void main(String[] args)
	{
		int choice;
		final double BREAD = 1.50;
		final double MILK = 1.95;
		final double COFFEE = 1.15;
		final double BUTTER = 2.00;
		double total;
		
		System.out.println("1.	Bread = 1.50");
		System.out.println("2.	Milk = 1.95");
		System.out.println("3.	Coffee = 1.15");
		System.out.println("4.	Butter = 2.00");
		total = 0;
		choice = 0;
		
		while (choice != 5)
			{
				System.out.print("Which items would you like to buy:	");
				choice = EasyIn.getInt();
				switch(choice)
					{
						case 1:
							{
								total += BREAD;
								break;
							}
						case 2:
							{
								total += MILK;
								break;
							}
						case 3:
							{
								total += COFFEE;
								break;
							}
						case 4:
							{
								total += BUTTER;
								break;
							}
					}
						if (choice == 5)
							{
								System.out.println("Your final total is " + total);
							}
			}

	}
}