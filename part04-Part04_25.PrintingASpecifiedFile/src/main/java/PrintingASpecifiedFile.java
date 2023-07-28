
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;

public class PrintingASpecifiedFile {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                System.out.println(row);
            }
        }
    }
}
