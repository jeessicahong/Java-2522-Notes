package comp2522.code.week3;

public class LongBinary {

    public static void main(String[] args) {
        long exampleLong1 = Long.MAX_VALUE;
        long exampleLong2 = 1975623000;

        System.out.println("Example 1: " + exampleLong1);
        System.out.println("Example 2: " + exampleLong2);

        // Returns a hash code for a Long as an int
        System.out.println(Long.hashCode(exampleLong1));
        System.out.println(Long.hashCode(exampleLong2));
    }
}
