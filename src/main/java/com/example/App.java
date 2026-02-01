package main.java.com.example;

import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();
        logger.info("Result: " + calc.add(10, 5));

        UserService service = new UserService();
        service.findUser("admin");
    }
}
