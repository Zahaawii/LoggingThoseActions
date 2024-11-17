import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalTime;

class LoggingThoseActions {

    Scanner scanner = new Scanner(System.in);
    private ArrayList<Actions> log = new ArrayList<>();
    LocalTime time = LocalTime.now();


    public ArrayList<Actions> addActions(LocalTime time, String line) {
    Actions newLog = new Actions(time, line);
    log.add(newLog);
    return log;
    }

    public void userLine() {
        System.out.println("Enter a line");
        String line = scanner.nextLine();
        addActions(time, line);
    }

    public void deleteALine() {
        System.out.println("Enter a number on the line you want to delete");
        int userDelete = scanner.nextInt();
        if(userDelete < 0 || userDelete > log.size()) {
            System.out.println("Wrong line. Did not remove");
            return;
        }
        String hej = "Removing: " + log.get(userDelete -1);
        System.out.println("Removing: " + userDelete + " " + log.get(userDelete - 1));
        addActions(time, hej);
        log.remove(userDelete - 1);
    }

    public ArrayList<Actions> getLines() {
        return log;
    }

    public void seeAllLines() {
        for(Actions hej : log) {
            System.out.println(hej);
        }
    }

    public void addingLinesToView() {
        addActions(time, "Viewing lines");
    }

    public void startingProgram() {
        addActions(time, "STARTING PROGRAM");
    }

    public void endingProgram() {
        addActions(time, "Exiting program");
    }

}
