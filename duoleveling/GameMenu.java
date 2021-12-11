/* Application purpose: The purpose for this assignment is to show our undersanding of the COMP1030 
course and our knowledge of the java programming language within certain boundaires and with 
spesicific requirments. We are to create a single functional java game application.
Dominik Merdzik
11/3/2021 
13:28
COMP 1030 -- Fall 2021
 */
package duoleveling;

import java.util.Scanner;

public class GameMenu {

    private String MenuChoice; // private variable to create setter and getters

    //// Setters and Getters ////
    public void setMenuChoice(String menuChoice) { // creates setMenuChoice setter that get used later on
        this.MenuChoice = menuChoice; // MenuChoice equals menuChoice
    }

    public String getMenuChoice() { // Getter for users MenuChoice
        return MenuChoice;
    }

    public String getGameMenu() { // Getter for GameMenu method
        return Menu();
    }

    public String getMainMenu() { // Getter for the Main menu the user will first see
        return MenuOptions();
    }

    /////////
    public String Menu() { // This class is the first menu the user will see when they launch the game
        Scanner in = new Scanner(System.in); // initializes "in" as scanner variable 

        // System.out.print for user interaction
        System.out.println("                    ┬─────────────────────────────┬");
        System.out.println("                      Welcome to Duo Leveling");
        System.out.println("                    ┻━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┻");
        System.out.println("    Please Type in the letter displayed beside the desired option...");
        System.out.println("you will have to do this throughout the game as it is a text based game");
        System.out.println("");
        System.out.println(" o New Game (A)");
        System.out.println(" o Continue from Save (B)");
        System.out.println(" o Options (C)");
        System.out.println(" o Exit (D)");

        // Get users input and set it to MenuChoice variable using setter then, we run the MenuOptions method
        String menuChoicePre = in.nextLine();
        // We use String class method to make any input the user gives us upper case just incase the user does 
        // give us a lower case
        String menuChoice = menuChoicePre.toUpperCase();
        this.setMenuChoice(menuChoice);
        MenuOptions();

        return menuChoice;
    }

    public void SubMenu() {
        // this method is used in the same way as the Menu() method above but instead we dont display the 
        // starting text as that is only for first time users
        System.out.println(" o New Game (A)");
        System.out.println(" o Continue from Save (B)");
        System.out.println(" o Options (C)");
        System.out.println(" o Exit (D)");

        Scanner in = new Scanner(System.in);
        String menuChoicePre = in.nextLine();
        String menuChoice = menuChoicePre.toUpperCase();
        this.setMenuChoice(menuChoice);
        MenuOptions();

    }

    public String MenuOptions() {

        DuoLevelingMainMap gameOne = new DuoLevelingMainMap(); // initializing the DuoLevelingMainMap class 
        String choiceOptions = ""; // initializing variable

        // using switch statement to get the users input and depending on what is the cases will activate.
        // If user pick an invalid option they will be brought back to the SubMenu() method which will let them 
        // re choose their option
        switch (this.getMenuChoice()) {
            case "A":
                gameOne.mainStory(); // Will send the user to the main game
                break;

            case "B":

                // notify user of an error and will be brought back to SubMenu() method
                System.out.println(" - No Save Available - ");
                System.out.println("");
                SubMenu();
                break;

            case "C":

                System.out.println(" - Otions Not Available, Check Back Next Patch! - ");
                System.out.println("");
                SubMenu();
                break;

            case "D":
                // will exit the game
                System.exit(0);
                break;

            default:

                System.out.println(" - Please Pick a Valid Option - ");
                System.out.println("");
                SubMenu();

        }

        return choiceOptions;
    }

    public void PlayerDeathMenu() { // method for them player dies to boss

        DuoLevelingMainMap gameOne = new DuoLevelingMainMap(); // initializing the DuoLevelingMainMap class 

        System.out.println(" o Continue from last checkpoint (A)");
        System.out.println(" o Exit Game (B)");
        System.out.println("");
        System.out.println("");
        // the user can either continue from last checkpoint or exit the game
        Scanner in = new Scanner(System.in);
        String menuChoicePre = in.nextLine();
        String menuChoice = menuChoicePre.toUpperCase();

        // if user picks A they will be brought back to the beginning of the game
        // if user picks B they will exit the game
        // if the user pick neither they will continue the game
        if (menuChoice.equals("A")) {
            gameOne.mainStory();
        } else if (menuChoice.equals("B")) {
            System.exit(0);
        } else {
            gameOne.mainStory();
        }

    }

    public void PlayerDeathMenuChapterTwo() { // method for them player dies to boss

        DuoLevelingMainMap gameOne = new DuoLevelingMainMap(); // initializing the DuoLevelingMainMap class 

        System.out.println(" o Continue from last checkpoint (A)");
        System.out.println(" o Exit Game (B)");
        System.out.println("");
        System.out.println("");
        // the user can either continue from last checkpoint or exit the game
        Scanner in = new Scanner(System.in);
        String menuChoicePre = in.nextLine();
        String menuChoice = menuChoicePre.toUpperCase();

        // if user picks A they will be brought back to the beginning of the game
        // if user picks B they will exit the game
        // if the user pick neither they will continue the game
        if (menuChoice.equals("A")) {
            gameOne.MainStorySectionTwo();
        } else if (menuChoice.equals("B")) {
            System.exit(0);
        } else {
            gameOne.MainStorySectionTwo();
        }

    }

}
