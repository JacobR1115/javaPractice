import java.util.ArrayList;
import java.util.Scanner;

public class IntegerReader {

    private Scanner scanner;

    private ArrayList<Integer> integers;

    public IntegerReader() {
        this.scanner = new Scanner(System.in);
        this.integers = new ArrayList<>();
    }

    public void startReading() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value == -1) {
                System.out.println("Point average (all): " + this.pointAverageAll());
                if (this.pointAveragePassing() == 0) {
                    System.out.println("Point average (passing): -");
                } else {
                    System.out.println("Point average (passing): " + this.pointAveragePassing());
                }
                System.out.println("Pass percentage: " + this.passPercentage());
                this.printGradeDistribution();
                break;
            }
            if (value >= 0 && value <= 100) {
                integers.add(value);
            }
        }
    }

    public double pointAverageAll() {
        if (integers.isEmpty()) {
            return 0.0;
        }
        double sum = 0, counter = 0, avg = 0;
        for (int integer: integers) {
            sum += integer;
            counter++;
        }
        avg = sum / counter;
        return avg;
    }

    public double pointAveragePassing() {
        if (integers.isEmpty()) {
            return 0.0;
        }
        double sum = 0, counter = 0, avg = 0;
        for (int integer: integers) {
            if (integer >= 50) {
                sum += integer;
                counter++;
            }
        }
        avg = sum / counter;
        return avg;
    }

    public double passPercentage() {
        if (integers.isEmpty()) {
            return 0.0;
        }
        double passing = 0, counter = 0;
        for (int integer: integers) {
            if (integer >= 50) passing++;
            counter++;
        }
        double percentage = 100 * (passing / counter);
        return percentage;
    }

    public void printGradeDistribution() {
        int[] distribution = new int[6];
        String star = "*";
        for (int integer: integers) {
            if (integer >= 90) {
                distribution[5]++;
            } else if (integer >= 80 && integer < 90) {
                distribution[4]++;
            } else if (integer >= 70 && integer < 80) {
                distribution[3]++;
            } else if (integer >= 60 && integer < 70) {
                distribution[2]++;
            } else if (integer >= 50 && integer < 60) {
                distribution[1]++;
            } else {
                distribution[0]++;
            }
        }
        System.out.println("Grade distribution: \n" +
                "5: " + star.repeat(distribution[5]) +
                "\n4: " + star.repeat(distribution[4]) +
                "\n3: " + star.repeat(distribution[3]) +
                "\n2: " + star.repeat(distribution[2]) +
                "\n1: " + star.repeat(distribution[1]) +
                "\n0: " + star.repeat(distribution[0]));
    }
}
