package comp2522.code.week1;

public class OverflowUnderflow {
    public static void main(String[] args) {
        /* OVERFLOW */

        System.out.println("OVERFLOW: \n");

        byte max_byte = Byte.MAX_VALUE;
        short max_short = Short.MAX_VALUE;
        int max_int = Integer.MAX_VALUE;
        long max_long = Long.MAX_VALUE;

        System.out.println("Byte before: " + max_byte + " Byte after: " + (++max_byte));
        System.out.println("Short before: " + max_short + " Short after: " + (++max_short));
        System.out.println("Int before: " + max_int + " Int after: " + (++max_int));
        System.out.println("Long before: " + max_long + " Long after: " + (++max_long));


        /* UNDERFLOW */

        System.out.println("\nUNDERFLOW: \n");

        byte min_byte = Byte.MIN_VALUE;
        short min_short = Short.MIN_VALUE;
        int min_int = Integer.MIN_VALUE;
        long min_long = Long.MIN_VALUE;

        System.out.println("Byte before: " + min_byte + " Byte after: " + (--min_byte));
        System.out.println("Short before: " + min_short + " Short after: " + (--min_short));
        System.out.println("Int before: " + min_int + " Int after: " + (++min_int));
        System.out.println("Long before: " + min_long + " Long after: " + (++min_long));

    }
}
