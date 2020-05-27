package hw2;

public class Main {

    public static void main(String[] args) {
	    Printable[] printable = {new Book("Book1"), new Magazine("Magazine1"),
                new Book("Book2"), new Magazine("Magazine2"),
                new Book("Book3"), new Magazine("Magazine3")};
        for (Printable element : printable) {
            element.print();
        }
        Magazine.printMagazines(printable);
        Book.printBooks(printable);
    }
}
