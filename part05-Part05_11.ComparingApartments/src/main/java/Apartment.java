
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int Price() {
        int price = this.squares * this.princePerSquare;
        return price;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        if (this.Price() >= compared.Price()) {
            int difference = this.Price() - compared.Price();
            return difference;
        } else {
            int difference = compared.Price() - this.Price();
            return difference;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.Price() > compared.Price()) {
            return true;
        } else {
            return false;
        }
    }

}
