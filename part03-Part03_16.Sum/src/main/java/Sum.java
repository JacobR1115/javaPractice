
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(sum(list));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sumOfNumbers = 0;
       for (int number:  numbers) {
           sumOfNumbers += number;
       }

       return sumOfNumbers;
    }
}


