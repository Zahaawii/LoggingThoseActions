import java.io.*;

public class Files {

    private LoggingThoseActions loggingThoseActions;
//    String filename = "Log.txt";

    public Files (LoggingThoseActions loggingThoseActions) {
        this.loggingThoseActions = loggingThoseActions;
    }

    public void saveFiles() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("Log.txt", true));
            for(Actions hej : loggingThoseActions.getLines()) {
                pw.println(hej);
            }
            pw.close();
        } catch (IOException e) {

        }
    }


}
