// Custom exception using extends keyword
class MyCustomException extends Exception {
    private String message;

    // Constructor takes String argument
    MyCustomException(String message) {
        this.message = message;
    }

    // Function to print stored string
    void printMessage() {
        System.out.println("Custom Exception Message: " + message);
    }
}

public class Exp8_Q4 {
    public static void main(String[] args) {
        System.out.println("nitish gupta,24csu330");
        try {
            // Throw custom exception
            throw new MyCustomException("Something went wrong in the program!");
        } 
        catch (MyCustomException e) {
            // Catch and print message
            e.printMessage();
        }
    }
}