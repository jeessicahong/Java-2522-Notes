package comp2522.code.week2;

public class CastExample {

    public static void main(String[] args) {
        int Number = 128;
        System.out.println("128 as a primitive type 'int' is recorded as: " + Number + "\n");

        byte castByteNumber = (byte) Number;
        System.out.println("128 when cast from a type 'int' to type 'byte' becomes: " + castByteNumber);
        System.out.println("150 when cast from a type 'int' to type 'byte' becomes: " + (byte) 150
                + "\nAs you can see, the narrowed case causes the number to wrap around!\n");

        double castDoubleNumber = (double) Number;
        System.out.println("128 when cast from a type 'int' to type 'double' becomes: " + castDoubleNumber + "\n");

        double roundUpNumber = 0.9;
        System.out.println("An upward rounding number like " + roundUpNumber +
                " when cast to a non-decimal primitive rounds to: " + (int) roundUpNumber + "\n");
        double roundDownNumber = 0.1;
        System.out.println("A downward rounding number like " + roundDownNumber +
                " when cast to a non-decimal primitive rounds to: " + (int) roundDownNumber + "\n");

        double roundMiddleCase = 0.5;
        System.out.println("An in-between rounding number like " + roundMiddleCase +
                " when cast to a non-decimal primitive rounds to: " + (int) roundMiddleCase + "\n");

    }

}
