package com.intNova.io;

/**
 * shows messages on screen
 * @author intNova by darwin gómez
 * @version 1.1
 */
public class Output {

    private Output() {
    }

    /**
     * gets only instance of the Output class
     * @return  returns only instance of the Output class
     */
    public static Output getInstance() {

        return new Output();
    }

    /**
     * write on screen without line jump
     * @param str receives a string of characters
     */
    public void write(String str) {
        System.out.print(str);

    }

    /**
     * write on screen with line break
     * @param str receives a string of characters
     */
    public void writeln(String str) {
        System.out.println(str);

    }

    /**
     * write a line break
     */
    public void writeln() {
        System.out.println();

    }

}
