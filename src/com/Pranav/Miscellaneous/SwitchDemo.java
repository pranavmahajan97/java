package com.Pranav.Miscellaneous;

public class SwitchDemo {

	public static void main(String[] args) {
		String day = args[0];
		Days converted = mappingDaysToEnums(day);
		switch (converted)
		{
		case MONDAY:
			System.out.println("Working Day");
			break;
		case TUESDAY:
			System.out.println("Working Day");
			break;
		case WEDNESDAY:
			System.out.println("Working Day");
			break;
		case THURSDAY:
			System.out.println("Working Day");
			break;
		case FRIDAY:
			System.out.println("Working Day");
			break;
		case SATURDAY:
			System.out.println("Holiday");
			break;
		case SUNDAY:
			System.out.println("Holiday");
			break;
			}
		
	}

	private static Days mappingDaysToEnums(String day) {
		Days days = Days.MONDAY;
		String dayAgain = day.toLowerCase();
		switch (dayAgain) {
		case "mon":
			days = Days.MONDAY;
			break;
		case "tue":
			days = Days.TUESDAY;
			break;
		case "wed":
			days = Days.WEDNESDAY;
			break;
		case "thu":
			days = Days.THURSDAY;
			break;
		case "fri":
			days = Days.FRIDAY;
			break;
		case "sat":
			days = Days.SATURDAY;
			break;
		case "sun":
			days = Days.SUNDAY;
			break;
		

		default:
			break;

		}
		return days;
	}

}

enum Days {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
