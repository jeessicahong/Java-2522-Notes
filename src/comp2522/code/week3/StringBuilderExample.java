package comp2522.code.week3;

/**
 * Use examples of StringBuilder: mutable Strings.
 */
public class StringBuilderExample {

    public static void main(String[] args) {
        /* PALINDROME */
        String palindrome = "racecar";
        StringBuilder sb = new StringBuilder(palindrome);
        sb.reverse();

        // Convert 'sb' to a String when finished
        System.out.println(sb.toString().equals(palindrome));


        /* REPLACE */
        String name = "Eric";
        StringBuilder myNameIs = new StringBuilder("My name is Jessica.");

        System.out.println(myNameIs.toString());

        myNameIs.replace(11, myNameIs.length() - 1, name);

        System.out.println(myNameIs.toString());
    }
}
