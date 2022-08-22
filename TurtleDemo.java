/**
 * Every Java program contains one or more classes (e.g., TurtleDemo).
 * 
 * In general, every source file (e.g., TurtleDemo.java) contains one class (e.g., TurtleDemo).
 * 
 * The source file name must match the class name.
 * 
 * By convention, class names start with an uppercase letter.
 * 
 * @author gcschmit
 * @version 22 August 2022
 */

import java.awt.Color;

public class TurtleDemo
{
    /*
     * A class contains methods.
     * 
     * Most Java programs contain a class with a main method.
     * 
     * The main method is executed when the program starts.
     */
    public static void main(String[] args)
    {
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.ORANGE);
        crush.penDown();
        
        /*
         * A method contains statements.
         * 
         * Statements may invoke other methods (e.g., forward).
         * 
         * In general, methods are invoked on objects (e.g., crush).
         * 
         * When invoking a method, arguments are passed in parentheses (e.g., 50).
         */
        crush.forward(50);      // comment at the end of a line
        
        // this is a single-line comment (like # in python)
        
        /*
         * A statement contains identifiers.
         * 
         * Identifiers are any combination of:
         *      letters
         *      digits (but not as the first character)
         *      underscores (_)
         *      dollar signs ($)
         *      
         *  These are various identifiers:
         */
        int y, x2, x_y, total$;
        
        // this is not a valid identifier:
        //int 2y;
        
        /*
         * Identifiers are case sesitive (case matters).
         * 
         * These are different identifiers:
         */
        Turtle squirt, SQUIRT, sQUirt;
        
        /*
         * By convention, constants are all uppercase. Use an underscore to separate words.
         */
        int SPEED_OF_LIGHT = 300000000; // m/s
        
        /*
         * By convention, most other identifiers start with a lowercase letter.
         *      Subsequent words start with an uppercase letter (CamalCase).
         */
        World pacificOcean;
        
        /*
         * This is a compile-time error. (This code doesn't compile.)
         * 
         * These are often called syntax errors.
         */
        //crush.forwrd(50);
        
        /*
         * This a run-time error. (This code compiles and runs, but generates an exception.
         *      In most cases, the program crashes.)
         */
        //crush.forward(1 / 0);
        
        /*
         * This is also a run-time error. (This code compiles and runs, but it doesn't
         *      produce the expected output.)
         *      
         *  More specificially, this is a logical error as the turtle turns right
         *      instead of left.
         */
        // have the turtle turn left and move forward 50 steps
        crush.turn(90);
        crush.forward(50);
    }
}
