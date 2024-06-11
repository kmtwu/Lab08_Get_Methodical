import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ask = "Enter the year from which you were born in from 1950 to 2015";
        String ask2 = "Enter your birth month";
        String ask3 = "Enter the day of the month in which you were born";
        String ask4 = "Enter the hour in which you were born from 1 to 24";
        String ask5 = "Enter the number of minutes in the hour you were born";
        int month;
        int dayBound = 0;
        SafeInput.getRangedInt(in, ask, 1950, 2015);
        month = SafeInput.getRangedInt(in, ask2, 1, 12);
        switch (month) {
            case 2:
            {
                dayBound = 29;
            }
            case 4,6,9,11:
            {
                dayBound = 30;
            }
            default:
            {
                dayBound = 31;
            }
        }
        SafeInput.getRangedInt(in, ask3, 1, dayBound);
        SafeInput.getRangedInt(in, ask4, 1, 24);
        SafeInput.getRangedInt(in, ask5, 1, 60);
    }
}
