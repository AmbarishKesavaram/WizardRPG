package HarryPotterUniverse;

/**
 * Class for the Second Task
 * @author Ambarish
 */
public class SecondTask implements Movable, Rideable {

    /**
     * Method for implementation of Second Task
     * @throws Exception - All exceptions and errors
     */
    public void secondTask() throws Exception{
        boolean flag = false;
        Premise.secondTask();

        System.out.println("You can approach the Hippogriff in 3 ways. ");

        do{
            System.out.println("1. Casual");
            System.out.println("2. Defence ");
            System.out.println("3. Attack");

            int option = GameSkeleton.readChoice("Select one Option:",3);
            GameSkeleton.choiceCounter();

            if(option == 1){
                casual();
                System.out.println("Please reselect one of the approaches......");


            }else if(option == 2) {
                defend();
                System.out.println("The Hippogriff trusts you.You can climb and ride him now");
                boolean tempBool = false;

                do {
                    System.out.println("Type what to do..");

                    String toDo = GameSkeleton.scanner.next();
                    GameSkeleton.choiceCounter();

                    if (toDo.equals("ride") || toDo.equals("Ride") || toDo.equals("RIDE")) {
                        ride();
                        System.out.println("Congratulations you have passed the Second task");
                        tempBool = true;
                    } else {
                        System.out.println("I don't recognize what that is..");

                        boolean hintBool = false;
                        do {
                            System.out.println("Please type 'hint' to get... you know.... hint");
                            String hint = GameSkeleton.scanner.next();

                            if (hint.equals("hint") || hint.equals("Hint")) {
                                System.out.println("type 'ride' ...");
                                hintBool = true;
                            } else {
                                System.out.println("I don't recognize what that is.. ");
                            }
                        } while (!hintBool);
                    }

                } while (!tempBool);
                flag = true;
            }else if(option == 3) {
                attack();
                GameSkeleton.printLine(60);
                System.out.println("You are out of contention for the Tri Wizard trophy. ");
                System.out.println("You were good in the first round but your heart was not in the right place for the second task.");
                System.out.println("Don't lose heart. You are a good contestant.");
                System.out.println("Hogwarts will not win the Tri-Wizard cup this time");
                System.out.println("* * * * * * * THE END * * * * * * * ");
                System.exit(0);
            }

        }while (!flag);

    }

    /**
     * Implementation of Abstract method for attack functionality
     * @return - 0
     */
    @Override
    public int attack() {
        System.out.println("WHAT THE HELL... YOU DON'T ATTACK A HIPPOGRIFF.");
        System.out.println("The hippogriff is a proud being. It got on it's hind legs and hit you square on the chest");
        System.out.println("You barely escaped, but you are badly hurt..");

        return 0;
    }

    /**
     * Method for casual functionality
     * @throws Exception - All exceptions and errors
     */
    public void casual() throws Exception{
        System.out.println("You have approached the Hippogriff");
        Thread.sleep(500);
        System.out.println("Your casual approach is not recommended but it's a relief that Hippogriff did not attack you ");
        Thread.sleep(500);
        System.out.println("You have bowed your head...");
        Thread.sleep(500);
        System.out.println("The hippogriff is waiting....");
        Thread.sleep(1000);
        System.out.println("waiting...");
        Thread.sleep(1000);
        System.out.println("waiting...              \nDon't loose eye contact..");
        Thread.sleep(1000);
        System.out.println("Hippogriff is not trusting slowly back off and plan a different approach");
    }

    /**
     * Implementation Abstract method for defend functionality
     * @throws Exception - All exceptions and errors
     */
    @Override
    public void defend() throws Exception {
        System.out.println("You have approached Hippogriff carefully maintaining eye contact");
        Thread.sleep(500);
        System.out.println("This is a good approach.");
        Thread.sleep(500);
        System.out.println("You have bowed your head...");
        Thread.sleep(500);
        System.out.println("The hippogriff is waiting....");
        Thread.sleep(1000);
        System.out.println("waiting...          \nDon't loose eye contact..");
        Thread.sleep(1000);
        System.out.println(".... Hippogriff has bowed down to you..");
        System.out.println("\nSlowly approach the Hippogriff and pat it");
        Thread.sleep(500);
    }

    /**
     * Implementation Abstract method for riding functionality
     * @throws Exception - All exceptions and errors
     */
    @Override
    public void ride() throws Exception{
        System.out.println("You have successfully ridden the Hippogriff round the School");
    }
}
