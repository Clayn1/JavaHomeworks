package hw5;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Cinema {
    private Map<Days, Schedule> cinemaMap;
    private Time open;
    private Time close;

    public Cinema(Time open, Time close) {
        cinemaMap = new TreeMap<>();
        this.open = open;
        this.close = close;
    }

    @Override
    public String toString() {
        String s = "";
        for (Days day : cinemaMap.keySet()) {
            s += day.name() + ":\n";
            for (Seance seance : cinemaMap.get(day).getSeanceSet()) {
                s += seance + "\n";
            }
            s += "\n";
        }
        return "Cinema open:" + open +
                ", close:" + close + "\n" + s;
    }

    public Map<Days, Schedule> getCinemaMap() {
        return cinemaMap;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public void setClose(Time close) {
        this.close = close;
    }

    public Time getOpen() {
        return open;
    }

    public Time getClose() {
        return close;
    }

    public void addSeance(String day, Seance... seances) {
        day = day.toUpperCase();
        createIfNoSuchKey(Days.valueOf(day));
        for (Seance seance : seances) {
            if (isOpenClose(seance)) {
                cinemaMap.get(Days.valueOf(day)).addSeance(seance);
            }
        }
    }

    public void addSeance(String day, Seance seance) {
        day = day.toUpperCase();
        createIfNoSuchKey(Days.valueOf(day));
        if (isOpenClose(seance)) {
            cinemaMap.get(Days.valueOf(day)).addSeance(seance);
        }
    }

    public void removeMovie(Movie movie) {
        for (Map.Entry<Days, Schedule> entry : cinemaMap.entrySet()) {
            Set<Seance> set = entry.getValue().getSeanceSet();
            set.removeIf(seance -> seance.getMovie().equals(movie));
        }
    }

    public void removeSeance(Seance seance, String day) {
        day = day.toUpperCase();
        cinemaMap.get(Days.valueOf(day)).getSeanceSet().remove(seance);
    }

    private boolean isOpenClose(Seance seance) {
        return seance.getStartTime().isLater(open)
                && !seance.getEndTime().isLater(close)
                && !seance.getStartTime().isLater(seance.getEndTime());
    }

    private void createIfNoSuchKey(Days day) {
        if (!cinemaMap.containsKey(day)) {
            cinemaMap.put(day, new Schedule());
        }
    }

}
