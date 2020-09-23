package comp2522.code.week3;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Use Big Numbers when EXACT values are needed.
 */
public class BigNumbers {

    public static void factorial(int upperbound, BigInteger factorial) {
        for (int i = 2; i <= upperbound; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);
    }

    public static void main(String[] args) {
        /* BIG INTEGER */
        int upperbound = 15;
        BigInteger value = BigInteger.valueOf(1);

        factorial(upperbound, value);

        /* BIG DECIMAL */
        BigDecimal largeDecimal = new BigDecimal("31984.91823478921394821938748923178");
        BigDecimal smallerDecimal = new BigDecimal("31984.9182278921394821938748923178");

        // Outputs true since smallerDecimal is smaller than largeDecimal
        System.out.println(smallerDecimal.compareTo(largeDecimal) < 0);
    }
}
