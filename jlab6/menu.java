public class award
import java.util.Scanner;
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	3/3/2026
/* method menu for the menu option, and a method for each conversion*/
 
// Error:	 
// Why:	

{
  public static double fahrToCel(double cel)
    {
      cel = (number-32)*5.0/9.0;
      return (number + "is " + cel + " in celcius");
    }
  public static double celToFahr(double fahr)
    {
      fahr = (number*9.0/5.0)+32;
      return (number + "is " + fahr + " in fahr");
    }
  public static double inchToCent(double cent)
    {
      cent = number*2.54;
      return (number + "is " + cent + " in cent");
    }
  public static double centToInch(double inch)
    {
      inch = number/2.54;
      return (number + "is " + inch + " in inch");
    }
  public static double poundsToKg(double kg)
    {
      kg = number*0.45392;
      return (number + "is " + kg + " in kg");
    }
  public static double kgToPounds(double pounds)
    {
       pounds = number/0.45392;
       return (number + "is " + pounds + " in pounds");
    }
  public static String menu()
     {
        return 1. Fahrenheit to celcius
        return 2. Celcius to Fahrenheit
        return 3. Inches to centimetres
        return 4. Centimetres to inches
        return 5. Pounds to Kilograms
        return 6. Kilograms to Pounds
        return 7. Exit Program
      }
  public static void main(String[] args)
     {
        int choice;
        int number;
        Scanner sc = new Scanner(System.in);
        menu();
        System.out.print("What conversion would you like to use: ");
        choice = sc.nextInt();
        while (choice!=7)
          {
            menu();
            System.out.print("What conversion would you like to use: ");
            choice = sc.nextInt();
            switch
              {
              case 1:
                System.out.print("What number would you like to convert: ");
                number = sc.nextInt();
                fahrToCel();
              case 2:
                System.out.print("What number would you like to convert: ");
                number = sc.nextInt();
                celToFahr();
              case 3:
                System.out.print("What number would you like to convert: ");
                number = sc.nextInt();
                inchToCent();
              case 4:
                System.out.print("What number would you like to convert: ");
                number = sc.nextInt();
                centToInch();
              case 5:
                System.out.print("What number would you like to convert: ");
                number = sc.nextInt();
                poundsToKg();
              case 6:
                System.out.print("What number would you like to convert: ");
                number = sc.nextInt();
                kgToPounds();
            }
         }
    }
}
