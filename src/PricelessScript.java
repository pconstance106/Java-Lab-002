import java.text.NumberFormat;

public class PricelessScript {
    /**
     *  Proof that MasterCard marketing is in your DNA
     *
     *  @author Trevor Hartman
     *  @author Paul Constance
     *
     *  @since Version 1.0
     *
     * Write a brief summary in this section listing the:
     * Variable name (int) / Its data type (integer variable) / and example values you can assign them. (whole numbers, floating point w/ decimal)
     *
     * Next give TWO example variable names and TWO example variable assignments that are WRONG
     * int & double
     *
     * incompatible type casting / double can't go into int becoming less accurate
     * formatting error / string instead of String
     *
     **/
    public static void main(String[] args) {
        // String variables, some with format specifiers
        String scriptTemplateLine1 = "%d tickets: %s";
        String scriptTemplateLine2 = "%d hotdogs, %d popcorn, %d sodas: %s";
        String scriptTemplateLine3 = "2 autographed baseballs %s";
        String scriptTemplateLine4 = "watching the Giants win: %s";
        String priceless = "priceless";

        // integer variable
        int people = 3;
        // 32 bit floating point variable
        float ticketPrice = 14.0f;  // 32 Bit, but it does exist!
        // double precision floating point variable
        double itemPrice = 9.0;    // Double precision
        // boolean variable
        boolean trueOrFalse = false;

        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.println(
                String.format(scriptTemplateLine1, people,
                        formatter.format(people * ticketPrice)));

        // Example of using printf and platform specific line separator "%n" to
        // format instead of String.format
        System.out.printf((scriptTemplateLine2) + "%n", people, people, people,
                formatter.format(people * itemPrice));

        itemPrice = 90.0;
        System.out.println(
                String.format(scriptTemplateLine3, formatter.format(itemPrice)));

        System.out.println(
                String.format(scriptTemplateLine4, priceless));

        System.out.println(trueOrFalse);
    }
}
