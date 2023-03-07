package de.roskenet.pgjackson;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PlaygroundJacksonApplicationTests {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testObjectMapping_writeOut() throws JsonProcessingException {
        var artist = new Artist();
        artist.setId(UUID.fromString("b49fadba-6a8a-4173-b280-60c28b07136c"));
        artist.setName("Michael Jackson");
        artist.setBirthday(LocalDate.of(1958, 8, 29));

        var s = objectMapper.writeValueAsString(artist);

        assertThatJson(s).isEqualTo("""
                {\"id\": \"b49fadba-6a8a-4173-b280-60c28b07136c\",
                 \"birthday\": \"1958-08-29",
                 \"name\": \"Michael Jackson\"
                }
                """);
    }

    @Test
    void testObjectMapping_readIn() throws JsonProcessingException {
        var serializedMichael = """
                {\"id\": \"b49fadba-6a8a-4173-b280-60c28b07136c\",
                 \"birthday\": \"1958-08-29",
                 \"name\": \"Michael Jackson\",
                 \"some_field\": \"Some data\"
                }
                """;

        var michael = objectMapper.readValue(serializedMichael, Artist.class);

        System.out.println(michael);

    }

}
