package comp2522.code.week2;

public class OverloadingMethods {

    /* OVERLOADING: Same method can be redefined with more than one signature.
    Two methods with the same name, number of parameters, sequence of parameters.
    */

    public static int add(int x, int y) {
        return x + y;
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        /*
        Even though the method name is the same, the compiler can tell which method to call by looking at the
        parameter types.
         */
        System.out.println(add(1, 3));
        System.out.println(add(1.0, 3.0));
    }

}
