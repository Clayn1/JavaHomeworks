package hw3;

public class Skirt extends Clothes implements FemaleClothes {

    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String dressWoman() {
        return size.name();
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
