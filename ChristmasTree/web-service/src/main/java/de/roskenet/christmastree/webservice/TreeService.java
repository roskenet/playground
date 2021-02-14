package de.roskenet.christmastree.webservice;


import de.roskenet.christmastree.ChristmasTreeNursery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TreeService {

    @Autowired
    private ChristmasTreeNursery nursery;

    @GetMapping("/tree")
    public TreeResponse tree(@RequestParam("height") int height) {
        return new TreeResponse(nursery.tree(height));
    }
}
