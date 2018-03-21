package com.intNova.io;

/**
 * controls the instances of the Input and Output classes
 *
 * @author intNova by drwin g/omez
 * @version 1.1
 */
public class Control {

    /**
     * almacena la instancia de la clase Input
     */
    public static Input in = Input.getIstance();
    /**
     * almacena la instancia de la clase Output
     */
    public static Output out = Output.getInstance();

}
