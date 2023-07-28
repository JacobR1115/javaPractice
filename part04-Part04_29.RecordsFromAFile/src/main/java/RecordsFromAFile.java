
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        int counter = 0;
        ArrayList<Record> recordArrayList = new ArrayList<>();

        try (Scanner recordScanner = new Scanner(Paths.get(fileName))) {
            while (recordScanner.hasNextLine()) {
                String line = recordScanner.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int year = Integer.valueOf(parts[1]);

                recordArrayList.add(counter, new Record(name, year));
                counter++;
            }
        }

        for (Record record: recordArrayList) System.out.println(record);
    }
}
