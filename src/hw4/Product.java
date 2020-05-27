package hw4;

import java.util.Objects;

public class Product {
    private String name;
    private int price;
    private Type type;
    private String description;

    public Product(String name, int price, Type type, String description) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        if (!name.matches(".*\\d.*")){
            this.name = name;
        }
    }

    public void setPrice(int price) {
        if (price > 0){
            this.price = price;
        }
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price &&
                name.equals(product.name) &&
                type == product.type &&
                description.equals(product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, type, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", description='" + description + '\'' +
                '}';
    }

}
                                                               
    
    
    
    





