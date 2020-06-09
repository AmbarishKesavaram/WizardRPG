package HarryPotterUniverse;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * Static Class for repeatedly used code blocks
 * @author - Mounika
 */
public class GameSkeleton {

    /**
     * attribute for counter
     */
    public static int counter = 0;

    /**
     * input to console
     */
    static Scanner scanner = new Scanner(System.in);

    /**
     * Method for user to chose options..
     *
     * @param options - User input for options for choice
     * @param userChoices - Total number of choices given to user.
     * @return The user choice
     */
    public static int readChoice(String options,int userChoices){
        int userInput;
        do {
            System.out.println(options);
            try {
                userInput = Integer.parseInt(scanner.next());
            }
            catch (Exception e){
                userInput  =-1;
                System.out.println("Enter valid input");
            }
            if(userInput<1 || userInput>userChoices)
                System.out.println("Please enter a choice between 1 and "+userChoices);

        }while (userInput<1 || userInput>userChoices);
        return userInput;
    }

    /**
     * Line for Beautification
     * @param n - Size of line..
     */
    public static void printLine(int n){
        for (int i=0;i<n;i++)
            System.out.print("*");
        System.out.println();

    }

    /**
     * Method to print Heading of the game
     * @param title - The heading to display.
     */
    public static void printHeading(String title){
        printLine(50);
        System.out.println(title);
        printLine(50);
    }

    /**
     * Method to stop game until user prompts
     */
    public static void continuePrompt(){
        System.out.println("Press ENTER to continue...");
        try{
            System.in.read();
        }
        catch(Exception e){
        }

    }

    /**
     * Method to count the number of choices made
     */
    public static void choiceCounter(){
        counter++;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tChoices made :"+counter);
    }





}
