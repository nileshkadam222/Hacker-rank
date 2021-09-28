package hacker.rank.java;

import java.time.LocalDate;
import java.util.Calendar;

public class CalenderObjectTest {
	public static void main(String[] args) {

		int month = 9;

		int day = 28;

		int year = 2021;

		String res = java8.getDay(month, day, year);

	}
}

class Result {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {
		Calendar cc = Calendar.getInstance();
		cc.set(year, month, day);
		int i = cc.get(Calendar.DAY_OF_WEEK);
		String dayName = "";
		switch (i) {
		case 1:
			dayName = "Sunday";
			break;
		case 2:
			dayName = "Monday";
			break;
		case 3:
			dayName = "Tuesday";
			break;
		case 4:
			dayName = "Wednesday";
			break;
		case 5:
			dayName = "Thursday";
			break;
		case 6:
			dayName = "Friday";
			break;
		case 7:
			dayName = "Saturday";
		}
		return dayName;
	}

}

class java8 {
	public static String getDay(int month, int day, int year) {
		return LocalDate.of(year, month, day).getDayOfWeek().name();
	}
}
