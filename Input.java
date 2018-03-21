package com.intNova.io;

// <editor-fold defaultstate="collapsed" desc="use of bookstores">
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
// </editor-fold>

/**
 * handles data entered from the keyboard with exception handling to all common
 * data types
 *
 * @author intNova by darwin gómez
 * @version 1.1
 */
public class Input {

    private static boolean correct;
    private static int valueInt;
    private static float valueFlt;
    private static double valueDbl;
    private static String valueStr;
    private static char valueChr;
    private static boolean valueBool;
    private static BufferedReader br;

    private Input() {
        br = new BufferedReader(new InputStreamReader(System.in));

    }

    /**
     * gets only instance of the input class
     *
     * @return returns only instance of the Input class
     */
    public static Input getIstance() {

        return new Input();
    }

    /**
     * read integer values
     *
     * @return returns an integer value
     */
    public int readInt() {
        correct = false;
        do {

            try {
                valueInt = Integer.parseInt(br.readLine());
                correct = false;

            } catch (NumberFormatException nfe) {
                out.print("Please enter a correct integer numeric value_> ");
                correct = true;
                nfe.getMessage();

            } catch (IOException ioe) {
                correct = true;
                ioe.getMessage();
            }

        } while (correct);

        return valueInt;
    }

    /**
     * reads floating values
     *
     * @return returns a floating value
     */
    public float readFlt() {
        correct = false;
        do {

            try {
                valueDbl = Double.parseDouble(br.readLine());
                correct = false;

            } catch (NumberFormatException nfe) {
                out.print("Please enter a correct floating numerical value_> ");
                correct = true;
                nfe.getMessage();

            } catch (IOException ioe) {
                correct = true;
                ioe.getMessage();
            }

        } while (correct);

        return valueFlt;
    }

    /**
     * reads floating double values
     *
     * @return returns a double floating value
     */
    public double readDbl() {
        correct = false;
        do {

            try {
                valueDbl = Double.parseDouble(br.readLine());
                correct = false;

            } catch (NumberFormatException nfe) {
                out.print("Please enter a correct double floating value_> ");
                correct = true;
                nfe.getMessage();

            } catch (IOException ioe) {
                correct = true;
                ioe.getMessage();
            }

        } while (correct);

        return valueDbl;
    }

    /**
     * read character strings
     *
     * @return returns a string of characters
     */
    public String readStr() {
        correct = false;
        do {

            try {
                valueStr = br.readLine();
                correct = false;

            } catch (IOException ioe) {
                correct = true;
                ioe.getMessage();
            }

        } while (correct);

        return valueStr;
    }

    /**
     * read a character
     *
     * @return returns a character
     */
    public char readChr() {
        correct = false;
        do {

            try {
                valueChr = (char) br.read();
                correct = false;

            } catch (IOException ioe) {
                out.print("Please enter a correct character_> ");
                correct = true;
                ioe.getMessage();
            }

        } while (correct);

        return valueChr;
    }

    /**
     * read a boolean value
     *
     * @return returns value logic
     */
    public boolean readBool() {
        
        String beforBool = null;
        try {
            beforBool = br.readLine();
        } catch (IOException ex) {
            ex.getMessage();
        }

        while (!beforBool.equals("true") && !beforBool.equals("false")) {
            out.print("Please enter a correct boolean value_> ");
            try {
                beforBool = br.readLine();
            } catch (IOException ex) {
                ex.getMessage();
            }
        }
        
        valueBool = Boolean.valueOf(beforBool);
        return valueBool;
    }

}

/*
        boolean logic;

        System.out.print("Enter boolean value_> ");
        String beforBool = null;
        try {
            beforBool = br.readLine();
        } catch (IOException ex) {
            ex.getMessage();
        }
        while (!beforBool.equals("true") && !beforBool.equals("false")) {
            System.out.print("Please enter correct boolean value_> ");
            try {
                beforBool = br.readLine();
            } catch (IOException ex) {
                ex.getMessage();
            }
        }
        logic = Boolean.valueOf(beforBool);
        System.out.print("The value is " + logic + "\n");
*/