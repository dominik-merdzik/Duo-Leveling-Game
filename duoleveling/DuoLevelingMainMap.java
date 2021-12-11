/* Application purpose: The purpose for this assignment is to show our undersanding of the COMP1030 
course and our knowledge of the java programming language within certain boundaires and with 
spesicific requirments. We are to create a single functional java game application.
Dominik Merdzik
11/3/2021 
13:28
COMP 1030 -- Fall 2021
 */
package duoleveling;

import java.util.Arrays;
import java.util.Scanner;

public class DuoLevelingMainMap {

    public DuoLevelingMainMap() {
    }

    // initializes class Mechanics and setting the reference to "fightOne" and "fightTwo"  
    Mechanics fightOne = new Mechanics();
    Mechanics fightTwo = new Mechanics();

    private int kōseiDamageTaken; // private int holding the amount of damage done to character
    //setting currentBossHealth variables to get the bossses health from methods in Mechanics 
    private int currentBossHealth = fightOne.getEarthSeekerHealth();
    private double currentBossHealthTwo = fightTwo.getEarthEaterHealth();

    // initializing variables that are used later on
    Scanner in = new Scanner(System.in);
    String continueGame;
    boolean battle = true;

    // this method lets the player read the text output before pressing any button to continue the story
    public void gameProgress() {
        continueGame = in.nextLine();
        for (int i = 0; i > 1; i++) {
            if (continueGame.equals("throw")) {
            } else {
            }
        }
    }

    public void mainStory() { // the main story will be ran through this method.

        // System.out.print for users interaction 
        System.out.println("");
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("WARNING: If you see \"Continue...\" on your ");
        System.out.println("screen press any key then *enter* to continue the story ");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Continue...");
        gameProgress(); // method to continue when user presses any button and enter

        // lots of lore
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Kaori : Kōsei I heard of a new dungeon appearing nearby!");
        System.out.println("");
        System.out.println("Kōsei: Well I guess we have to go check it out after dinner. What level");
        System.out.println("is the dungeon?");
        System.out.println("");
        System.out.println("Kaori: I header it might be an A Rank but i'm sure it’s nothing we can't");
        System.out.println("handel");
        System.out.println("");
        System.out.println("Kōsei: Haha yeah, I'm sure of it! ");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Continue...");
        gameProgress();

        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Kaori and Kōsei have been friends since elementary school. ");
        System.out.println("They went on the same bus and lived down the street from each other. ");
        System.out.println("Kaori was the popular one while Kōsei always sat at the back of the room ");
        System.out.println("playing on his phone and listening to music.");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Continue...");
        gameProgress();

        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("As they grew up Kōsei got stronger and started fighting the demons that ");
        System.out.println("corrupted their world, while Kaori studied about them and sharpened ");
        System.out.println("her bow skills in her free time.");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Continue...");
        gameProgress();

        System.out.println("");
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Once they both made it into the Demon Hunters Academy due to Kōsei’s ");
        System.out.println("high skills with dual wielding and Kaori’s vast knowledge of ");
        System.out.println("the demons, they quickly became the face and power team of the academy.");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Continue...");
        gameProgress();

        System.out.println("");
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Kaori: OH MANNNN--  I’m stuffed, we should take a quick break before we ");
        System.out.println("head to the dungeon");
        System.out.println("");
        System.out.println("Kōsei: But if we get there first we can get all the loot and mob xp");
        System.out.println("before everyone else does");
        System.out.println("");
        System.out.println("Kaori: Ughh I guess you're right. Help me clean up and then we’ll ");
        System.out.println("headout, alright?");
        System.out.println("");
        System.out.println("Kōsei: Sounds good!");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Continue...");
        gameProgress();

        System.out.println("");
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("                 *Kōsei and Kaori head to the dugneon*                    ");
        System.out.println("  once they get in they notice that it's different then most of the       ");
        System.out.println("                   other dungeons they've been to...                      ");
        System.out.println("");
        System.out.println("                        GET READY TO FIGHT                                ");
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Start Fight...");
        gameProgress();

        // do... everything in in curly braces until condition in the while is reached
        do {

            //setting these values to update every time the loop gets reran
            int kōseiCurrentHealth = fightOne.getKoseiHealth();
            currentBossHealth = fightOne.getEarthSeekerHealth();

            // if the boss drops down to or lower than 0 health...
            if (currentBossHealth <= 0) {
                currentBossHealth = 0; // sets the health to 0 so user cant see the health go under 0 (into negaitives)

                System.out.println("");
                System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
                System.out.println("                      *Kōsei: " + kōseiCurrentHealth + "hp*                      ");
                System.out.println("                   *Earth Seeker: " + currentBossHealth + "hp*                   ");
                System.out.println("");
                System.out.println("                 ＦＩＮＡＬ ＡＴＴＡＣＫ (A)");
                System.out.println("");
                System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
                System.out.println("");

            } else { // if the boss isnt at 0 hp or lower...

                System.out.println("");
                System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
                System.out.println("                       *Kōsei: " + kōseiCurrentHealth + "hp*                      ");
                System.out.println("                    *Earth Seeker: " + currentBossHealth + "hp*                   ");
                System.out.println("");
                System.out.println("Standard Attack: 25 AD (A)");
                System.out.println("Dual Slash: 125 AD (B)");
                System.out.println("Death Blade Barrage: 500 AP (C)");
                System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
                System.out.println("");
            }
            continueGame = in.nextLine();
            String attackChoice = continueGame.toUpperCase();

            // switch statement that sets the value of attack damage based on the users input
            int attackDamage = 0;
            switch (attackChoice) {
                case "A":
                    attackDamage = 25;
                    break;
                case "B":
                    attackDamage = 125;
                    break;
                case "C":
                    attackDamage = 500;
                    break;
                case "D":
                    // for debugging
                    attackDamage = 2000;
                    break;
                default:
                    break;
            }

            // attack damage variable then gets ran through the BossUpdateHealth() method  
            fightOne.getBossUpdateHealth(attackDamage);

            // here we get the characters damage taken
            kōseiDamageTaken = fightOne.getDamageTaken();

            System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("");
            System.out.println("           Kōsei Took " + kōseiDamageTaken + "hp of damage from the boss  ");
            System.out.println("");
            System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("");
            System.out.println("Continue...");
            gameProgress();

            // the loop will continue until the bosses health is under 0 
        } while (currentBossHealth > 0);

        // automatically loads our next method which is how we make the "checkpoint for the game"
        MainStorySectionTwo();
    }

