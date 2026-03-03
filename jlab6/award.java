public class award
//Student Name: Angelic Kyle Ashley Batan
//Student ID:	C00317625
//Class B
//Date:	3/3/2026
/* takes a mark as its argument and returns as its result a String containing
the values of either “Distinction”, “Merit1”, “Merit2”, “Pass” or “Fail”*/
 
// Error:	 
// Why:	
{
  public static String award(int mark)
  {
    if (mark>=70 && mark<=100)
      {
        System.out.println("Distinction");
      }
    else if(mark>=63 && mark<=69)
      {
        System.out.println("Merit1");
      }
    else if(mark>=55 && mark<=62)
      {
        System.out.println("Merit2");
      }
    else if(mark>=40 && mark<=54)
      {
        System.out.println("Pass");
      }
    else if(mark>=40 && mark<=0);
      {
        System.out.println("Fail");
      }
    else
      {
        System.out.println("Please enter a valid input");
      }
  }
}
