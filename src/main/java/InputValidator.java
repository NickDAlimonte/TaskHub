import java.util.Scanner;

public class InputValidator {
    private final Scanner input;

    public InputValidator(Scanner input){
        this.input = input;
    }

    public int getValidInt(){

        while(true){
            if(this.input.hasNextInt()){
                input.next();
                return this.input.nextInt();
            }
            else{
                System.out.println("Invalid input, please enter an integer");
                input.next();
            }
        }
    }

    public double getValidDouble(){

        while(true){
            if(this.input.hasNextDouble()){
                return this.input.nextDouble();
            }
            else{
                System.out.println("Invalid input, please enter a number");
                input.next();
            }
        }
    }

    public String getValidString(){
        while(true){
            return this.input.nextLine();
        }
    }
}