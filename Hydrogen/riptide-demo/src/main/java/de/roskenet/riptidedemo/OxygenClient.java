package de.roskenet.riptidedemo;

import static org.springframework.http.HttpStatus.Series.CLIENT_ERROR;
import static org.springframework.http.HttpStatus.Series.SUCCESSFUL;
import static org.zalando.riptide.Bindings.anyStatus;
import static org.zalando.riptide.Bindings.on;
import static org.zalando.riptide.Navigators.series;
import static org.zalando.riptide.Navigators.status;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.zalando.riptide.Http;

@Component
public class OxygenClient {

    @Autowired
    @Qualifier("oxygen")
    private Http http;

    public String getSomething(String name) throws Exception{
        var completableFuture = http.get("/api/name/{name}", name)
                .dispatch(series(),
                        on(SUCCESSFUL).call(OxygenResponse.class, (response) -> {
                            System.out.println(response.getValue());
                        }),
                        on(CLIENT_ERROR).dispatch(status(),
                                anyStatus().call(() -> {
                                    System.out.println("client error");
                                }))).join();

        return completableFuture.getBody().toString();
    }
}
