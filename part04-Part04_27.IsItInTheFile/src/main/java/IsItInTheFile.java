
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        Boolean wasFound = false;

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                if (row.contains(searchedFor)) {
                    System.out.println("Found!");
                    wasFound = true;
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed");
            wasFound = true;
        }
        if (!wasFound) {
            System.out.println("Not found.");
        }

    }
}
