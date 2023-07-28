import java.util.ArrayList;

public class Stack {

    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<String>();
    }

    public boolean isEmpty() {
        if (this.list.isEmpty()) return true;
        return false;
    }

    public void add(String value) {
        this.list.add(value);
    }

    public ArrayList<String> values() {
        return this.list;
    }

    public String take() {
        int lastIndex = this.list.size() - 1;
        String value = this.list.get(lastIndex);
        this.list.remove(lastIndex);
        return value;
    }

}
