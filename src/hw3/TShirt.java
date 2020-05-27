package hw3;

public class TShirt extends Clothes implements MaleClothes, FemaleClothes {

    public TShirt(Size size, int price, String color) {
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
        return "TShirt{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
