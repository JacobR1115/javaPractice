public class Multiplier {

    private int number;

    public Multiplier (int number) {
        this.number = number;
    }

    public int multiply(int number) {
        number = this.number * number;
        return number;
    }
}
