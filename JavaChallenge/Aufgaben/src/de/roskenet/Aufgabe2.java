package de.roskenet;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Aufgabe2 {

    static String numberAsText(final int number) {
        return "";
    }
}

class Aufgabe2Test {

    @Test
    void testNumberAsText() throws Exception {
        assertThat(Aufgabe2.numberAsText(42), is("FOUR TWO"));
    }
}

