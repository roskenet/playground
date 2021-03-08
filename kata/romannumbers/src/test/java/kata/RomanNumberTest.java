package kata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanNumberTest {
    @ParameterizedTest
    @CsvSource({"XVII,17",
                "CDXLIV,444",
                "MCMLXXI,1971",
                "MMXXI,2021",
                "C,100",
                "III,3"})
    void testFromRomanNumber(String input, int expected) {
        assertThat(RomanNumber.fromRomanNumber(input, 0), is(expected));
    }
}