import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputValidator input = new InputValidator(sc);


        MenuHandler menuHandler = new MenuHandler();
        menuHandler.mainMenu(input);


    }
}
