package de.roskenet.kata;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;
import java.util.StringJoiner;
import org.junit.jupiter.api.Test;

public class MyStringJoiner {

    @Test
    void testSomething() {
        List<String> names = List.of("Ernie", "Anna", "Garfield");

        var stringJoiner = new StringJoiner(", ");
        names.forEach(stringJoiner::add);

        var result = stringJoiner.toString();

        assertThat(result).isEqualTo("Ernie, Anna, Garfield");
    }
}
