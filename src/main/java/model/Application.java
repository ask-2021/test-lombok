package model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application {

    private static final Logger LOGGER = LogManager.getLogger(Application.class);

    public static void main(String[] args) {

        LOGGER.info("I am new info");
        LOGGER.error("I am new error");
        LOGGER.debug("I am new debug");
        System.out.println("sout I am new");

    }
}
