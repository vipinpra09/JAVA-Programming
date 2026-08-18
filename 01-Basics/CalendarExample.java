import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class CalendarExample {
    public static void main(String[] args) {
        int year = 2026;
        Month month = Month.JANUARY;

        // 1️⃣ Get first day of the month
        LocalDate firstDay = LocalDate.of(year, month, 1);
        DayOfWeek firstWeekDay = firstDay.getDayOfWeek();

        // 2️⃣ Print header
        System.out.println("Calendar for " + month + " " + year);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        // 3️⃣ Print initial spaces
        int value = firstWeekDay.getValue(); // 1 = Monday ... 7 = Sunday
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }

        // 4️⃣ Print days of the month
        int length = firstDay.lengthOfMonth();
        for (int day = 1; day <= length; day++) {
            System.out.printf("%3d ", day);

            // Move to next line at Sunday
            if ((day + value - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
