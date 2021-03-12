package kata;

public class RomanNumber {

    private RomanNumber() {
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
