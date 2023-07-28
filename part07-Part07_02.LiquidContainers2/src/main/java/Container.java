public class Container {
    private int liquid;
    private int maxLiquid;

    public Container() {
        this.liquid = 0;
        this.maxLiquid = 100;
    }

    public int contains() {
        return this.liquid;
    }

    public void add(int amount) {
        if (amount < 0) {
            amount = 0;
        }
        liquid += amount;
        if (liquid > maxLiquid) {
            liquid = maxLiquid;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            amount = 0;
        }
        liquid -= amount;
        if (liquid < 0) {
            liquid = 0;
        }
    }

    public String toString() {
        return this.contains() + "/100";
    }
}
