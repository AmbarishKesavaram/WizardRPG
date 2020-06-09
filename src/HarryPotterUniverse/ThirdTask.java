package HarryPotterUniverse;

/**
 * Class for the Third Task
 * @author Ambarish
 */
public class ThirdTask implements Movable, Rideable {

    /**
     * Method for implementation of Third Task
     * @param wizard - wizard
     * @throws Exception - All exceptions and errors
     */
    public void thirdTask(Wizard wizard) throws Exception {

        boolean doorBool = false;
        Premise.thirdTask();

        System.out.println("You have two doors in front of you. Choose any one door. Each door leads to a different challenge ");


        System.out.println("1. Door One");
        System.out.println("2. Door Two");

        int option = GameSkeleton.readChoice("Enter a door", 2);
        GameSkeleton.choiceCounter();

        if (option == 1) {
            System.out.println("You entered door one");
            Thread.sleep(1000);
            System.out.println("you are faced with 2 ways. You have to take one route");
            System.out.println("Which route do you want to take?");

            do {
                System.out.println("1. Left");
                System.out.println("2. Right");
                int route = GameSkeleton.readChoice("Select your route:", 2);
                GameSkeleton.choiceCounter();
                if (route == 1) {
                    System.out.println("Walk by the left route. The route is dark and you can't see anything");

                    System.out.println("You have your wand with you. What will you do...?");

                    do {
                        System.out.println("1. Lumos");
                        System.out.println("2. Incendio");
                        int spell = GameSkeleton.readChoice("Cast a spell:", 2);
                        GameSkeleton.choiceCounter();
                        if (spell == 1) {
                            System.out.println("You have illuminated your wand ");
                            break;

                        } else if (spell == 2) {
                            System.out.println("There is no wood to light it on fire try again");
                            System.out.println("Please try again..");
                        }
                    } while (true);
                    System.out.println("Your path is now illuminated.. proceed");
                    Thread.sleep(1000);
                    System.out.println("You walk into an open area after walking for a while..");
                    System.out.println("You are the edge of a cliff and there is an infinitely deep vally in front of you.");
                    Thread.sleep(400);
                    System.out.println("Far away you see a shiny little spec on top of a small cliff");
                    Thread.sleep(400);
                    System.out.println("It.... is..... the..... Try- wizard cup ");
                    Thread.sleep(1000);
                    System.out.println("Now that your eye adjusted to the light you can see a broomstick dangling high in the air..");
                    System.out.println("You can summon the broomstick..");

                    do {
                        System.out.println("Cast a spell..");
                        System.out.println("1. Accio");
                        System.out.println("2. Aguamenti");
                        int spell = GameSkeleton.readChoice("What spell to cast?:", 2);
                        GameSkeleton.choiceCounter();
                        if (spell == 1) {
                            System.out.println("The broomstick is summoned and you can ride it to reach the tri-wizard cup.");
                            ride();
                            System.out.println("The cup is a portkey and you are disapperated to.....");
                            Thread.sleep(1000);
                            break;

                        } else if (spell == 2) {
                            System.out.println("What the hell does a stream of water do for you to summon the broomstick...!!!");
                            System.out.println("Try again...");
                            System.out.println("Remember, you are just steps away from picking the cup and winning the tournament");
                        }
                    } while (true);
                    break;
                } else if (route == 2) {
                    System.out.println("Walk by the Right route.");
                    System.out.println("You keep walking a while... ");
                    Thread.sleep(2000);
                    System.out.println("You keep walking and walk into an open sky");
                    Thread.sleep(1000);
                    System.out.println("There is a creature there in the middle of the space..");
                    Thread.sleep(1000);
                    System.out.println("It's a sphinx. You approach it. ");
                    Thread.sleep(1000);
                    System.out.println("The sphinx start to speak....");
                    System.out.println("'Hello champion, \n\t Welcome.. You are just steps away from winning the championship. All you have to do is answer my puzzle.");
                    System.out.println("If you choose the wrong answer you are allowed to walk back and choose the route again. ");
                    System.out.println("If you choose correct answer you are allowed to pass me and the cup is yours.");
                    System.out.println("So, here is your puzzle'");
                    System.out.println("\nPress enter to continue to puzzle...");
                    GameSkeleton.continuePrompt();

                    System.out.println("Take away my first letter, and I still sound the same. \nTake away my last letter, I still sound the same. \nEven take away my letter in the middle, I will still sound the same.");

                    System.out.println("'So, what is your answer..'");

                    String answer = GameSkeleton.scanner.next();
                    GameSkeleton.choiceCounter();

                    if (answer.equals("empty") || answer.equals("Empty") || answer.equals("EMPTY")) {
                        System.out.println("That is right answer..");
                        System.out.println("you can pass me and go collect the trophy");
                        System.out.println("The cup is a portkey and you are disapperated to.....");
                        Thread.sleep(1000);
                        break;
                    } else {
                        System.out.println("That's the wrong answer..");
                        System.out.println("You are sent back to the start of the two ways..");
                        System.out.println("Choose the ways right now..");
                    }
                }

            } while (true);

        } else if (option == 2) {
            System.out.println("You entered door two");
            Thread.sleep(1000);
            System.out.println("There is a plane ground in front of you..");
            Thread.sleep(1000);
            System.out.println("There is a three headed menacing dog which is 10 feet of height just feet away from the tri wizard cup in the ground ");
            System.out.println("\nThere are two ways to deal with it..");

            do {
                System.out.println("You can either be attacking and defencive");

                System.out.println("1. Attack");
                System.out.println("2. Defence");
                int plan = GameSkeleton.readChoice("Whats your way:", 2);

                if (plan == 1) {
                    attack();
                    System.out.println("You are given another chance to get past the dog ");


                } else if (plan == 2) {
                    defend();
                    System.out.println("The cup is a portkey and you are disapperated to.....");
                    break;
                }
            } while (true);
        }
        Premise.winner(wizard);
    }

    /**
     * Implementation of Abstract method for attack functionality
     * @return - 0
     * @throws Exception - All exceptions and errors
     */
    @Override
    public int attack() throws Exception {
        System.out.println("You chose to attack..");
        System.out.println("What spell do you want to cast..");
        System.out.println("1. Stupify");
        System.out.println("2. Expecto Pertonum");
        System.out.println("3. Expelliarmus");
        int spell = GameSkeleton.readChoice("Select a spell",3);

        System.out.println("No matter the spell it doesn't affect the dog. It's thick skin means the dog doesn't even notice you");

        return 0;
    }

    /**
     * Implementation Abstract method for defend functionality
     * @throws Exception - All exceptions and errors
     */
    @Override
    public void defend() throws Exception {
        System.out.println("The only way the dog is not menacing is when it sleeps.");
        System.out.println("It sleeps when there is music playing..");
        Thread.sleep(1000);
        System.out.println("You have conjured a music instrument ");
        System.out.println("You played the instrument. The dog is sleeping .....");
        System.out.println("You reached the cup and touched the cup");
        System.out.println("The cup is a portkey and you are disapperated to.....");

    }

    /**
     * Implementation Abstract method for riding functionality
     * @throws Exception - All exceptions and errors
     */
    @Override
    public void ride() throws Exception {
        System.out.println("You ride the broom to reach the cup. ");
        System.out.println("You reached the cup and touched the cup");
    }
}
