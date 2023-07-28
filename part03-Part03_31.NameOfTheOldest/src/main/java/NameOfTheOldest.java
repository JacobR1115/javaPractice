
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = -1;
        String nameOfOldest = null;

        while (true) {
            String text = scanner.nextLine();
            if (!text.equals("")) {
                String[] pieces = text.split(",");
                int currentAge = Integer.valueOf(pieces[1]);
                if (currentAge > oldestAge) {
                    oldestAge = currentAge;
                    nameOfOldest = pieces[0];
                }
            } else {
                break;
            }
        }

        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}
