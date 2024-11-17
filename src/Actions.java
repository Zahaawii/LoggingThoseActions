import java.time.LocalTime;
import java.util.ArrayList;

class Actions {
    String lines;
    LocalTime time = LocalTime.now();

    public Actions(LocalTime time, String lines) {
        this.lines = lines;
        this.time = time;
    }

    public String getLines() {
        return lines;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Time: " + time + " : " + lines;
    }

}
