import java.util.*;

public class DayFinder {

    public static void main(String[] Ashmit) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day: ");
        int day = sc.nextInt();

        System.out.println("Enter month: ");
        int month = sc.nextInt();

        System.out.println("Enter year: ");
        int year = sc.nextInt();

        if (!isValidDate(day, month, year)) {
            System.out.println("Invalid date entered.");
            return;
        }

        // Adjust month and year for Zeller's algorithm
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int q = day;
        int m = month;
        int d = year % 100;      // last 2 digits
        int c = year / 100;      // first 2 digits

        int f = q + (13 * (m + 1)) / 5 + d + d / 4 + c / 4 + 5 * c;
        int h = f % 7;

        // Zeller's day mapping: 0=Saturday, 1=Sunday, ..., 6=Friday
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        System.out.println("The day is: " + days[h]);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int day, int month, int year) {
        if (year < 0 || month < 1 || month > 12 || day < 1) {
            return false;
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        return day <= daysInMonth[month - 1];
    }
}
