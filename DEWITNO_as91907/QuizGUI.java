/* Based on the ecs 100 template
 * Code for ??
 * Name:
 * Date:
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;


/** <description of class QuizGUI>
 */
public class QuizGUI{

    /**      */
    public QuizGUI(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);
    }



    public static void main(String[] args){
        QuizGUI obj = new QuizGUI();
    }

}

