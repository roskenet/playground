package de.roskenet.riptidedemo;

import static org.assertj.core.api.Assertions.assertThat;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@WireMockTest(httpPort = 30123)
@TestPropertySource(properties = { "riptide.clients.oxygen.base-url=http://localhost:30123/"})
public class OxygenClientTwoTest {

    @Autowired
    private OxygenClientTwo client;

    @Test
    public void testGetSomething_200() {
        var response = client.getSomething("OK");
        assertThat(response.getValue()).isEqualTo("Hello World");
    }
}
