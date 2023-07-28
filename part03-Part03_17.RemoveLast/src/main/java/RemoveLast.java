
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here

        ArrayList<String> someStrings = new ArrayList<>();

        someStrings.add("I");
        someStrings.add("am");
        someStrings.add("Jacob");

        removeLast(someStrings);
        System.out.println(someStrings);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.isEmpty() == false) {
            strings.remove(strings.size() - 1);
        }
    }

}
