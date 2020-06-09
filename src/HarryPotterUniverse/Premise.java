package HarryPotterUniverse;

/**
 * Static Class for the premises for every wake of the game
 * @author Mounika
 */
public class Premise {

    /**
     * Method for the premise for game intro
     * @param wizard - wizard
     */
    public static void gameIntro(Wizard wizard){
        GameSkeleton.printLine(60);
        GameSkeleton.printHeading("********************STORY********************");
        System.out.println("Congratulations "+wizard.getFullName().toUpperCase() +"!!!!! ");
        System.out.println("\n          You have been accepted at Hogwarts School of Witchcraft and Wizardry. ");
        System.out.println("You will learn a wide verity of magic and wizardry. ");
        System.out.println(" You will select your Wand type and School House ");
        GameSkeleton.printLine(60);
    }

    /**
     * Method for the premise for Tri-Wizard Tournament intro
     * @param wizard - wizard
     * @throws Exception - All exceptions and errors
     */
    public static void tournamentIntro(Wizard wizard) throws Exception{
        System.out.println();
        System.out.println("You have successfully completed Six years of magical education. Now you are in your seventh and final year");
        System.out.println("The Tri-wizard Tournament in back to hogwarts. You along with all hopefuls have put your name in the Goblet of Fire ");
        GameSkeleton.printHeading("**********TRI-WIZARD TOURNAMENT**********");
        System.out.println("It's time to draw the winners...");
        Thread.sleep(400);
        System.out.println("....and Hogwarts Champion is .....");
        Thread.sleep(400);
        System.out.println("is........");
        Thread.sleep(400);
        System.out.println("* * * * * "+wizard.getFullName().toUpperCase()+" * * * * *");
        GameSkeleton.printLine(200);
        GameSkeleton.printLine(200);
        Thread.sleep(1000);
        System.out.println("Congratulations, Your bravery and sheer determination are the reason you are selected as the Hogwarts champion.");
        System.out.println("You will be competing in three different Tasks. You have to win all three tasks to win the championship.");
        System.out.println("You are determined to win the trophy as it gives you the opportunity to meet your heroes, THE GOLDEN TRIO - Harry Potter, Hermione Granger and Ronald Weasly.");
        GameSkeleton.printLine(200);
        GameSkeleton.printLine(200);

    }

    /**
     * Method for the premise for first task
     * @throws Exception - All exceptions and errors
     */
    public static void firstTask() throws Exception{
        GameSkeleton.continuePrompt();
        GameSkeleton.printHeading("********** FIRST TASK **********");
        System.out.println("\nWelcome to the First Task of the Tri Wizard Tournament.");
        System.out.println("You will be facing a mountain troll in the open arena. You have to over come the troll and reach the other side of the arena.");
        GameSkeleton.printLine(60);
        System.out.println("All the best. You will start task at the sound of Gong....");
        Thread.sleep(1000);
        System.out.println("**** GONG BLAST ...... ****");
        System.out.println("You have entered the arena...");
        GameSkeleton.continuePrompt();
    }

    /**
     * Method for the premise for Second Task
     * @throws Exception - All exceptions and errors
     */
    public static void secondTask() throws Exception{
        GameSkeleton.continuePrompt();
        GameSkeleton.printHeading("********** SECOND TASK **********");
        System.out.println("Congratulations on winning the first task. ");
        System.out.println("\nWelcome to the Second Task of Tri Wizard Tournament.");
        System.out.println("In this task you will be tasked to tame a Hippogriff. If you tame the being you have to ride it round the Hogwarts");
        System.out.println("Remember not always wand helps. It's your mind and patience.");
        GameSkeleton.printLine(60);
        System.out.println("All the best. You will start on GO...");
        Thread.sleep(1000);
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("    2");
        Thread.sleep(1000);
        System.out.println("        1");
        Thread.sleep(1000);
        System.out.println("            ***GO***");
        System.out.println("You are ready to go...");
        GameSkeleton.continuePrompt();
    }

    /**
     * Method for the premise for Third Task
     * @throws Exception - All exceptions and errors
     */
    public static void thirdTask() throws Exception{
        GameSkeleton.continuePrompt();
        GameSkeleton.printHeading("********** THIRD TASK **********");
        System.out.println("Congratulations on winning the second task. ");
        System.out.println("\nWelcome to the Third Task of Tri Wizard Tournament.");
        System.out.println("If you get through this task you are the Tri Wizard Champion");
        System.out.println("In this task you are given choice to enter one of 2 doorways");
        System.out.println("Each way lead to a task each. The tasks are of different levels of difficulties ");
        System.out.println("No one knows which door leads where.");
        GameSkeleton.printLine(60);
        System.out.println("All the best. You will start on GO...");
        Thread.sleep(1000);
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("    2");
        Thread.sleep(1000);
        System.out.println("        1");
        Thread.sleep(1000);
        System.out.println("            ***GO***");
        System.out.println("You are ready to go...");
        GameSkeleton.continuePrompt();
    }

    /**
     * Method for the premise for Winner of Tri-Wizard Cup
     * @param wizard - wizard
     * @throws Exception - All exceptions and errors
     */
    public static void winner(Wizard wizard) throws Exception{

        System.out.println("You have landed at the start point with the Tri-Wizard cup");
        System.out.println("********** YOU ARE THE CHAMPION **********");
        System.out.println("You are felicitated by the Golden Trio..");
        System.out.println("Congratulations "+wizard.getFullName().toUpperCase()+" Champion.. Your name will be etched forever in Hogwarts history!!!");
        System.out.println("* * * * * * * * * * THE END * * * * * * * * * *");

        GameSkeleton.choiceCounter();
        System.out.println("Total no. of choices made is:" +GameSkeleton.counter);
    }
}
