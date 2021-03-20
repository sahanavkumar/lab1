/**
* name: sahana B V
*Description : Find the duration in days months and year
* date:3/19/2021
*/
import java.time.*;
import java.util.*;

public class StringAssignment7 {  
   public static void main(String[] args)
    {
        LocalDate pdate = LocalDate.of(2019, 03, 16);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
     System.out.println("Difference in year is: "+diff.getYears()+ " Years " +diff.getMonths()+ " months " +diff.getDays()+ " days");
  }
}
