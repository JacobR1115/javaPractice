
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here

        // Takes a line of user input and saves it as a string in a variable called message
        String message = scanner.nextLine();

        // Prints the message
        System.out.println(message);
    }
}
