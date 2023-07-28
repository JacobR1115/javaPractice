
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumber = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number != 0) {
                totalNumber ++;
                sum += number;
            } else {
                break;
            }
        }
        System.out.println("Number of numbers: " + totalNumber);
        System.out.println("Sum of numbers: " + sum);
    }
}
