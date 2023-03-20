package com.sample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        switchdemo();
    }
    public static void switchdemo() {
    	int day = 4;
    	switch (day) {
    	  case 1:
    	    System.out.println("Monday");
    	    break;
    	  case 2:
    	    System.out.println("Tuesday");
    	    break;
    	  case 3:
    	    System.out.println("Wednesday");
    	    break;
    	  case 4:
    	    System.out.println("Thursday");
    	    break;
    	  case 5:
    	    System.out.println("Friday");
    	    break;
    	  case 6:
    	    System.out.println("Saturday");
    	    break;
    	  case 7:
    	    System.out.println("Sunday");
    	    break;
    	}
    }
    public String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
        String typeOfDay;
        switch (dayOfWeekArg) {
            case "Monday":
                typeOfDay = "Start of work week";
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                typeOfDay = "Midweek";
                break;
            case "Friday":
                typeOfDay = "End of work week";
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay = "Weekend";
                break;
            default:
                throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
        }
        return typeOfDay;
   }
}
