import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random rand = new Random();
            int randomNumber = rand.nextInt(jokes.size());
            return jokes.get(randomNumber);
        }
    }

    public void printJokes() {
        for (String joke: jokes) {
            System.out.println(joke);
        }
    }
}
