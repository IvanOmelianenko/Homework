public class Main {
    public static int integer = 5;
    public static float floating = 8.45f;
    public static void main(String[] args) {
        // Data types
        byte newByte = 90;
        short newShort = 10115;
        int newInt = 652335;
        long newLong = 922337203621312112L;
        float newFloat = 6.25f;
        double newDouble = 7.3454545;
        char newChar = 'P';
        boolean newBoolean = true;
        // Arithmetical operations
        short sum = (short) (45 + 456568);
        long sub = 3432432432432423L - 565665;
        double mul = 6.565656 * 6.32;
        int div = (int) (5656565 / 7.8f);
        float rem = 6.36f % 3;
        int inc = 56;
        inc++;
        float dec = 6.32f;
        dec--;
        int plus = 64;
        plus+= 1;
        byte min = 101;
        min-= 2;
        short h = 5421;
        h*= 3;
        int b = 56223;
        b/= 8;
        int p = 46556;
        p%=2;
        // Logical operators
        boolean more = dec > inc;
        boolean less = sum < sub;
        boolean moreequals = div >= mul;
        boolean lessequals = newLong <= newInt;
        boolean equals = b == p;
        boolean notequals = rem != inc;
        boolean and = more && less;
        boolean or = moreequals || lessequals;
        // Explicit casting
        double castValue = 6.12121211;
        int intValue = (int) castValue;
        // Implicit casting
        short sValue = 90;
        int bValue = sValue;
        System.out.println(newByte);
        System.out.println(newShort);
        System.out.println(newInt);
        System.out.println(newLong);
        System.out.println(newFloat);
        System.out.println(newDouble);
        System.out.println(newChar);
        System.out.println(newBoolean);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
        System.out.println(inc);
        System.out.println(dec);
        System.out.println(plus);
        System.out.println(min);
        System.out.println(h);
        System.out.println(b);
        System.out.println(p);
        System.out.println(more);
        System.out.println(less);
        System.out.println(moreequals);
        System.out.println(lessequals);
        System.out.println(equals);
        System.out.println(notequals);
        System.out.println(and);
        System.out.println(or);
        System.out.println(intValue);
        System.out.println(integer);
        System.out.println(floating);

    }
}