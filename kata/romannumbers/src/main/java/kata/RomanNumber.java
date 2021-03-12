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
        if (number.length() == 0)
                return 0;
        if (number.startsWith("CM"))
            return 900 + fromRomanNumber(number.substring(2));
        if (number.startsWith("M"))
           return 1000 + fromRomanNumber(number.substring(1));
        if (number.startsWith("CD"))
            return 400 + fromRomanNumber(number.substring(2));
        if (number.startsWith("D"))
            return 500 + fromRomanNumber(number.substring(1));
        if (number.startsWith("XC"))
            return 90 + fromRomanNumber(number.substring(2));
        if (number.startsWith("C"))
            return 100 + fromRomanNumber(number.substring(1));
        if (number.startsWith("XL"))
            return 40 + fromRomanNumber(number.substring(2));
        if (number.startsWith("L"))
            return 50 + fromRomanNumber(number.substring(1));
        if (number.startsWith("IX"))
            return 9 + fromRomanNumber(number.substring(2));
        if (number.startsWith("X"))
            return 10 + fromRomanNumber(number.substring(1));
        if (number.startsWith("IV"))
            return 4 + fromRomanNumber(number.substring(2));
        if (number.startsWith("V"))
            return 5 + fromRomanNumber(number.substring(1));
        if (number.startsWith("I"))
            return 1 + fromRomanNumber(number.substring(1));
        throw new IllegalArgumentException("Illegal input: " + number);
    }
}
