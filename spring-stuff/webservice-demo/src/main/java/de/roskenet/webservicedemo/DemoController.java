package de.roskenet.webservicedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    public static class DemoParameters {

        private String sure_name;
        private String first_name;
        private String nick_name;

        public String getSure_name() {
            return sure_name;
        }

        public void setSure_name(String sure_name) {
            this.sure_name = sure_name;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getNick_name() {
            return nick_name;
        }

        public void setNick_name(String nick_name) {
            this.nick_name = nick_name;
        }
    }

    @GetMapping("/demo")
    public String demo(
//           String sureName,
//           String firstName,
//           String nickName
            DemoController.DemoParameters parameters
    ) {
       return "Hello " + parameters.getSure_name() + " " + parameters.getFirst_name() + " " + parameters.getNick_name();
    }
}
