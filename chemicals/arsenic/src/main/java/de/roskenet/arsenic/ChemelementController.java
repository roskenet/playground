package de.roskenet.arsenic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChemelementController {

    @Autowired
    private ChemelementRepository repository;

    @GetMapping("/api/elements")
    public Iterable<Chemelement> getChemelements() {
        return repository.findAll();
    }
}
