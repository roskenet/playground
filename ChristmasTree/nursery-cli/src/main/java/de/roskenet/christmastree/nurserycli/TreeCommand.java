package de.roskenet.christmastree.nurserycli;

import de.roskenet.christmastree.ChristmasTreeNursery;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class TreeCommand {

    private final ChristmasTreeNursery nursery;

    public TreeCommand(ChristmasTreeNursery nursery) {
        this.nursery = nursery;
    }

    @ShellMethod("Translate text from one language to another.")
    public String tree(int height) {
        return nursery.tree(height);
    }
}
