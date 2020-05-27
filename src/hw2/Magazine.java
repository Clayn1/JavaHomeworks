package hw2;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("I am Magazine " + this.name);
    }

    public static void printMagazines(Printable[] printable){
        for (Printable element : printable) {
            if (element instanceof Magazine){
                System.out.println(element.getName());
            }
        }
    }
}
