package HarryPotterUniverse;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * Class for Start of game.
 * @author - Raghu
 */
public class Game {
    /**
     * Method to get started with the Adventure Game..
     * @throws Exception - All exceptions and errors
     */
    public void startAdventure()  throws Exception {

        String gender;
        boolean genderSet = false;
        boolean dobSet = false;
        int age;
        Wizard wizard = new Wizard();                           // Initiating Wizard class

        /**
         * Game Intro
         */
        {
            GameSkeleton.printLine(60);
            GameSkeleton.printLine(60);

            System.out.println("*************HARRY POTTER UNIVERSE**************");
            System.out.println("**********A TEXT BASED ADVENTURE GAME***********");

            GameSkeleton.printLine(60);
            GameSkeleton.printLine(60);

            /* Game Authors*/
            System.out.println("GAME BY AMBARISH KESAVARAM, RAGHU NALUVALA AND MOUNIKA NAGABHYRU");
            System.out.println();
            GameSkeleton.printLine(60);
        }
        GameSkeleton.continuePrompt();

        /**
         * Input Wizard details
         */

        {
            GameSkeleton.printLine(60);

            /* Name */
            {
                System.out.println("What's your name?");
                wizard.setFullName(GameSkeleton.scanner.next());
                System.out.println();
            }
            Thread.sleep(1000);

            /* Gender */
            {
                do {
                    System.out.println("What is your Gender?");
                    System.out.println(" Male       Female");
                    wizard.setGender(GameSkeleton.scanner.next());
                    gender = wizard.getGender();
                    if (gender.equals("m") || gender.equals("M") || gender.equals("male") || gender.equals("Male") || gender.equals("MALE")) {
                        genderSet = true;
                        wizard.setGender("Male");
                        System.out.println("Your gender is " + wizard.getGender());
                    } else if (gender.equals("f") || gender.equals("F") || gender.equals("female") || gender.equals("Female") || gender.equals("FEMALE")) {
                        genderSet = true;
                        wizard.setGender("Female");
                        System.out.println("Your gender is " + wizard.getGender());
                    }

                    if (!genderSet)
                        System.out.println("\n Please enter valid gender?");
                } while (!genderSet);
            }
            Thread.sleep(1000);

            /* Date Of Birth and Age */
            {
                do {
                    try {
                        System.out.println("\n Enter Date of birth in YYYY-MM-DD format!!");
                        wizard.setDateOfBirth(LocalDate.parse(GameSkeleton.scanner.next()));

                        LocalDate dob = wizard.getDateOfBirth();

                        wizard.setAge(Period.between(dob, LocalDate.now()).getYears());
                        age = wizard.getAge();



                        if (age >= 18 && age <= 70) {
                            System.out.println("Your Date of Birth is " + dob.toString());
                            Thread.sleep(200);
                            System.out.println("Your age is " + age);
                            dobSet = true;
                        }
                        else {
                            if (age < 18) {
                                System.out.println("You are too young to play the game..");
                            } else if (age > 70) {
                                System.out.println("You are too old to play the game..");
                            }
                            System.out.println("Change age?");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            int option = GameSkeleton.readChoice("", 2);
                            GameSkeleton.choiceCounter();

                            if (option == 1) {
                                dobSet = false;
                            } else if (option == 2) {
                                System.out.println("Good Bye..");
                                System.exit(0);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Wrong Format.....!!!");
                    }
                } while (!dobSet);
            }
            Thread.sleep(1000);
        }

        /**
         *  Displaying Wizard Details
         */

        {
            GameSkeleton.printLine(60);
            GameSkeleton.printLine(60);
            System.out.println("***********Wizard Details***********");
            System.out.println("Name            :           " + wizard.getFullName().toUpperCase());
            System.out.println("Gender          :           " + wizard.getGender().toUpperCase());
            System.out.println("Age             :           " + wizard.getAge()+" years");
            System.out.println("Date of Birth   :           " + wizard.getDateOfBirth());
            GameSkeleton.printLine(60);
            GameSkeleton.printLine(60);
        }
        GameSkeleton.continuePrompt();

        /* Select your choice of wand */
        Premise.gameIntro(wizard);
        selectWand();

        /* Select your choice of house*/
        selectHouse();

        /* Game Introduction*/
        Premise.tournamentIntro(wizard);

        /* First Task*/

        FirstTask firstTask = new FirstTask();
        firstTask.firstTask();

        /* Second Task */
        SecondTask secondTask = new SecondTask();
        secondTask.secondTask();

        /* Third Task */

        ThirdTask thirdTask = new ThirdTask();
        thirdTask.thirdTask(wizard);
    }

    /**
     * Method to select your wand
     * @throws Exception - All exceptions and errors
     */
    public void selectWand() throws Exception{

        System.out.println("Please select the wand of your choice");
        System.out.println("1. Ebony and Dragon Heartstring  ");
        System.out.println("2. Aspen and Veela Hair " );
        System.out.println("3. Holly and Unicorn Hair");
        int wandChoice = GameSkeleton.readChoice("Choose One Wand",3);
        GameSkeleton.choiceCounter();
        if(wandChoice == 1)
            System.out.println("You have chosen a wand with Ebony wood  and Dragon Heartstring core. Your wand is naturally powerful and is highly suited for Transfiguration");
        else if(wandChoice == 2)
            System.out.println("You have chosen a wand with Aspen wood  and Veela Hair core. Your wand is temperamental and is highly suited for Charms work");
        else if(wandChoice == 3){
            System.out.println("You have chosen a wand with Holly wood  and Unicorn Hair core. Your wand is consistant and is highly suited for powerful spell work");
        }

        Thread.sleep(600);

    }

    /**
     * Method to select your House
     * @throws Exception - All exceptions and errors
     */
    public void selectHouse() throws Exception{

        System.out.println("Please select your school House.");
        System.out.println("1. Gryffindor");
        System.out.println("2. Slytherin");
        System.out.println("3. Hufflepuff");
        System.out.println("4. Ravenclaw");
        int houseChoice = GameSkeleton.readChoice("Choose one house:",4);
        GameSkeleton.choiceCounter();
        if(houseChoice ==1){
            System.out.println("You are brave, courageous and chivalrous. So you are... GRYFFINDOR!! ");
        }else if(houseChoice == 2){
            System.out.println("You are ambitious, leader and resourceful. So you are... SLYTHERIN!!");
        }else if(houseChoice == 3){
            System.out.println("You are hardworking, patient and loyal. So you are... HUFFLEPUFF!!");
        }else if(houseChoice == 4){
            System.out.println("You are intelligent, creative and witty. So you are... RAVENCLAW!!");
        }

        Thread.sleep(600);

    }
}
