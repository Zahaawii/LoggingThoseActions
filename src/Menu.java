import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    LoggingThoseActions logging = new LoggingThoseActions();
    Files files = new Files (logging);

    public void menu() {
        displayInfo();
        int userInput = userInput();
        if (userInput == 1) {
            logging.userLine();
            files.saveFiles();
        }
        if (userInput == 2) {
            logging.seeAllLines();
            logging.addingLinesToView();
            files.saveFiles();
        }
        if (userInput == 3) {
            logging.deleteALine();
            files.saveFiles();
        }

        if (userInput == 4) {
            logging.endingProgram();
            files.saveFiles();
            System.exit(0);
        }
    }

    private int userInput() {
        return scanner.nextInt();
    }

    private void displayInfo() {
        System.out.println("1: Add a new line \n2. See all lines \n3. Delete a line \n4. Exiting program");
    }
}