    public void MainStorySectionTwo() {

        System.out.println("");
        System.out.println("");
        System.out.println("╔═════════════════ ∘◦ ☆ ◦∘ ══════════════════╗");
        System.out.println("");
        System.out.println("      ＹＯＵ ＨＡＶＥ ＬＥＶＥＬＥＤ ＵＰ！    ");
        System.out.println("");
        System.out.println("         Your damage has increased!        ");
        System.out.println("");
        System.out.println("╚═════════════════ ∘◦ ❉ ◦∘ ══════════════════╝");
        System.out.println("Continue...");
        gameProgress();

        System.out.println("");
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Kōsei: Was it just me or was that boss a lot harder than a normal  ");
        System.out.println("Rank A boss?");
        System.out.println("");
        System.out.println("Kaori: Yeah definitely. Oh man! I used up most of my mana postions for");
        System.out.println("that fight- pfff, it's not over though we still have the final boss and");
        System.out.println("something tells me that he's behind that locked door over there.");
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Continue...");
        gameProgress();

        System.out.println("");
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("");
        System.out.println("Kōsei and Kaori try and open the door to the next room but first they need");
        System.out.println("to get the right combination before going on...");
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Continue...");
        gameProgress();

        // we get values for our 2d array from EnemyCount() method 
        int amountOfEnemies[][] = fightOne.getEnemyCount();

        // here we make a layout of the room and tell the player how many enemies they will be fighting
        // by adding specific the elements of the array
        System.out.println("");
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Kōsei: That is a lot of void demons, those are extra difficult!");
        System.out.println("Kaori: Ugh Alrght, lets split it up! I'll take the " + (amountOfEnemies[0][0] + amountOfEnemies[1][0] + amountOfEnemies[2][0]) + " demons on the");
        System.out.println("right and you take the " + (amountOfEnemies[0][2] + amountOfEnemies[1][2] + amountOfEnemies[2][2]) + " on the left");
        System.out.println("Kōsei: And we'll meet up in the center?");
        System.out.println("Kaori: You got it babe");
        System.out.println("");
        System.out.println("");
        System.out.println("↓ Layout of enemies in the room ↓");
        System.out.println("");
        System.out.println("    Kaori and Kōsei");
        System.out.println("           ↓");
        System.out.println("        ~o~ ~o~    ");
        // we display the array in a box 3x3 layout with the help of our replace method
        System.out.println(Arrays.deepToString(amountOfEnemies).replace("],", "\n").replace(",", "\t| ").replaceAll("[\\[\\]]", " ")); // refernce for array display method: https://stackoverflow.com/questions/19648240/java-best-way-to-print-2d-array
        System.out.println("      ↑     ↑     ↑");
        System.out.println("         Enemies");
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Continue...");
        gameProgress();

        System.out.println("");
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("");
        System.out.println("Kaori: Phew that was a pain");
        System.out.println("Kōsei: Look over there it's the boss");
        System.out.println("");
        System.out.println("                【﻿ ＭＩＧＨＴＹ　ＥＡＲＴＨ　ＥＡＴＥＲ 】");
        System.out.println("                                9000HP");
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Continue...");
        gameProgress();

        System.out.println("");
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("");
        System.out.println("Kaori: If we take him on together we'll get our damage buff!");
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("lets do it!..");
        gameProgress();

        // this is the same idea as the first boss fight but here we have it running in a while loop where
        // if the bosses health goes down to 0 the "flag" or variable battle will be set to false and the while 
        // will stop running
        while (battle == true) {

            //setting these values to update every time the loop gets reran
            int kōseiCurrentHealth = fightTwo.getKoseiHealth();
            currentBossHealthTwo = fightTwo.getEarthEaterHealth();

            if (currentBossHealthTwo <= 0) {
                currentBossHealthTwo = 0;
                battle = false;
                System.out.println("");
                System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
                System.out.println("                      *Kōsei: " + kōseiCurrentHealth + "hp*                      ");
                System.out.println("                   *Earth Seeker: " + currentBossHealthTwo + "hp*                   ");
                System.out.println("");
                System.out.println("                 ＦＩＮＡＬ ＡＴＴＡＣＫ (A)");
                System.out.println("");
                System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
                System.out.println("");

            } else {

                System.out.println("");
                System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
                System.out.println("                       *Kōsei: " + kōseiCurrentHealth + "hp*                      ");
                System.out.println("                    *Earth Eater: " + currentBossHealthTwo + "hp*                   ");
                System.out.println("");
                System.out.println("Standard Attack: 50 AD + bonus damage (A)");
                System.out.println("Dual Slash: 175 AD + bonus damage (B)");
                System.out.println("Death Blade Barrage: 525 AP + bonus damage (C)");
                System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
                System.out.println("");
            }
            continueGame = in.nextLine();
            String attackChoice = continueGame.toUpperCase();

            double attackDamage = 0;
            switch (attackChoice) {
                case "A":
                    attackDamage = 50 * 2.15;
                    break;
                case "B":
                    attackDamage = 175 * 1.55;
                    break;
                case "C":
                    attackDamage = 525 * 1.25;
                    break;
                case "D":
                    // for debugging
                    attackDamage = 4500;
                    break;
                default:
                    break;
            }

            fightTwo.getBossUpdateHealth(attackDamage);

            kōseiDamageTaken = fightTwo.getDamageTakenBossTwo();

            System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("");
            System.out.println("           Kōsei Took " + kōseiDamageTaken + "hp of damage from the boss                    ");
            System.out.println("");
            System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("");
            System.out.println("Continue...");
            gameProgress();

            // he we set battle to false when the user kills the final boss
            if (currentBossHealthTwo <= 0) {
                battle = false;
            }

        }

        // final message to the user with System.exit command to end the build of our game
        System.out.println("");
        System.out.println("");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("                    (っ◔◡◔)っ ♥ - CONGRATULATIONS- ♥");
        System.out.println("");
        System.out.println("                     YOU HAVE COMPLETED DUO LEVELING");
        System.out.println("");
        System.out.println("                           THANK YOU FOR PLAYING           ");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Exit...");
        gameProgress();
        System.exit(0);

    }

}
