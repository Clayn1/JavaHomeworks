package hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    private Set<Seance> seanceSet;

    @Override
    public String toString() {
        return "Schedule{" +
                "seanceSet=" + seanceSet +
                '}';
    }

    public Schedule() {
        this.seanceSet = new TreeSet<>();
    }
    public Schedule(Seance ...seances){
        this.seanceSet = new TreeSet<>();
        seanceSet.addAll(Arrays.asList(seances));
    }

    public Set<Seance> getSeanceSet() {
        return seanceSet;
    }

    public void addSeance(Seance seance){
        seanceSet.add(seance);
    }
    public void addSeances(Seance ...seances){
        seanceSet.addAll(Arrays.asList(seances));
    }
    public void removeSeance(Seance seance){
        seanceSet.remove(seance);
    }
}
