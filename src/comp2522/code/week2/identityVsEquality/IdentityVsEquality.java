package comp2522.code.week2.identityVsEquality;

public class IdentityVsEquality {

    public static void main(String[] args) {
        /*
        Identity: Same object instance.
        Equality: Two different object instances containing the same data.
         */
        final Person person1 = new Person("Jessica");
        final Person person2 = new Person("Eric");
        final Person person3 = new Person("Eric");
        final Person person4 = person1;

        /* IDENTITY */

        // Not the same object instance, therefore false.
        System.out.println(person1 == person2);

        // The same object instance, therefore true.
        System.out.println(person4 == person1);

        /* EQUALITY */

        // Does not contain the same data, therefore false.
        System.out.println(person1.equals(person2));

        // Is person2 and person3 the same person? No.
        System.out.println(person2.equals(person3));

        // Does person2 and person3 have the same name? Yes.
        System.out.println(person2.getName().equals(person3.getName()));
    }

}
