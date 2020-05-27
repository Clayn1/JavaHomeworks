package hw5;

public class Main {
    public static void main(String[] args) throws WrongTimeException {

        Cinema cinema = new Cinema(new Time(8, 0), new Time(23, 0));

        Movie first_movie = new Movie("First Movie", new Time(1, 20));
        Seance seance1 = new Seance(first_movie, new Time(8,0));

        Movie second_movie = new Movie("Second Movie", new Time(2, 20));
        Seance seance2 = new Seance(second_movie, new Time(14,50));

        Movie third_movie = new Movie("Third Movie", new Time(1, 20));
        Seance seance3 = new Seance(third_movie, new Time(20,30));

        Movie fourth_movie = new Movie("Fourth Movie", new Time(1, 40));
        Seance seance4 = new Seance(fourth_movie, new Time(18,30));

        Movie fifth_movie = new Movie("Fifth Movie", new Time(1, 0));

        Seance seance5 = new Seance(fifth_movie, new Time(21,30));
        Seance seance6 = new Seance(first_movie, new Time(21,30));

        cinema.addSeance("MONDAY", seance1, seance2);
        cinema.addSeance("TUESDAY", seance3);
        cinema.addSeance("Tuesday", seance4);
        cinema.addSeance("Wednesday", seance5);

        cinema.removeMovie(new Movie("First Movie", new Time(1, 20)));
        cinema.removeSeance(new Seance(fifth_movie, new Time(21,30)), "Wednesday");
        System.out.println(cinema);

    }
}
