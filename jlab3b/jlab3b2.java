class jlab3b2
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
		double totalBread;
		double totalMilk;
		double totalCoffee;
		double totalButter;
		double total;
		int iterationBread;
		int iterationMilk;
		int iterationCoffee;
		int iterationButter;
		
		total = 0;
		choice = 0;
		totalBread = 0;
		totalMilk = 0;
		totalCoffee = 0;
		totalButter = 0;
		iterationBread = 0;
		iterationMilk = 0;
		iterationCoffee = 0;
		iterationButter = 0;
		
		System.out.println("1.	Bread = 1.50");
		System.out.println("2.	Milk = 1.95");
		System.out.println("3.	Coffee = 1.15");
		System.out.println("4.	Butter = 2.00");
		System.out.println("5.	Finish Transaction");
		
		
		while (choice != 5)
			{
				System.out.print("Which items would you like to buy:	");
				choice = EasyIn.getInt();
				switch(choice)
					{
						case 1:
							{
								total += BREAD;
								totalBread += BREAD;
								iterationBread ++;
								break;
							}
						case 2:
							{
								total += MILK;
								totalMilk+= MILK;
								iterationMilk ++;
								break;
							}
						case 3:
							{
								total += COFFEE;
								totalCoffee += COFFEE;
								iterationCoffee ++;
								break;
							}
						case 4:
							{
								total += BUTTER;
								totalButter += BUTTER;
								iterationButter ++;
								break;
							}
						case 5:
							{
								System.out.println();
								break;
							}
						default:
							{
								System.out.println("Please enter a valid item");
							}
					}
						if (choice == 5)
							{
								System.out.println("Receipt:	");
								System.out.println();
								System.out.println("Bread: " + "(" + iterationBread + ") " + totalBread);
								System.out.println("Milk: " +"(" + iterationMilk + ") " + totalMilk);
								System.out.println("Coffee: " + "(" + iterationCoffee + ") " + totalCoffee);
								System.out.println("Butter: " + "(" + iterationButter + ") " + totalButter);
								System.out.println();
								System.out.println("Your final total is " + total);
							}
			}

	}
}