/* Application purpose: The purpose for this assignment is to show our undersanding of the COMP1030 
course and our knowledge of the java programming language within certain boundaires and with 
spesicific requirments. We are to create a single functional java game application.
Dominik Merdzik
11/3/2021 
13:28
COMP 1030 -- Fall 2021
 */
package duoleveling;

import java.util.Random;

public class Mechanics {

    // initiating a new GameMenu class for when player dies and goes back to the menu class
    GameMenu playerDead = new GameMenu();

    // initiating variables and hardcoding values for them to be used in methods
    // players health but be taken away therefore they are up here
    // we also see the use of wrapper class Integer 
    private static Integer KoseiHealth = 5000;
    private static int EarthSeekerHealth = 2000;
    private static double EarthEaterHealth = 9000;

    // all the getters we will need for other classes to be able to call on 
    // the methods from this class
    public int getKoseiHealth() {
        return KoseiHealth;
    }

    public int getDamageTaken() {
        return DamageTaken();
    }

    public int getDamageTakenBossTwo() {
        return DamageTakenBossTwo();
    }

    public int getEarthSeekerHealth() {
        return EarthSeekerHealth;
    }

    public double getEarthEaterHealth() {
        return EarthEaterHealth;
    }

    public int[][] getEnemyCount() {
        return EnemyCount();
    }

    // these are two getters for our overloaded methods
    // one takes an int value and other takes double
    public int getBossUpdateHealth(int bossHealth) {
        return BossUpdateHealth(bossHealth);
    }

    public double getBossUpdateHealth(double bossHealth) {
        return BossUpdateHealth(bossHealth);
    }

    // damage taken method that picks a one of the listed damage values randomly
    // from our 1D array and then take the health away from our variable initiated
    // at the top "KoseiHealth"
    // we have an if statement that checks if the players hp has dipped below 0 and 
    // if it has the message written will be printed and the player will be brough 
    // to GameMenu class where the please dead menu will give the player options on what to do next
    private int DamageTaken() {

        Random randNum = new Random(); // creating new Random Number
        int damageList[] = {200, 150, 500, 25}; // putting values of damage the character can take
        int damageTakenBossOne = damageList[randNum.nextInt(4)]; // randomly picked value

        KoseiHealth -= damageTakenBossOne; // takes the randomly picked value away from players health

        if (KoseiHealth < 0) {
            System.out.println("┍━━━━━━━━━━━★━━━━━━━━━━━┑");
            System.out.println("   you have died... ");
            System.out.println("┕━━━━━━━━━━★━━━━━━━━━━━━┙");
            System.out.println("");
            KoseiHealth = 5000; // resetting the players health to 100%
            playerDead.PlayerDeathMenu(); // retuned to GameMenu class, PlayerDeathMenu() method
        }

        return damageTakenBossOne; // characters updated health will be retunrn if method is ran 
    }

    // same thing as the last class but here we have differnet values for the amount of damage 
    // the character can take
    private int DamageTakenBossTwo() {

        Random randNum = new Random(); // creating new Random Number
        int damageList[] = {280, 175, 600, 50};
        int damageTakenBossOne = damageList[randNum.nextInt(4)];
        KoseiHealth -= damageTakenBossOne;

        if (KoseiHealth < 0) {
            System.out.println("┍━━━━━━━━━━━★━━━━━━━━━━━┑");
            System.out.println("   you have died... ");
            System.out.println("┕━━━━━━━━━━★━━━━━━━━━━━━┙");
            System.out.println("");
            KoseiHealth = 5000;
            playerDead.PlayerDeathMenuChapterTwo();
        }

        return damageTakenBossOne;
    }

    // two overloaded methods which take the value inputted into the method condtion 
    // and take it away from the bosses total health
    private int BossUpdateHealth(int bossHealth) {

        EarthSeekerHealth -= bossHealth;

        return EarthSeekerHealth;
    }

    private double BossUpdateHealth(double bossHealth) {

        EarthEaterHealth -= bossHealth;

        return EarthEaterHealth;
    }

    // here we have the method which randomly makes up values for the amount of enemies in 
    // each row for our game
    // we use a try-catch to catch an ArrayIndexOutOfBoundsException 
    // if there is an exception we have the catch hardcode pre set values 
    // finally we return the variable which stores our array of values
    private int[][] EnemyCount() {

        Random randTwo = new Random(); // initiating new random variable
        int rowsOfEnemy = 3; // 3 rows
        int columnsOfEnemy = 3; //3 comlumns

        int[][] enemyNumberTotal = new int[rowsOfEnemy][columnsOfEnemy]; // making of the 3x3 2-D array

        try { //trying
            // creating random values withing 10-30 and setting and putting them in the array
            for (int row = 0; row < enemyNumberTotal.length; row++) {
                for (int col = 0; col < enemyNumberTotal.length; col++) {
                    enemyNumberTotal[row][col] = randTwo.nextInt(31) + 10;
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) { //catch if there is error
            enemyNumberTotal = new int[][]{{20, 21, 43}, {23, 33, 12}}; //hardcoding values
        } finally {
            return enemyNumberTotal; //returning the values
        }

    }

}
