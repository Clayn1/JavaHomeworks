package hw3;

public class Main {

    public static void main(String[] args) {
        Atelier atelier = new Atelier(new Pants(Size.S, 100, "Red"),
                new Pants(Size.S, 400, "Yellow"),
                new Skirt(Size.XS, 200, "Black"),
                new Skirt(Size.L, 300, "Brown"),
                new Tie(Size.XXS, 400, "Blue"),
                new Pants(Size.M, 500, "Green"),
                new TShirt(Size.S, 600, "White"));

        for (Clothes clothe:atelier.menChoice()) {
            System.out.println(clothe);
        }
        System.out.println("===============================");
        for (Clothes clothe:atelier.womenChoice()) {
            System.out.println(clothe);
        }
    }
}
