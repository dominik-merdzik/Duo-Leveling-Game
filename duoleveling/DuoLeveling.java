/* Application purpose: The purpose for this assignment is to show our undersanding of the COMP1030 
course and our knowledge of the java programming language within certain boundaires and with 
spesicific requirments. We are to create a single functional java game application.
Dominik Merdzik
11/3/2021 
13:28
COMP 1030 -- Fall 2021
 */
package duoleveling;

public class DuoLeveling {

    public static void main(String[] args) {

        System.out.println("loading..."); // A loading message for the user to see the game is loading 
        for (int i = 0; i < 4; i++) { //looping white space to show separation between this section and the next
            System.out.println("");
        }
        GameMenu gameOne = new GameMenu(); // initiating a new GameMenu class
        gameOne.getGameMenu(); // executing method "GameMenu"

    }

}
