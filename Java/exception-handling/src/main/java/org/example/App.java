package org.example;

import static com.sun.crypto.provider.AESCrypt.log;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App 
{
    public static void main( String[] args ) {
        var app = new App();
    }

    public String doSomething(String myString) {

        try {
            return doSomething(weirdObject);
        } catch (Exception e) {
            log.error(e);
            throw e;
        }

    }

    public String convertString(String myString) {
       throw new UnsupportedOperationException();
    }
}
