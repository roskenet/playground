package applications.example_A;

import applications.commons.ShoppingItem;
import applications.commons.ShoppingItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceA {

    @Autowired
    private ShoppingItemRepository repository;

    public void doSomething() {

        ShoppingItem brownShoe = new ShoppingItem(1, "BrownShoe");
        repository.save(brownShoe);

        System.out.println("What Do you think?");

        ShoppingItem redShoe = new ShoppingItem(2, "RedShoe");
        repository.save(redShoe);

        System.out.println("What Do you think?");

//        throw new RuntimeException("Something went wrong");
    }
}
