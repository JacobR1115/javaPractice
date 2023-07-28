public class Record {

    private String name;

    private int year;

    public Record(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        if (year == 1) {
            return name + ", age: " + year + " year";
        } else {
            return name + ", age: " + year + " years";
        }
    }
}
