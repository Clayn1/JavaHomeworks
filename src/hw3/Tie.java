package hw3;

public class Tie extends Clothes implements MaleClothes {

    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String dressMan() {
        return size.name();
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
