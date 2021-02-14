package de.roskenet.christmastree.nurserycli;

import de.roskenet.christmastree.ChristmasTreeNursery;
import de.roskenet.christmastree.StringChristmasTreeNursery;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TreeNurseryCliConfig {

    @Bean
    public ChristmasTreeNursery christmasTreeNursery() {
        return new StringChristmasTreeNursery();
    }
}
