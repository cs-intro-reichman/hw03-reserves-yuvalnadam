/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {

       int countSundays = 0;
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (year <= 1999) {
		
                    if (dayOfWeek == 1) {
                   	System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
                   }
                  
                    else {
                        System.out.println(dayOfMonth + "/" + month + "/" + year);
                    }
                    if(dayOfWeek == 2 && dayOfMonth == 1)
                   			countSundays++;

             advance();
	 		debugDaysCounter++;

       
}
	System.out.println("During the 20th century, " + countSundays + " fell on the first day of the month");	
	
}
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
         dayOfWeek = (dayOfWeek % 7) + 1;
         dayOfMonth++;

        if (dayOfMonth > nDaysInMonth(month, year)) {
            dayOfMonth = 1; 
            month++;
			}
            
            if (month > 12) {
                month = 1; 
                year++;

             
               }
              
          }
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	   int y = year; 

		if(((y % 400) == 0) || ((y % 4) == 0) && ((y % 100) != 0))
			return true;
		else
			return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		
		int m = month;
		int y = year;

		switch (m) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;

            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;

            case 2: // February
            	if (isLeapYear(y))
                	return 29;

                else 
                	return 28; 
        }

        return 0;

	}
}