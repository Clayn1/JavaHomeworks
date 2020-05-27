package hw4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        store.fillStore();
        System.out.println(store);

        store.add(new Product("AAA 12", 12, Type.FOOD, "qwe"));
        store.add(new Product("AAA", -12, Type.FOOD, "qwe"));
        store.add(new Product("AAA", 12, Type.FOOD, "qwe"));

        System.out.println(store);

        store.removeByName("AAA");

        System.out.println(store);

        store.doublePrice(Type.FOOD);

        System.out.println(store);

        ArrayList<Product> arrayList = store.priceMoreThan(400);

        System.out.println();
        System.out.println(store.productSum(Type.FOOD));

        System.out.println(store.avgPrice());
    }
}
