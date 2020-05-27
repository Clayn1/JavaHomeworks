package hw3;

public class Pants extends Clothes implements MaleClothes, FemaleClothes {

    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String dressWoman() {
        return size.name();
    }

    @Override
    public String dressMan() {
        return size.name();
    }

    @Override
    public String toString() {
        return "Pants{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
