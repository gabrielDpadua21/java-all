package all.java.java360.exercicies;

import java.util.Scanner;

public class WeekDayName {
    public static void main(String[] args) {

        int value;

        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number to see the week day name: ");
        value = Integer.parseInt(sc.nextLine());

        String weekName = switch (value) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day!";
        };

        System.out.println("is: " + weekName);

    }
}
