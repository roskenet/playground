package kata;

public class RomanNumber {

    private RomanNumber() {
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
