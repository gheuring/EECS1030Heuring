import java.io.Console;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author jerry
 *
 * This is the class file for the Commands object.  The commands object is the center of 
 * this implementation.  There is a method, processCommand, which will process a single command.
 * A second method, processUntilExit(), will process multiple commands until it reaches the exit 
 * command. 
 * 
 */
public class Commands {
	/**
	 * This is the array to hold the collection of Institutions for this project. 
	 * It is not being used yet but will be.  
	 */
	protected Institution list[] = new Institution[100];
	/**
	 * This method processes a single command read in from the System.in using a 
	 * Scanner object.  It is intended to process the command and then return the 
	 * command it processed.   
	 * @return a String containing the command just processed. 
	 */
	public String processCommand()  {
		
		Scanner scanner = new Scanner(System.in);
		String command = scanner.nextLine();
		/*
		 * Java's switch statement can be used with Strings so we will
		 * implement a switch statement with each of the commands as a string. 
		 * (C/C++ do not have this).  
		 * 
		 */
		switch (command) {
		case "exit":		// Exit Command
			System.out.println("Exiting...");
			break;
		case "help":		// Help Command
			System.out.println("Help!!");
			break;
		case "search":		// Search Command
			System.out.println("Not yet implemented.");
			break;
		case "save":		// Save Command
			System.out.println("Not yet implemented.");
			break;
		case "add":			// Add Command
			System.out.println("Not yet implemented.");
			break;
		case "list":		// List Command
			System.out.println("Not yet implemented.");
			break;
		case "delete":		// Delete Command
			System.out.println("Not yet implemented.");
			break;
		default:			// None of the above commands.
			System.out.println("Command not recognized.");
		}
		return command;
	}
	
	/**
	 * 
	 */
	public void processUntilExit() {
		String lastCommand;
		
		do {
			lastCommand = processCommand();
		} while (lastCommand != "exit");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commands commandProcessor = new Commands();
		commandProcessor.processUntilExit();

	}

}
