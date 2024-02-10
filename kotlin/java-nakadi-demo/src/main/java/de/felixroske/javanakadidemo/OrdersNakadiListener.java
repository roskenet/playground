package de.felixroske.javanakadidemo;

import org.springframework.stereotype.Component;
import org.zalando.spring.boot.fahrschein.nakadi.NakadiListener;

import java.util.List;
import java.util.Locale;

@Component
public class OrdersNakadiListener implements NakadiListener<Order> {
    @Override
    public Class<Order> getEventType() {
        return Order.class;
    }

    @Override
    public void accept(List<Order> events) {
        for (Order o : events) {
            System.out.println(o.getName().toUpperCase(Locale.GERMAN));
        }
    }
}
