
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sum = 0;
        String longestName = "";

        while (true) {
            String text = scanner.nextLine();
            if (!text.equals("")) {
                String[] pieces = text.split(",");
                if (pieces[0].length() > longestName.length()) {
                    longestName = pieces[0];
                }
                int currentYear = Integer.valueOf(pieces[1]);
                sum += currentYear;
                count++;
            } else {
                break;
            }
        }

        double avgYear = sum / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avgYear);
    }
}
