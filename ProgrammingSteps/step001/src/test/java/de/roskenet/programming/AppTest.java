package de.roskenet.programming;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    @DisplayName("Hamcrest matchers")
    public void shouldAnswerWithTrue()
    {
        assertThat(true, is(true));
    }
}
