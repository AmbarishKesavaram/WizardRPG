package HarryPotterUniverse;

/**
 * Class for the First Task
 * @author Ambarish
 */
public class FirstTask  implements Movable {

    /**
     * Method for implementation of First Task
     * @throws Exception - All exceptions and errors
     */
    public void firstTask() throws Exception{
        Premise.firstTask();

        System.out.println("You have two options, to attack or to be defencive");

        do{
            System.out.println("1. Attack");
            System.out.println("2. Defend");

            int option = GameSkeleton.readChoice("Select one option:",2);
            GameSkeleton.choiceCounter();
            if(option == 1){
               int spell =  attack();

               if(spell == 1){
                   System.out.println("The troll's club rose high in the air and fell with a thud on it's head..");
                   System.out.println("Congratulations you have passed the first task");
                   GameSkeleton.choiceCounter();
                   break;
               }
               else if(spell == 2 ){
                   System.out.println("Your spell hit the troll square in the face and it knocked him out.. ");
                   System.out.println("Congratulations you have passed the first task");
                   GameSkeleton.choiceCounter();
                   break;
               }
               else if(spell == 3){
                   System.out.println("You have propelled yourself into the air. This doesn't help in defeating the troll.. ");
                   System.out.println("Troll just charged at you and you barely escaped with small injuries");
                   GameSkeleton.printLine(60);
                   System.out.println("You are out of contention for the Tri Wizard trophy. ");
                   System.out.println("You brought shame to your house and the School");
                   System.out.println("* * * * * * * THE END * * * * * * * ");
                   GameSkeleton.choiceCounter();
                   System.exit(0);
               }
            }
            else if (option == 2){
                defend();
            }

        }while (true);
    }

    /**
     * Implementation of Abstract method for attack functionality
     * @return - the choice
     * @throws Exception - All exceptions and errors
     */
    @Override
    public int attack() throws Exception {
        System.out.println("Select a spell to attack the troll. Choose wisely only 2 of the three spells can defeat the troll");
        System.out.println("1. Wingardium Leviosa");
        System.out.println("2. Stupefy");
        System.out.println("3. Ascendio");

        return GameSkeleton.readChoice("Select a Spell", 3);
    }

    /**
     * Implementation Abstract method for defend functionality
     * @throws Exception - All exceptions and errors
     */
    @Override
    public void defend() throws Exception {
        System.out.println("Duck out of the way of the troll's club and strategize a plan to attack... ");
    }
}
