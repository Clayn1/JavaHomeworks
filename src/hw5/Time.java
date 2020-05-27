package hw5;

import java.util.Objects;

public class Time {
    private int min;
    private int hour;

    public Time(int hour, int min) throws WrongTimeException {
        setMin(min);
        setHour(hour);
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) throws WrongTimeException {
        if (min > 59 || min < 0){
            throw new WrongTimeException();
        }
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) throws WrongTimeException {
        if (hour > 23 || hour < 0){
            throw new WrongTimeException();
        }
        this.hour = hour;
    }

    public Time add(Time time) throws WrongTimeException {
        int hour = this.getHour() + time.getHour();
        int minute = this.getMin() + time.getMin();
        if (minute > 59) hour++;
        return new Time((hour > 23) ? hour - 24 : hour, (minute > 59) ? minute - 60 : minute);
    }

    @Override
    public String toString() {
        return hour + ":" + min;
    }

    public boolean isLater(Time time){
        int hourDiff = hour - time.getHour();
        if (hourDiff == 0) return min >= time.getMin();
        return hourDiff >= 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return min == time.min &&
                hour == time.hour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, hour);
    }
}
