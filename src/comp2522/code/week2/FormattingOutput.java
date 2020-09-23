package comp2522.code.week2;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class FormattingOutput {
    public static final double TAX_RATE = 1.12;
    public static final double num = 3.9;
    public static final float floatingPointNum = 25.09878f;

    public static void main(String[] args) {
        /* NumberFormat */

        // Returns a currency format
        final NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormat.format(3.87 * TAX_RATE));

        // Returns a percentage format
        final NumberFormat percentFormat = NumberFormat.getPercentInstance();
        System.out.println(percentFormat.format(TAX_RATE));

        // Returns an integer number format
        final NumberFormat integerFormat = NumberFormat.getIntegerInstance();
        System.out.println(integerFormat.format(TAX_RATE));

        // Returns integer number format that has floor rounding
        final NumberFormat integerRoundedFormat = NumberFormat.getIntegerInstance();
        integerRoundedFormat.setRoundingMode(RoundingMode.FLOOR);
        System.out.println("Without rounding: " + integerFormat.format(num));
        System.out.println("Before rounding: " + num + "\nAfter rounding: " + integerRoundedFormat.format(num));


        /* DecimalFormat */

        // Removes leading zeros (#)
        String omitLeadingZeros = "###.##";
        final DecimalFormat noLeadingZerosFormat = new DecimalFormat(omitLeadingZeros);
        System.out.println(noLeadingZerosFormat.format(00111.23984723984));

        // Numbers are displayed the same as the pattern (0)
        String leadingZeros = "000.00";
        final DecimalFormat leadingZerosFormat = new DecimalFormat(leadingZeros);
        System.out.println(leadingZerosFormat.format(TAX_RATE));


        /* String Formatting */

        String placeAString = "I was placed here!";
        String fullString = String.format("I belong here. %s", placeAString);
        System.out.println(fullString);

        String floatingPointFormat = String.format(floatingPointNum + " has been formatted with Precision 3: %.3f",
                floatingPointNum);
        System.out.println(floatingPointFormat); // 25.09878 to 25.099 --> Rounded up instead of truncating!


        /* Formatter */

        Formatter fmt = new Formatter();
        fmt.format("%s gap filler %d %f", "Astring", 10, 12.3);
        System.out.println(fmt.out()); // out() returns the destination for the output

        // Formatted strings in reverse order
        Formatter fmt2 = new Formatter();
        fmt2.format("%3$3s %2$3s %1$3s", "fear", "strengthen", "weakness");
        System.out.println(fmt2);

        Formatter f3=new Formatter();
        f3.format(Locale.CANADA, "%.5f", -1325.789);
        System.out.println(f3);

        Formatter f4=new Formatter();
        f4.format(Locale.GERMANY,"%1$te %1$tB, %1$tY",
                Calendar.getInstance());
        System.out.println(f4);

        Formatter f5 = new Formatter();
        f5.format("Format%n %.2f%% complete", 46.6);
        System.out.println(f5);
    }
}
