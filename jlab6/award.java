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
        return("Distinction");
      }
    else if(mark>=63 && mark<=69)
      {
        return("Merit1");
      }
    else if(mark>=55 && mark<=62)
      {
        return("Merit2");
      }
    else if(mark>=40 && mark<=54)
      {
        return("Pass");
      }
    else if(mark>=40 && mark<=0);
      {
        return("Fail");
      }
    else
      {
        return("Please enter a valid input");
      }
  }
}
