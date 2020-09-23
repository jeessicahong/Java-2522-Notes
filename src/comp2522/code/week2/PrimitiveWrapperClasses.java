package comp2522.code.week2;

public class PrimitiveWrapperClasses {

    public static void main(String[] args) {
        /* DOUBLE */

        // d1 is numerially equal to d2, returns 0
        System.out.println(Double.compare(1.2, 1.2));

        // d1 is numerically less than d2, returns -1
        System.out.println(Double.compare(1.2, 3.1));

        // d1 is numerically greater than d2, returns 1
        System.out.println(Double.compare(3.2, 3.1));
    }

}
