
public class Calendar {	
	static int dayOfMonth = 1;   
	static int month = 1;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	
	/** 
	 * Prints the calendar of a given year from a command-line argument
	 */
	public static void main(String args[]) {

		int year = Integer.parseInt(args[0]);

		while(month <= 12)
		{
			int daysInMonth = nDaysInMonth(month, year); 

			for (int i = 1; i <= daysInMonth ;i++ ) {

			if (dayOfWeek == 1) {
                   	System.out.println(i + "/" + month + "/" + year + " Sunday");
                   }
                  
                    else {
                        System.out.println(i + "/" + month + "/" + year);
                    }

		dayOfWeek = (dayOfWeek % 7) + 1;
			
		}
		month++;


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