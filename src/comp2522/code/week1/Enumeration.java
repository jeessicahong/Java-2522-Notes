package comp2522.code.week1;

import java.util.Random;

public class Enumeration {

    public enum DaysOfTheWeek {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }

    public static void main(String[] args) {
        final Random random = new Random();

        final int randomDay = random.nextInt(DaysOfTheWeek.values().length);
        final DaysOfTheWeek day = DaysOfTheWeek.values()[randomDay];

        switch (day) {
            case Monday -> System.out.println("Boo, it's Monday.");
            case Tuesday -> System.out.println("It's like Monday, only slightly better.");
            case Wednesday -> System.out.println("Halfway through the week!");
            case Thursday -> System.out.println("Almost to Friday!");
            case Friday -> System.out.println("Woohoo! It's Friday! TGIF!");
            case Saturday -> System.out.println("Let's get drunk!");
            case Sunday -> System.out.println("Relaxation day.");
            default -> throw new AssertionError("Unknown!");
        }
    }

}
