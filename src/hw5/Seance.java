package hw5;

import java.util.Objects;

public class Seance implements Comparable<Seance>{
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime) throws WrongTimeException {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = calculateEndTime();
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    @Override
    public int compareTo(Seance seance) {
        int hourDiff = startTime.getHour() - seance.getStartTime().getHour();
        if (hourDiff == 0) return startTime.getMin() - seance.getStartTime().getMin();
        return hourDiff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seance seance = (Seance) o;
        return Objects.equals(movie, seance.movie) &&
                Objects.equals(startTime, seance.startTime) &&
                Objects.equals(endTime, seance.endTime);
    }

    @Override
    public String toString() {
        return "Seance: {" +
                movie +
                ", startTime: " + startTime +
                ", endTime: " + endTime +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, startTime, endTime);
    }

    private Time calculateEndTime() throws WrongTimeException {
        return getStartTime().add(movie.getDuration());
    }
}
