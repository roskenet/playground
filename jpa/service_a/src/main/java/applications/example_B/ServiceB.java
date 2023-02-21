package applications.example_B;

import applications.commons.ShoppingItem;
import applications.commons.ShoppingItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ServiceB {
    @Autowired
    private ShoppingItemRepository repository;

    @Transactional
    public void doSomething() {

        persistSomething();
        doOtherThings();

    }

    public void persistSomething() {

        ShoppingItem blueShirt = new ShoppingItem(1, "BlueShirt");
        repository.saveAndFlush(blueShirt);

        ShoppingItem redShirt = new ShoppingItem(2, "RedShirt");
        repository.saveAndFlush(redShirt);

    }

    public void doOtherThings() {
        // Here we do very complex business logic
        throw new RuntimeException();
    }
}
