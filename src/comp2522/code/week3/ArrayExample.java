package comp2522.code.week3;

import java.util.Scanner;

public class ArrayExample {

    /* Changing an array element within the method, changes the original.
    * Reference to the array is passed.
    * */
    public static void squareArray(double[] nums, int arrayLength) {
        for (int i = 0; i < arrayLength; i++) {
            nums[i] = Math.pow(nums[i], 2);
        }
    }

    public static void main(String[] args) {
        String[] names;

        System.out.print("Enter the array length: ");
        Scanner scan = new Scanner(System.in);
        int arrayLength = scan.nextInt();

        names = new String[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            names[i] = "Name" + (i + 1);
        }

        for (String name : names) {
            System.out.println(name);
        }


        /* CHANGING ARRAY ELEMENTS */
        double[] nums = {1, 2, 3, 4, 5};

        // Array length is IMMUTABLE.
        int numsLength = nums.length;

        System.out.println("Before: ");
        for (double num : nums) {
            System.out.println(num);
        }

        squareArray(nums, numsLength);

        System.out.println("After: ");
        for (double num : nums) {
            System.out.println(num);
        }

    }

}
