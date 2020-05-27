package hw2;

public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("I am Book " + this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public static void printBooks(Printable[] printable){
        for (Printable element : printable) {
            if (element instanceof Book){
                System.out.println(element.getName());
            }
        }
    }
}
