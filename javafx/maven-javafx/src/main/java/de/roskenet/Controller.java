package de.roskenet;

import javafx.event.ActionEvent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Controller {
    public Controller() {
        log.debug("Controller constructor");
    }

    public void onClickMe(ActionEvent actionEvent) {
        log.debug("You clicked me!");
    }
}
