package kata;

public class RomanNumber {

    private RomanNumber() {
    }

    public static String toRomanNumber(int value, String accu) {
        if (value == 0)
            return accu;
        if (value - 1000 >= 0)
            return toRomanNumber(value - 1000, accu + "M");
        if (value - 900 >= 0)
            return toRomanNumber(value - 900, accu + "CM");
        if (value - 500 >= 0)
            return toRomanNumber(value - 500, accu + "D");
        if (value - 400 >= 0)
            return toRomanNumber(value - 400, accu + "CD");
        if (value - 100 >= 0)
            return toRomanNumber(value - 100, accu + "C");
        if (value - 90 >= 0)
            return toRomanNumber(value - 90, accu + "XC");
        if (value - 50 >= 0)
            return toRomanNumber(value - 50, accu + "L");
        if (value - 40 >= 0)
            return toRomanNumber(value - 40, accu + "XL");
        if (value - 10 >= 0)
            return toRomanNumber(value - 10, accu + "X");
        if (value - 9 >= 0)
            return toRomanNumber(value - 9, accu + "IX");
        if (value - 5 >= 0)
            return toRomanNumber(value - 5, accu + "V");
        if (value - 4 >= 0)
            return toRomanNumber(value - 4, accu + "IV");
        if (value - 1 >= 0)
            return toRomanNumber(value - 1, accu + "I");
        return "";
    }

    public static int fromRomanNumber(String number) {
        return fromRomanNumber(number, 0);
    }

    private static int fromRomanNumber(String number, int accu) {
        if (number.length() == 0)
                return accu;
        if (number.startsWith("CM"))
            return fromRomanNumber(number.substring(2), accu + 900);
        if (number.startsWith("M"))
           return fromRomanNumber(number.substring(1), accu + 1000);
        if (number.startsWith("CD"))
            return fromRomanNumber(number.substring(2), accu + 400);
        if (number.startsWith("D"))
            return fromRomanNumber(number.substring(1), accu + 500);
        if (number.startsWith("XC"))
            return fromRomanNumber(number.substring(2), accu + 90);
        if (number.startsWith("C"))
            return fromRomanNumber(number.substring(1), accu + 100);
        if (number.startsWith("XL"))
            return fromRomanNumber(number.substring(2), accu + 40);
        if (number.startsWith("L"))
            return fromRomanNumber(number.substring(1), accu + 50);
        if (number.startsWith("IX"))
            return fromRomanNumber(number.substring(2), accu + 9);
        if (number.startsWith("X"))
            return fromRomanNumber(number.substring(1), accu + 10);
        if (number.startsWith("IV"))
            return fromRomanNumber(number.substring(2), accu + 4);
        if (number.startsWith("V"))
            return fromRomanNumber(number.substring(1), accu + 5);
        if (number.startsWith("I"))
            return fromRomanNumber(number.substring(1), accu + 1);
        throw new IllegalArgumentException("Illegal input: " + number);
    }
}
