package kata;

import static kata.RomanNumber.fromRomanNumber;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanNumberTest {
    @ParameterizedTest
    @CsvSource({"XVII,17",
                "CDXLIV,444",
                "MCMLXXI,1971",
                "MMXXI,2021",
                "DXXI,521",
                "C,100",
                "III,3",
                "CIX,109",
                "XCIV,94"})
    void testFromRomanNumber(String input, int expected) {
        assertThat(fromRomanNumber(input), is(expected));
    }

    @Test
    void testIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> fromRomanNumber("A"));
    }
}