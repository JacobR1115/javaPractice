
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();

            if (!text.equals("")) {
                String[] pieces = text.split(" ");
                for (int i = 0; i < pieces.length; i++) {
                    if (pieces[i].contains("av") || pieces[i].contains("Av")) {
                        System.out.println(pieces[i]);
                    }
                }
            } else {
                break;
            }
        }
    }
}
