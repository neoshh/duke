import java.util.Scanner;

public class Ui {

    /**
     * Prints welcome message when Duke.java is run
     */
    public void showWelcome() {
        System.out.println("    ____________________________________________________________");
        System.out.println("     Hello! I'm Duke");
        System.out.println("     What can I do for you?");
        System.out.println("    ____________________________________________________________\n");
    }

    /**
     * Prints loading error message
     */
    public void showLoadingError() {
    	System.out.println("    ____________________________________________________________");
        System.out.println("     No task to load");
        System.out.println("    ____________________________________________________________\n");
    }

    /**
     * Prints the divider line
     */
    public void showLine() {
        System.out.println("    ____________________________________________________________\n");
    }

    /**
     * Prints out error message after exception is caught
     *
     * @param errorMessage Message of exception that is caught
     */
    public void showError(String errorMessage) {
        System.out.println("     " + errorMessage);
    }

    /**
     * Returns user input as a String
     *
     * @return User input as String
     */
    public String readCommand() {
    	Scanner sc = new Scanner(System.in);
    	return sc.nextLine();
    }
}
