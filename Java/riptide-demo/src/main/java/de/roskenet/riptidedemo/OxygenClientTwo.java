package de.roskenet.riptidedemo;

import static org.springframework.http.HttpStatus.Series.SUCCESSFUL;
import static org.zalando.riptide.Bindings.anySeries;
import static org.zalando.riptide.Bindings.on;
import static org.zalando.riptide.Navigators.series;

import java.io.IOException;
import java.util.concurrent.CompletionException;
import java.util.function.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.zalando.riptide.Http;
import org.zalando.riptide.capture.Capture;

@Component
public class OxygenClientTwo {

    @Autowired
    @Qualifier("oxygen")
    private Http http;

    public OxygenResponse getSomething(String input) {

        Capture<OxygenResponse> capture = Capture.empty();
        return httpCall(() -> http.get("/api/name/{input}", input)
                .dispatch(series(),
                        on(SUCCESSFUL).call(OxygenResponse.class, capture),
//                        on(CLIENT_ERROR).call(OxygenClientTwo::handleError),
//                        on(SERVER_ERROR).call(OxygenClientTwo::handleError),
                        anySeries().call((e) -> handleError(e, "Error: ", input))
                ).thenApply(capture)
                .join());
    }

    public static void handleError(ClientHttpResponse resp, String fmtString, Object... obj) throws IOException {
        throw new OxygenClientException(resp.getRawStatusCode(), String.format(fmtString, obj));
    }

    public static <R> R httpCall(Supplier<R> function) {
        try {
            return function.get();
        } catch (CompletionException ce) {
            if (ce.getCause() instanceof OxygenClientException) {
                throw (OxygenClientException) ce.getCause();
            } else {
                throw new OxygenClientException(0, "Error: Unknown", ce.getCause());
            }
        }
    }
//    public static <T> T httpCallSomething(Producer<T> function, ) {
//        return
//    }

}
