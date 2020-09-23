package comp2522.code.week2;

public class PassByValue {

    /*
    This swap method does nothing because Java is PASS BY VALUE!
     */
    public static void swap(String a, String b) {
        String temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        // Objects are stored inside the heap
        String string1 = "Hello";
        String string2 = "Greetings!";

        /* Original references are untouched.
        Copied the address of string1 and string2 and passed the copies to the swap method.
        Also known as aliases.
         */
        swap(string1, string2);
    }

}
