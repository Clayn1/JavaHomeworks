package hw4;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> productList;

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public Store() {
         this.productList = new ArrayList<>();
    }
    public void fillStore(){
        for (int i = 0; i < 10; i++) {
            productList.add(new Product(
                    Statics.NAMES[(int)(Math.random()*(Statics.NAMES.length))],
                    (int)(Math.random()*1000),
                    Type.values()[(int)(Math.random()*(Type.values().length))],
                    Statics.DESCRIPTIONS[(int)(Math.random()*(Statics.DESCRIPTIONS.length))]
            ));
        }
    }

    public boolean add(Product product){
        if (product.getPrice() > 0 && !product.getName().matches(".*\\d.*")) {
            productList.add(product);
            return true;
        }else System.out.println("Price has to be > 0; Name shouldn't contain numbers");
        return false;
    }
    public void removeByName(String name){
        productList.removeIf(product -> product.getName().equals(name));
    }
    public void doublePrice(Type type){
        for (Product product : productList) {
            if (product.getType() == type) {
                product.setPrice(product.getPrice() * 2);
            }
        }
    }
    public ArrayList<Product> priceMoreThan(int price){
        ArrayList<Product> priceMoreList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getPrice() >= price) {
                priceMoreList.add(product);
            }
        }
        System.out.println("В нашому магазині продаються такі преміум товари:");
        for (Product product : priceMoreList) {
            System.out.println(product);
        }
        return priceMoreList;
    }
    public int productSum(Type type){
        int sum = 0;
        for (Product product : productList) {
            if (product.getType() == type) {
                sum += product.getPrice();
            }
        }
        return sum;
    }
    public double avgPrice(){
        double sum = 0;
        for (Product product : productList) {
            sum += product.getPrice();
        }
        return sum/productList.size();
    }

    @Override
    public String toString() {
        String s = "";
        for (Product product : productList) {
            s += product+"\n";
        }
        return s;
    }
}
