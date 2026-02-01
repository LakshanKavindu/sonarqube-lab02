package main.java.com.example;

public class App {

    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 5));

        UserService service = new UserService();
        service.findUser("admin");
    }
}
